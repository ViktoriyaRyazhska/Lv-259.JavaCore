package task5;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Car[] car = new Car[4];
		car[0] = new Car("Sedan", "BMW", 2003, 231.0);
		car[1] = new Car("Universal", "Audi", 2001, 241.0);
		car[2] = new Car("Hatchback", "Lexus", 2015, 415.5);
		car[3] = new Car("Coupe", "Hyundai", 2007, 190);
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the year of car");
		int year = sc.nextInt();
		for(int i = 0; i < car.length; i++) {
			if (car[i].getYearOfProduct() == year) {
				System.out.println(car[i].getNameOfCar() + " - " + car[i].getType() + ", " + car[i].getEngineCapacity() + "\n");
			} else {
				System.out.println("There are no cars with such " + year + " year's release\n");
			}
		}

		Car cars;
		for (int i = 0; i < car.length; i++) {
			for (int j = 0; j < car.length; j++) {
				if (car[i].getYearOfProduct() < car[j].getYearOfProduct()) {
					cars = car[i];
					car[i] = car[j];
					car[j] = cars;
				}
			}
		}
		
		System.out.println("Ordered cars by year of production: ");
		for (int i = 0; i < car.length; i++) {
			System.out.println("\t" + car[i]);
		}


	}

}
