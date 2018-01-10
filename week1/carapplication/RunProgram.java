package week1.carapplication;

public class RunProgram {

	public static void main(String[] args) {
		Wheels wheels1 = new Wheels();
		wheels1.brand = "Continental";
		wheels1.size = 20;
		wheels1.brakeSpeed = 4;
		
		Wheels wheels2 = new Wheels();
		wheels2.brand = "LingLong";
		wheels2.size = 16;
		wheels2.brakeSpeed = 1;
		
		Car car1 = new Car();
		car1.brand = "Ford";
		car1.model = "Focus ST";
		car1.colour = "Blue";
		car1.wheels = wheels1;
		Car car2 = new Car();
		car2.brand = "Toyota";
		car2.model = "Kijang";
		car2.colour = "White";
		car2.wheels = wheels2;
		printCarDetails(car2);
		printCarDetails(car1);
		car1.colour = "White";
		printCarDetails(car1);
		
		car2.wheels.size = 10;
		car1.pressAccelerator();
		printCarDetails(car1);
		printCarDetails(car2);
		
	}
	
	public static void printCarDetails(Car car) {
		System.out.println(car.brand + " " +
				car.model + " " + car.colour
				+ " - Current Speed " 
				+ car.currentSpeed);
	}
	
}
