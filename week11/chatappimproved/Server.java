package week11.chatappimproved;

import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;

public class Server {

	public static void main(String[] args) {
		try {
			ServerSocket serverSocket = new ServerSocket(9101);
			System.out.println("Server started on " + new Date());
			
			while(true) {
				Socket client1 = serverSocket.accept();				
				Socket client2 = serverSocket.accept();
				
				ChatSession chatSession = 
						new ChatSession(client1, client2);
				
				new Thread(chatSession).start();
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
}
