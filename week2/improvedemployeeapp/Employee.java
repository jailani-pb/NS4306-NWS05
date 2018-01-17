package week2.improvedemployeeapp;

import java.time.LocalDate;

public class Employee {

	final int MIN_AGE_LIMIT = 18;
	final int MAX_AGE_LIMIT = 60;
	
	int id;
	String name;
	private int yearOfBirth;
	private static int countEmployee = 0;
	
	public Employee(String name, int yearOfBirth) {
		this.name = name;
		this.editYearOfBirth(yearOfBirth);
		countEmployee++;
		this.id = countEmployee;
	}
	
	public void editYearOfBirth(int yearOfBirth) {
		// Local variable
		LocalDate now = LocalDate.now();
		LocalDate minimumYearOfBirth = now.minusYears(MIN_AGE_LIMIT);
		LocalDate maximumYearOfBirth = now.minusYears(MAX_AGE_LIMIT);
		if(yearOfBirth >= maximumYearOfBirth.getYear() 
				&& yearOfBirth <= minimumYearOfBirth.getYear()) {
			this.yearOfBirth = yearOfBirth;
		} else {
			this.yearOfBirth = minimumYearOfBirth.getYear();
		}
	}
	
	public int getEmployeeAge() {
		LocalDate now = LocalDate.now();
		LocalDate age = now.minusYears(yearOfBirth);
		return age.getYear();
	}
	
	public int getEmployeeAge(int inYear) {
//		// Complicated Way
//		// Retrieve the current date in your computer
//		LocalDate now = LocalDate.now();
//		// Calculate the age of the employee in a specific year
//		LocalDate ageDifference = now.minusYears(inYear);
//		LocalDate currentAge = now.minusYears(yearOfBirth);
//		// Return the age year
//		return currentAge.getYear() - ageDifference.getYear();
		
		// Simple way
		int age = inYear-yearOfBirth;
		return age;
	}
	
	public static int getNumberEmployee() {
		return countEmployee;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", yearOfBirth=" + yearOfBirth + "]";
	}
	
}
