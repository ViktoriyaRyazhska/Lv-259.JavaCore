package aven.second.homework;

import java.io.IOException;

public class MainForSecondHomework {

	public static void main(String[] args) throws IOException {
		
		Person first = new Person();
		Person second = new Person();
		Person third = new Person();
		Person forth = new Person();
		Person fifth = new Person("Alice", 1983);
		
		third.setName("Third");
		third.setBirthYear(1987);
		
		forth.setName("Forth");
		forth.setBirthYear(1984);

		first.input();
		second.input();
		
		first.output();
		second.output();
		third.output();
		forth.output();
		fifth.output();
		
	}
}


