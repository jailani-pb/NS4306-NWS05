package week5.datastructures;

import java.util.LinkedList;
import java.util.ListIterator;

public class LearningLinkedList {

	public static void main(String[] args) {
		LinkedList<String> nameList = new LinkedList<String>();
		// Add data to LinkedList
		nameList.add("Jailani");
		nameList.add("Abdul");
		nameList.addFirst("Rahman");
		
		for(String name : nameList) {
			System.out.print(name + " ");
		}
		System.out.println();
		
		ListIterator<String> nameIterator = nameList.listIterator();
		// Add data to LinkedList using ListIterator
		nameIterator.add("Haji");
		// Remove data from LinkedList using ListIterator
		nameIterator.next();
		nameIterator.remove();
		nameIterator.next();
		nameIterator.next();
		nameIterator.remove();
		if(nameIterator.hasNext()) {
			nameIterator.next();			
		}
		
		for(String name : nameList) {
			System.out.print(name + " ");
		}
		System.out.println();
		
		// Retrieve element in LinkedList
		System.out.println(nameIterator.previous());
		// Edit data in LinkedList using ListIterator
		nameIterator.set("Rahman");
		
		for(String name : nameList) {
			System.out.print(name + " ");
		}
		System.out.println();
	}
	
}
