package aven.sixth.homework;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Objects;
import java.util.Scanner;

public class TaskTwo {

	/*
	 * 
Create map personMap and add to it ten persons of type <String, String> (lastName, firstName).
Output the entities of the map on the screen. 

There are at less two persons with the same firstName among these 10 people?
Remove from the map person whose firstName is ”Orest” (or other). Print result. 
	 */
	public static void main(String[] args) {

		HashMap <String, String> personMap = new HashMap<String, String>();
		
		personMap.put("First", "Fred");
		personMap.put("Second", "Iona");
		personMap.put("Third", "Viktor");
		personMap.put("Forth", "Emily");
		personMap.put("Fifth", "Kate");
		personMap.put("Sixth", "George");
		personMap.put("Seventh", "Fred");
		personMap.put("Eighth", "Orest");
		personMap.put("Nineth", "Oleg");
		personMap.put("Tenth", "Natalya");
		
		//outputing Map entities
		for (Map.Entry<String, String> entry: personMap.entrySet()) {
			String lastName = entry.getKey();
			String firstName = entry.getValue();
			
			System.out.println(lastName + " " + firstName);
		}
		
		//find same names
		
		 System.out.println(" ");
		 System.out.println("Values met more that once:");
		
		String[] values = personMap.values().toArray(new String[personMap.size()]); //can use comparable-comparator instead?
		String[] equalValues = new String[10];
		
		for (int i = 0; i <values.length; i++) {
			for (int j = i + 1; j < values.length; j++) {
				if (values[i].equals(values[j])) {
					equalValues[i] = values[i];
				}
			}
			if (equalValues[i] != null ) {
			System.out.println(equalValues[i]);}
		}
		
	
		//remove entity
		
		//mapA.remove(Object key);
		
		System.out.println("Plese, enter the calue to delete:");
		Scanner sc = new Scanner(System.in);
		String name = sc.nextLine();
		sc.close();
		
		List<String> keys = new ArrayList<String>();
		
		for (Entry<String, String> entry: personMap.entrySet()) {
			if(Objects.equals(name, entry.getValue())) {
				keys.add(entry.getKey());
			}
		}
	
		for (String key: keys) {
			personMap.remove(key);
		}
		
		for (Map.Entry<String, String> entry: personMap.entrySet()) {
			String lastName = entry.getKey();
			String firstName = entry.getValue();
			
			System.out.println(lastName + " " + firstName);
		}
		
	}
}

