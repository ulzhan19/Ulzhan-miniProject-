package Ulzhan;

import java.io.ObjectInputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args){
         try{
             ServerSocket server = new ServerSocket(1987);//Получается наш сервер всегда будет доступен для каждого клиента.
             System.out.println("WAITING FOR CLIENT");
             while (true){
                 Socket socket = server.accept();
                 System.out.println("CLIENT CONNECTED");
                 ClientHandler ch = new ClientHandler(socket);// Для того чтобы можно было подключать несколько клиентов используйте потоки.
                 ch.start();
             }
        }catch(Exception e){
            e.printStackTrace();}



}}
