package week11.learningthreads;

public class RunProgram {

	public static void main(String[] args) {
		Message jailani = new Message("Jailani");
		Message abdul = new Message("Abdul");
		Message rahman = new Message("Rahman");
		
//		jailani.run();
//		abdul.run();
//		rahman.run();
		
		new Thread(jailani).start();
		new Thread(abdul).start();
		new Thread(rahman).start();
	}
	
}
