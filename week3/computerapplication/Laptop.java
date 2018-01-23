package week3.computerapplication;

public class Laptop extends Portable {

	boolean sleeping;
	
	public Laptop(String operatingSystem) {
		super(operatingSystem);
		sleep();
	}
	
	public void sleep() {
		sleeping = true;
	}
	
	public void wakeup() {
		sleeping = false;
	}

}
