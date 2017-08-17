package com.pack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {

		Month[] monthes = new Month[12];
		monthes[0] = new Month(1, 31);
		monthes[1] = new Month(2, 28);
		monthes[2] = new Month(3, 31);
		monthes[3] = new Month(4, 30);
		monthes[4] = new Month(5, 31);
		monthes[5] = new Month(6, 30);
		monthes[6] = new Month(7, 31);
		monthes[7] = new Month(8, 31);
		monthes[8] = new Month(9, 30);
		monthes[9] = new Month(10, 31);
		monthes[10] = new Month(11, 30);
		monthes[11] = new Month(12, 31);

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Input the number of month");
		int inputNumberOfMonth = Integer.parseInt(br.readLine());

		for (int i = 0; i < monthes.length; i++) {
			if (monthes[i].getNumberOfMonth() == inputNumberOfMonth) {
				System.out.println("There are " + monthes[i].getDay() + " days in month number " + inputNumberOfMonth);
			}
		}

		// Calculate the sum of first 5 elements if they are positive or product
		// of last 5 element in the other case //

		int[] mass = { -1, 4, 5, 56, 78, 63, -1, 8, 9, 11 };
		int sum = 0;
		int product = 1;

		for (int i = 0; i < mass.length - 5; i++) {
			if (mass[i] < 0) {
				break;
			} else if (mass[i] > 0) {
				sum += mass[i];
			}
		}
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
