package week1.carapplication;

public class Car {
	
	String brand;
	String model;
	String colour;
	int currentSpeed = 0;
	Wheels wheels;
	
	public void pressAccelerator() {
		int speedModifier = wheels.size / 2;
		currentSpeed += 5 + speedModifier;
	}
	
	public void pressBrake() {
		// implement brakeModifier with int data type
		
		// set the value of brakeModifier with the value
		// of wheels brakeSpeed.
		int brakeModifier = wheels.brakeSpeed;
		// Decrement currentSpeed with the brakeModifier
		currentSpeed -= brakeModifier;
		// Challenge: Prevent currentSpeed from
		// decremented to negative value.
		if(currentSpeed < 0) {
			currentSpeed = 0;
		}
	}

	@Override
	public String toString() {
		return "Car [brand=" + brand + ", model=" + model + ", colour=" + colour + ", currentSpeed=" + currentSpeed
				+ ", wheels=" + wheels + "]";
	}
	
}
