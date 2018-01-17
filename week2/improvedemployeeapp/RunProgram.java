package week2.improvedemployeeapp;

public class RunProgram {

	public static void main(String[] args) {
		System.out.println(Employee.getNumberEmployee());
		Employee employee1 = new Employee("Jailani", 1984);
		System.out.println(employee1);
		System.out.println(employee1.getEmployeeAge());
		Employee employee2 = new Employee("Rahman", 1960);
		System.out.println(employee2);
		System.out.println(employee2.getEmployeeAge());
		System.out.println(employee2.getEmployeeAge(2010));
	}
	
}
