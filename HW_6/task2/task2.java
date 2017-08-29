package task2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class task2 {

	public static void main(String[] args) {
		
		Map<String, String> person = new HashMap<String, String>();
		person.put("Piccolo", "Caprice");
		person.put("Marlatt", "Harley");
		person.put("Boring", "Erwin");
		person.put("Wessels", "Chuck");
		person.put("Peel", "Pham");
		person.put("Mendelsohn", "Taisha");
		person.put("Kirwan", "Harley");
		
		System.out.println("Information about person");
		for (Map.Entry<String, String> entry : person.entrySet()) {
			System.out.println("\tPerson [First Name= " + entry.getValue() + ", Second Name= " + entry.getKey() + "]");
		}
		
		List<String> values = new ArrayList<>();
		String sameName = "";
		int n = 0;
		for (Map.Entry<String, String> entry : person.entrySet()) {
			if (values.contains(entry.getValue())) {
				sameName += entry.getValue() + " ";
				n++;
			} else {
				values.add(entry.getValue());
			}
		}
       // if more than 2 identical are found - print ... the same First Name Harley Harley among ... (name repeat record)
		System.out.println("There is (are) " + n + " person(-s) with the same First Name " + sameName + "among these " + person.size() + " people");
		
		System.out.println("Enter the first name what you want to delete:");
        Scanner sc = new Scanner(System.in);
		String firstName = sc.nextLine();
		List<String> keys = new ArrayList<>();
		for (Map.Entry<String, String> entry : person.entrySet()) {
			if (firstName.equals(entry.getValue())) {
				keys.add(entry.getKey());
			} 
		}
	
		for (String key : keys) {
			person.remove(key);
		}
		
		System.out.println("Information about person after remove");
		for (Map.Entry<String, String> entry : person.entrySet()) {
			System.out.println("\tPerson [First Name= " + entry.getValue() + ", Second Name= " + entry.getKey() + "]");
		}
		
		sc.close();
	}

}
