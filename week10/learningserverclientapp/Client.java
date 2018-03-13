package week10.learningserverclientapp;

import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

public class Client {

	public static void main(String[] args) {
		try {
			Socket socket = new Socket("localhost", 9101);			
			System.out.println("Connected to the server.");
			
			DataOutputStream toServer =
					new DataOutputStream(socket.getOutputStream());
			
			Scanner scanner = new Scanner(System.in);
			
			while(true) {
				System.out.println("Please input message to server.");
				String message = scanner.nextLine();
				toServer.writeUTF(message);
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
}
