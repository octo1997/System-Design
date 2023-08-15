package socketProgramming;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Client {

	public static void main(String[] args) throws UnknownHostException, IOException {
		// TODO Auto-generated method stub
		Socket socket = new Socket("localhost", 8080);
		
//		Student student = new Student("Shubham");
		String student = "Shubham";
		ObjectOutputStream objectOutputStream = new ObjectOutputStream(socket.getOutputStream());
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			String str = scanner.next();
			objectOutputStream.writeObject(str);
			if(str.equals("QUIT")) break;
		}
		
		
		scanner.close();
		objectOutputStream.close();
		socket.close();

	}

}
