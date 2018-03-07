package week9.learningobjectstream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class LearningObjectOutputStream {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		try(ObjectOutputStream output =
				new ObjectOutputStream(
						new FileOutputStream("object.dat", false))) {
			School sict = new School("SICT",
					"School of Information and Communication Technologies");
			School sbs = new School("SBS", "School of Business");
			
			Student student1 = new Student(1, "ABC", sict);
			Student student2 = new Student(2, "EFG", sict);
			Student student3 = new Student(3, "HIJ", sbs);
			
			output.writeObject(student1);
			output.writeObject(student2);
			output.writeObject(student3);
		}
	}
	
}
