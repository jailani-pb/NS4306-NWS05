package week4.studentapplication;

public class Student {

	private int id;
	private String name;
	private int age;
	private static int numberStudents;
	
	public Student(String name, int age) {
		numberStudents++;
		this.id = numberStudents;
		this.name = name;
		setAge(age);
	}
	
	public int getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		if(age >= 18 && age <= 40) {
			this.age = age;
		} else {
			this.age = 18;
		}
	}
}


