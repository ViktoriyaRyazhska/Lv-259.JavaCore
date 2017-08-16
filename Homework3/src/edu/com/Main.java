package edu.com;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
		Dog[] dog = new Dog[3];
		for (int i = 0; i < dog.length; i++) {
			dog[i] = new Dog();
			dog[i].inputInfo(read);
		}

		System.out.print(dog[0].checkEquality(dog[1]));
		System.out.print(dog[1].checkEquality(dog[2]));
		System.out.print(dog[0].checkEquality(dog[2]));

		Dog oldest = dog[0];
		for (int i = 0; i < dog.length; i++) {
			if (oldest.getAge() < dog[i].getAge()) {
				oldest = dog[i];
			}
		}
		System.out.println("\n\n\t===The oldest dog===\n" + oldest);

	}
}
