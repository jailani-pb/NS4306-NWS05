package week6.datastructures;

import java.util.LinkedHashMap;

public class LearningLinkedHashMap {

	public static void main(String[] args) {
		LinkedHashMap<String, String> countries = 
				new LinkedHashMap<String, String>();
		
		countries.put("Brunei", "Bandar Seri Begawan");
		System.out.println(countries);
		System.out.println(
				countries.put("Malaysia", "Kuala Lumpur"));
		System.out.println(countries);
		System.out.println(
				countries.put("Malaysia", "Johor"));
		System.out.println(countries);
		
		System.out.println(
				countries.putIfAbsent("Indonesia", "Jakarta"));
		System.out.println(countries);
		System.out.println(
				countries.putIfAbsent("Indonesia", "Bandung"));
		System.out.println(countries);
		
		System.out.println(
				countries.putIfAbsent("Cambodia", "Phnom Penh"));
		System.out.println(countries);
		
		System.out.println(countries.remove("Malaysia"));
		System.out.println(countries);
		System.out.println(
				countries.remove("Brunei", "Pekan Tutong"));
		System.out.println(countries);
		
		System.out.println(countries.replace("Indonesia", "Bandung"));
		System.out.println(countries);
		System.out.println(countries.replace("Thailand", "Bangkok"));
		System.out.println(countries);
		
		System.out.println(
				countries.replace("Indonesia", "Bandung", "Jakarta"));
		System.out.println(countries);
		
		System.out.println(countries.get("Brunei"));
		System.out.println(countries.get("Timor Leste"));
		
		System.out.println(countries.containsKey("Timor Leste"));
		System.out.println(countries.containsKey("Indonesia"));
		
		System.out.println(countries.containsValue("Jakarta"));
		System.out.println(
				countries.containsValue("bandar seri begawan"));
		
		System.out.println(countries.keySet());
		System.out.println(countries.values());
		System.out.println(countries.size());
	}
	
}
