package week1exercise.employeeapplication;

public class Employee {
	
	String firstName;
	String lastName;
	double monthlySalary;
	
	public double calculateYearlySalary() {
		return 12 * monthlySalary;
	}
	
	public void raiseSalary(double percentage) {
		double raise = percentage / 100.00 * monthlySalary;
		monthlySalary += raise;
	}
	
}
