package week9.javainputoutput;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class LearningDataInputStream {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		try(DataInputStream input = 
				new DataInputStream(
						new FileInputStream("data.dat"))) {
//			System.out.println(input.readUTF());
//			System.out.println(input.readDouble());
//			System.out.println(input.readBoolean());
//			System.out.println(input.readUTF());
//			System.out.println(input.readDouble());
//			System.out.println(input.readBoolean());
			while(input.available() != 0) {
				System.out.println(input.readUTF());
				System.out.println(input.readDouble());
				System.out.println(input.readBoolean());
			}
		}
	}
	
}
