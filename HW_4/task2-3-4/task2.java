package task2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		
		
		//int[] mass = new int [10];
		int sum = 0;
		int product = 1;
		int[] mass = { -1, 4, 5, 56, 78, 63, -1, 8, 9, 11 };
		//Scanner sc = new Scanner(System.in);
	//	System.out.println("Enter 10 integer numbers: ");
		for (int i = 0; i < mass.length - 5; i++) {
			//mass[i] = sc.nextInt();
			if (mass[i] < 0) {
				break;
			} else if (mass[i] > 0) {
				sum += mass[i];
			}
		}
		System.out.println(sum);
		if (sum > 0) {
			System.out.println("Sum = " + sum);
		}

		if (sum == 0) {
			for (int i = 5; i < mass.length; i++) {
				if (mass[i] > 0) {
					product = product * mass[i];
				}
			}
			System.out.println("Product = " + product);
		}

	}

}
