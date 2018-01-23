package week3.computerapplication;

public class Computer {

	String operatingSystem;
	boolean powerStateOn;
	
	public Computer(String operatingSystem) {
		this.operatingSystem = operatingSystem;
		shutDown();
	}
	
	public void bootUp() {
		powerStateOn = true;
	}
	
	public void shutDown() {
		powerStateOn = false;
	}
	
	public void restart() {
		powerStateOn = false;
		powerStateOn = true;
	}
	
}
