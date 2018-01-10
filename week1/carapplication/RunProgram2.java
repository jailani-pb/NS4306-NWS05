package week1.carapplication;

public class RunProgram2 {

	public static void main(String[] args) {
		Wheels wheels1 = new Wheels();
		wheels1.brand = "Pirelli";
		wheels1.size = 18;
		wheels1.brakeSpeed = 2;
		Wheels wheels2 = new Wheels();
		wheels2.brand = "Bridgestone";
		wheels2.size = 20;
		wheels2.brakeSpeed = 5;

		Car car1 = new Car();
		car1.brand = "Toyota";
		car1.model = "Prius";
		car1.colour = "Blue";
		car1.wheels = wheels1;
		Car car2 = new Car();
		car2.brand = "Hyundai";
		car2.model = "Tucson";
		car2.colour = "Red";
		car2.wheels = wheels1;
		Car car3 = new Car();
		car3.brand = "Honda";
		car3.model = "Accord";
		car3.colour = "Brown";
		car3.wheels = wheels2;
		
		System.out.println(car1);
		System.out.println(car2);
		System.out.println(car3);
		
	}
	
}
