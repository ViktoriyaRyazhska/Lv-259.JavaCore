package task2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PersonCreator {

    private BufferedReader reader;

    public PersonCreator(){
        reader = new BufferedReader(new InputStreamReader(System.in));
    }

    public Person createPerson() throws IOException {
        String name;
        int birthdaYear;
        System.out.println("Please enter the name of person:");
        name = reader.readLine();
        System.out.println("Please enter the birthday year of person:");
        String year = reader.readLine();
        System.out.println();
        birthdaYear = Integer.parseInt(year);
        return new Person(name, birthdaYear);
    }
}
