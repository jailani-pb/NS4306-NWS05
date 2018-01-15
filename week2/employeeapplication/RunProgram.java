package week2.employeeapplication;

public class RunProgram {

	public static void main(String[] args) {
		Employee employee1 = new Employee("Jailani", 35);
		System.out.println(employee1);
		employee1.editAge(75);
		System.out.println(employee1);
		System.out.println(employee1.getNumberEmployee());
		Employee employee2 = new Employee("Rahman", 60);
		System.out.println(employee2);
		System.out.println(employee2.getNumberEmployee());
		
		System.out.println(employee1);
		System.out.println(employee1.getNumberEmployee());
	}
	
}
