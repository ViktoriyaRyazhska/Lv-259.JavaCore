package com.mapPersons;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
//task 2
		Scanner sc = new Scanner(System.in);
		
		// Create map personMap and add to it ten persons of type <String,
		// String> (lastName, firstName)

		Map<String, String> personsMap = new HashMap<String, String>();

		personsMap.put("Ivanov", "Petro");
		personsMap.put("Ivanova", "Paula");
		personsMap.put("Ivanovich", "Anna");
		personsMap.put("Ivanok", "Kate");
		personsMap.put("Petrov", "Pavlo");
		personsMap.put("Bobobv", "Pet");
		personsMap.put("Kozakov", "Bob");
		personsMap.put("Shustov", "Kozak");
		personsMap.put("Tayson", "Petro");
		personsMap.put("Another", "Orest");

		// Output the entities of the map on the screen

		Set<Entry<String, String>> setMap = personsMap.entrySet();

		Iterator<Entry<String, String>> iter = setMap.iterator();
		while (iter.hasNext()) {
			System.out.println(iter.next());
		}
		
		System.out.println();
		
		// Are there at less two persons with the same firstName among these 10
		// people?

		List<String> values = new ArrayList<>();
		
		String name = "";
		 
        for(Map.Entry<String,String> entry:personsMap.entrySet()){
            if(values.contains(entry.getValue())){
                name +=entry.getValue();
            }else{
                values.add(entry.getValue());
            }
        }
        
       System.out.println("Coincidence in name " + name);
       
    // Remove from the map person whose firstName is ”Orest” (or other) 
       
       List<String> keys = new ArrayList<>();
       
       System.out.println("Input a person's first name U want to delete ");
       String inputFirstNAme = sc.nextLine();
       
       for(Map.Entry<String,String> entry:personsMap.entrySet()){
    	   if(inputFirstNAme.equalsIgnoreCase(entry.getValue())){
    		   keys.add(entry.getKey());
    	   }
       }
       
       for(String key:keys){
           personsMap.remove(key);
       }
       System.out.println(personsMap + " ");    
 	
   }
	}

