package week5.datastructures;

import java.util.ArrayList;

public class LearningArrayList {

	public static void main(String[] args) {
		ArrayList<String> nameList = new ArrayList<String>();
		// Adding data to an ArrayList
		nameList.add("Jailani");
		nameList.add("Rahman");
		nameList.add("Abu");
		nameList.add("Bakar");
		nameList.add(1, "Abdul");
		
		for(String name : nameList) {
			System.out.print(name + " ");
		}
		System.out.println();
		
		// Editing data from ArrayList
		nameList.set(3, "Fatimah");
		
		for(String name : nameList) {
			System.out.print(name + " ");
		}
		System.out.println();
		
		// Remove data from ArrayList
		nameList.remove(1);
		nameList.remove("Bakar");
		
		for(String name : nameList) {
			System.out.print(name + " ");
		}
		System.out.println();
		
		// Retrieve data from ArrayList
		System.out.println(nameList.get(0));
		// Retrieving data in index that does not contain any data
		// will produce and IndexOutOfBoundsException
//		System.out.println(nameList.get(6));
		
		// Retrieve length (size) of the ArrayList
		System.out.println(nameList.size());
	}
	
}
