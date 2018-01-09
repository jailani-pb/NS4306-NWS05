package week1.carapplication;

public class RunProgram {

	public static void main(String[] args) {
		Car car1 = new Car();
		car1.brand = "Ford";
		car1.model = "Focus ST";
		car1.colour = "Blue";
		Car car2 = new Car();
		car2.brand = "Toyota";
		car2.model = "Kijang";
		car2.colour = "White";
		printCarDetails(car2);
		printCarDetails(car1);
		car1.colour = "White";
		printCarDetails(car1);
		
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
