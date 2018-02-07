package week5.datastructures;

import java.util.Iterator;
import java.util.TreeSet;

public class LearningTreeSet {

	public static void main(String[] args) {
		TreeSet<String> countryList = new TreeSet<String>();
		// Add data to HashSet
		countryList.add("Brunei");
		countryList.add("Singapore");
		countryList.add("Malaysia");
		countryList.add("Thailand");
		countryList.add("Cambodia");
		countryList.add("Brunei");

		System.out.println(countryList);

		// Remove data from HashSet
		countryList.remove("Malaysia");

		System.out.println(countryList);

		// Retrieve data from HashSet
		System.out.println(countryList.contains("Malaysia"));
		System.out.println(countryList.contains("Brunei"));
		System.out.println(countryList.contains("brunei"));

		// Retrieve all data from HashSet
		for(String country : countryList) {
			System.out.println(country);
		}

		Iterator<String> iterator = countryList.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}

}
