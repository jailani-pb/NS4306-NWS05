package week1exercise.dateapplication;

public class RunProgram {

	public static void main(String[] args) {
		Date date1 = new Date();
		date1.day = 18;
		date1.month = 1;
		date1.year = 2018;
		
		System.out.println(date1.displayDate());
	}
	
}
