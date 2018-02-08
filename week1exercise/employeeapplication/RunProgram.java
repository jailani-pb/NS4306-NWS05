package week1exercise.employeeapplication;

public class RunProgram {

	public static void main(String[] args) {
		Employee employee1 = new Employee();
		employee1.firstName = "Abu";
		employee1.lastName = "Bakar";
		employee1.monthlySalary = 1518.90;
		
		System.out.println("Employee 1: " + employee1.firstName + " " + employee1.lastName);
		System.out.printf("Yearly Salary: %.2f\n", employee1.calculateYearlySalary());
		System.out.println("Giving raise by 10% to Employee1");
		employee1.raiseSalary(10);
		System.out.printf("Yearly Salary: %.2f\n", employee1.calculateYearlySalary());
	}
	
}