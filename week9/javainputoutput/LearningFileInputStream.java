package week9.javainputoutput;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class LearningFileInputStream {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		try(FileInputStream input = 
				new FileInputStream("test.dat")) {
			int value;
//			while((value = input.read()) != -1) {
//				System.out.println(value);
//			}
			value = input.read();
			while(value != -1) {
				System.out.println(value);
				value = input.read();
			}
		}
	}
	
}
