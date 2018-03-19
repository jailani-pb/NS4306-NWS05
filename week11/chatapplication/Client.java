package week11.chatapplication;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

public class Client {

	public static void main(String[] args) {
		try {
			Socket socket = new Socket("192.168.0.105", 9101);
			
			DataInputStream fromServer =
					new DataInputStream(socket.getInputStream());
			DataOutputStream toServer =
					new DataOutputStream(socket.getOutputStream());
			
			Scanner scanner = new Scanner(System.in);
			
			new Thread(new Runnable() {

				@Override
				public void run() {
					while(true) {
						try {
							if(fromServer.available() > 0) {
								String receivedMsg = fromServer.readUTF();
								System.out.println(">>> " + receivedMsg);
							}
						} catch (IOException e) {
							e.printStackTrace();
						}
					}
				}
				
			}).start();
			
			while(true) {
				String msg = scanner.nextLine();
				toServer.writeUTF(msg);
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
}



