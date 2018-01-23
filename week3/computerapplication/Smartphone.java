package week3.computerapplication;

public class Smartphone extends Portable {

	boolean displayOn;
	
	public Smartphone(String operatingSystem) {
		super(operatingSystem);
		switchOffDisplay();
	}
	
	public void switchOffDisplay() {
		displayOn = false;
	}
	
	public void switchOnDisplay() {
		displayOn = true;
	}
	
	@Override
	public void bootUp() {
		super.bootUp();
		switchOnDisplay();
	}

}
