package socketProgramming;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;

public class Server {
    public static void main(String[] args) throws UnknownHostException, IOException, ClassNotFoundException{
        ServerSocket serverSocket = new ServerSocket(8080);
        
        Socket socket = serverSocket.accept();
        
        ObjectInputStream objectInputStream = new ObjectInputStream(socket.getInputStream());
        
//        Student student = (Student)objectInputStream.readObject();
        while(true) {
        	String student = (String)objectInputStream.readObject();
            
            System.out.println("Client said " + student);
            
            if(student == "QUIT") {
            	break;
            }
        }
        
        objectInputStream.close();
        socket.close();
        
    }
}