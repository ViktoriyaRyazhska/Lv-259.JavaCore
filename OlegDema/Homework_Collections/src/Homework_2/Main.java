package Homework_2;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Main {

	public static void main(String[] args) {

		Map<String, String> map = new HashMap<>();
		map.put("Dema", "Oleg");
		map.put("Gavr", "Rostuk");
		map.put("Gaf", "Yura");
		map.put("Kulik", "Oleg");
		map.put("Koval", "Sasha");
		map.put("Nozdrin", "Mark");
		map.put("Pavl", "Olex");
		map.put("Shev", "Gena");
		map.put("Konopatov", "Tim");
		map.put("Lubuskiy", "Oleg");

		for (Map.Entry<String, String> entry : map.entrySet()) {
			System.out.println(entry.getKey() + "  " + entry.getValue());
		}

		System.out.println();
		System.out.println();

		int check = 0;
		boolean exist = false;
		List<String> mapValue = new LinkedList<>(map.values());

		for (String value : mapValue) {
			Iterator<String> iterator = mapValue.iterator();
			while (iterator.hasNext()) {
				String string = (String) iterator.next();
				if (value.equals(string)) {
					check++;
				}
				if (check > 1) {
					exist = true;
					break;
				} else {
					check = 0;
				}
			}
		}

		if (exist) {
			System.out.println("DETECTED TWO SAME FIRST NAME");
		} else {
			System.out.println("UNDETECTED TWO SAME FIRST NAME");
		}

		System.out.println();
		System.out.println();

		String valueToRemove = "Oleg";

		for (Iterator<Map.Entry<String, String>> iter = map.entrySet().iterator(); iter.hasNext();) {
			Map.Entry<String, String> entry = iter.next();
			if (valueToRemove.equals(entry.getValue())) {
				iter.remove();
			}
		}
		for (Map.Entry<String, String> entry : map.entrySet()) {
			System.out.println(entry.getKey() + "  " + entry.getValue());
		}

	}

}
