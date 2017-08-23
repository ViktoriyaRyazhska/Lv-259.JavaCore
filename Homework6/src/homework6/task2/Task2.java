package homework6.task2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Task2 {

	public static void main(String[] args) {
		Map<String, String> personMap = new HashMap<>();

		personMap.put("Hil", "Andrii");
		personMap.put("Feduk", "Yurii");
		personMap.put("Polulikh", "Orest");
		personMap.put("Romanyuk", "Anatolii");
		personMap.put("Balian", "Andrii");
		personMap.put("Bilevich", "Volodimir");
		personMap.put("Vakharik", "Vasia");
		personMap.put("Danilyak", "Nazar");
		personMap.put("Sekh", "Nazar");
		personMap.put("Yunko", "Oleg");

		System.out.println("===List of all students=== ");
		for (Map.Entry<String, String> entry : personMap.entrySet()) {
			System.out.println("Student : " + entry.getKey() + " " + entry.getValue());
		}

		List<String> values = new ArrayList<>();

		String similarNames = "";

		for (Map.Entry<String, String> entry : personMap.entrySet()) {
			if (values.contains(entry.getValue())) {
				similarNames += entry.getValue() + "; ";
			} else {
				values.add(entry.getValue());
			}
		}
		System.out.println("\nRepeating names : " + similarNames);
		System.out.println("\n===Deleting students with name Andrii===");
		String firstName = "Andrii";
		List<String> keys = new ArrayList<>();
		for (Map.Entry<String, String> entry : personMap.entrySet()) {
			if (firstName.equals(entry.getValue())) {
				keys.add(entry.getKey());
			}
		}

		for (String key : keys) {
			personMap.remove(key);
		}

		for (Map.Entry<String, String> entry : personMap.entrySet()) {
			System.out.println("Student : " + entry.getKey() + " " + entry.getValue());
		}
	}
}
