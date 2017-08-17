package homework4.task5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		Car[] cars = new Car[4];
		for (int i = 0; i < cars.length; i++) {
			cars[i] = new Car();
			cars[i].inputInfo(reader);
		}
		System.out.println("\nSelect cars by year");
		System.out.print("Enter the year of production:");
		int prodYear = Integer.parseInt(reader.readLine());
		System.out.println("Cars of " + prodYear + " production:");
		for (int i = 0; i < cars.length; i++) {
			if (prodYear == cars[i].getYear()) {
				System.out.println(cars[i]);
			}
		}

		System.out.println("\nSorting by year:");
		Car temp = new Car();
		for (int i = 0; i < cars.length - 1; i++) {
			for (int j = i + 1; j < cars.length; j++) {
				if (cars[i].getYear() > cars[j].getYear()) {
					temp = cars[i];
					cars[i] = cars[j];
					cars[j] = temp;
				}
			}
		}
		for (int i = 0; i < cars.length; i++) {
			System.out.println(cars[i]);
		}
	}

}
