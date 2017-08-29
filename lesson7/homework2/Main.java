package regina.com;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        // write your code here
        Map<String, String> personMap = new HashMap<>();
        personMap.put("Lastovetskiy", "Semen");
        personMap.put("Yarmolystkiy", "Yan");
        personMap.put("Gzembovskiy", "Bogdan");
        personMap.put("Peluh", "Pavlo");
        personMap.put("Korzun", "Mar'yana");
        personMap.put("Mazurko", "Volodymyr");
        personMap.put("Yurkivskiy", "Pavlo");
        personMap.put("Dobrodiyv", "Orest");
        personMap.put("Koval", "Andriy");
        personMap.put("Malovetska", "Mariya");

        for (Map.Entry<String, String>  entry : personMap.entrySet()) {
            System.out.println(entry.getValue() + " " + entry.getKey());
        }

        boolean isMapContainsEqualsNames = false;
        for (Map.Entry<String, String>  entry : personMap.entrySet()) {
            String firstTempName = entry.getValue();
            String lastTempName = entry.getKey();
            for (Map.Entry<String, String> entry2 : personMap.entrySet()) {
                if (entry2.getValue().equals(firstTempName) && !entry2.getKey().equals(lastTempName)) {
                    isMapContainsEqualsNames = true;
                }
            }
        }
        System.out.println();
        if (isMapContainsEqualsNames) {
            System.out.println("map contains equals names");
        } else {
            System.out.println("map not contains equals names");
        }
        System.out.println();

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Please enter the name which you want to remove: ");

        String nameForRemove = bf.readLine();

        Set<String> removeSet = new HashSet<>();
        for (Map.Entry<String, String>  entry : personMap.entrySet()) {
            if (entry.getValue().equals(nameForRemove)) {
                removeSet.add(entry.getKey());
            }
        }
        for (String key : removeSet) {
            personMap.remove(key);
        }

        System.out.println();
        for (Map.Entry<String, String>  entry : personMap.entrySet()) {
            System.out.println(entry.getValue() + " " + entry.getKey());
        }
    }
}

    /*Create map personMap and add to it ten persons of type <String, String> (lastName, firstName).
        Output the entities of the map on the screen.
        There are at less two persons with the same firstName among these 10 people?
        Remove from the map person whose firstName is ”Orest” (or other). Print result. */


