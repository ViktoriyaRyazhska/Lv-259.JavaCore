package com.pack2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {

		// Enter 5 integer numbers. Find position of second positive number //

		int[] mass2 = { -11, 2, -15, 85, 6 };
		int positiveNumber = 0;
		for (int i = 0; i < mass2.length; i++) {
			if (mass2[i] > 0) {
				positiveNumber++;
			}
			if (positiveNumber == 2) {
				System.out.println("The position of second positive number is " + i + " and it's value is " + mass2[i]);
			}
		}

		// minimum and its position in array //

		int min = mass2[0];
		int imin = 0;
		for (int i = 0; i < mass2.length; i++) {
			if (mass2[i] < 0) {
				min = mass2[i];
				imin = i;
			}

		}
		System.out.println("Minimum value is " + min + " and its position is " + imin);

		// Organize entering integers until the first negative number. Count the
		// product of all entered even numbers //

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int[] mass3 = new int[10];
		for (int i = 0; i < mass3.length; i++) {
			System.out.println("Enter a number");
			int num = Integer.parseInt(br.readLine());
			if (num > 0) {
				mass3[i] = num;
			} else {
				break;
			}
		}
		int product = 1;
		for (int i = 0; i < mass3.length; i++) {
			if (mass3[i] > 0) {
				product = product * mass3[i];
			}

		}
		System.out.println("Product = " + product);
	}
}
