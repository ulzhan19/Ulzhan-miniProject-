package Ulzhan;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;

public class ClientHandler extends Thread {
    private Socket socket;

    public ClientHandler(Socket socket) {
        this.socket = socket;
    }

    public void run(){
        try{
            ObjectInputStream inputStream =
                    new ObjectInputStream(socket.getInputStream());
            ObjectOutputStream outputStream =
                    new ObjectOutputStream(socket.getOutputStream());


        }catch (Exception e ){
            e.printStackTrace();
        }
    }

}
