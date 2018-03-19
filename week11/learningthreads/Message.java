package week11.learningthreads;

public class Message implements Runnable {

	String name;
	
	public Message(String name) {
		this.name = name;
	}
	
	@Override
	public void run() {
		for(int i = 0; i < 20; i++) {
			System.out.println(name + " " + i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
