package week9.javainputoutput;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class LearningDataOutputStream {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		try(DataOutputStream output 
				= new DataOutputStream(
						new FileOutputStream("data.dat"))) {
			output.writeUTF("Jailani");
			output.writeDouble(70.0);
			output.writeBoolean(true);
			output.writeUTF("Rahman");
			output.writeDouble(80.1);
			output.writeBoolean(true);
		}
	}
	
}
