package com.pack3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TestCar {

	public static void main(String[] args) throws NumberFormatException, IOException {
		Car[] cars = new Car[4];
		cars[0] = new Car("hatchback", 2008, "KIA", 520.1);
		cars[1] = new Car("sedan", 2016, "Honda", 120.1);
		cars[2] = new Car("hatchback", 2001, "Mercedes", 520.1);
		cars[3] = new Car("jeep", 2017, "Subaru", 520.1);

		// Display cars certain model year (enter year in the console);

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the year of car");
		int inputYear = Integer.parseInt(br.readLine());
		for(int i = 0; i < cars.length; i++) {
			if (cars[i].getYear() == inputYear) {
				System.out.println("In " + inputYear + " was produced " + cars[i].getProduction() + ", "
						+ cars[i].getType() + " with " + cars[i].getEngineCapacity() + " engine capacity");
			} 
		}

		// Display cars ordered by the field year

		Car car;
		for (int i = 0; i < cars.length; i++) {
			for (int j = 0; j < cars.length; j++) {
				if (cars[i].getYear() < cars[j].getYear()) {
					car = cars[i];
					cars[i] = cars[j];
					cars[j] = car;
				}
			}
		}
		for (int i = 0; i < cars.length; i++) {
			System.out.println(cars[i]);
		}

	
	}

}
