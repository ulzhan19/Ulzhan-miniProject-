package Ulzhan;

import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static MainFrame frame;

    public static Students[] studentList = new Students[100];
    public static int sizeOfArray = 0;
    public static void main(String[] args){
        serverTodo();
        frame = new MainFrame();
        frame.setVisible(true);
        DBManager dbManager = new DBManager();
        dbManager.connect();
        Scanner in =new Scanner(System.in);

        while(true){
            System.out.println("PRESS 1 TO ADD Student");
            System.out.println("PRESS 2 TO LIST Student");
            System.out.println("PRESS 0 TO EXIT");
            String choice = in.next();

            if(choice.equals("1")){
                System.out.println("Insert name:");
                String name = in.next();
                System.out.println("Insert surname:");
                String surname = in.next();
                System.out.println("Insert age:");
                int age = in.nextInt();
                Students c = new Students(null,name, surname,age);
                dbManager.addItem(c);

            }else if(choice.equals("2")){
                ArrayList<Students> items = dbManager.getAllItems();
                for (Students c : items){
                    System.out.println(c);
                }

            }else if(choice.equals("0")){
                System.exit(0);
            }
        }




  }
    public static void serverTodo(){

        try{
            Socket socket = new Socket("127.0.0.1",1987);// Наше клиентовское приложение должно подключаться к серверу через определенный порт и IP адрес.
            ObjectOutputStream outputStream =
                    new ObjectOutputStream(socket.getOutputStream());
        }catch (Exception e ){
            e.printStackTrace();
        }
    }









}
