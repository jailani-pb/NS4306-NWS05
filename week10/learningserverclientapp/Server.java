package week10.learningserverclientapp;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketException;

public class Server {

	public static void main(String[] args) {
		try {
			ServerSocket serverSocket = new ServerSocket(9101);
			System.out.println("Waiting for client connection.");
			
			Socket client = serverSocket.accept();
			System.out.println("Client has connected.");
			
			DataInputStream fromClient =
					new DataInputStream(client.getInputStream());
			
			while(true) {
				System.out.println("Waiting for input from client.");
				String message = fromClient.readUTF();
				System.out.println(message);
			}
			
		} catch (SocketException e) {
			System.out.println("Client is disconnected.");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
}
