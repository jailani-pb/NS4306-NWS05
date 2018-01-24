package week3.computerapplication;

public class RunProgram {

	public static void main(String[] args) {
		Portable portableDevice = new Portable("Windows 10");
		System.out.println(portableDevice.operatingSystem);
		portableDevice.bootUp();
		portableDevice.chargeBattery(50);
		System.out.println(portableDevice.getBatteryPercentage());
		
		Smartphone smartphone = new Smartphone("Android");
		smartphone.bootUp();
	}
	
}
