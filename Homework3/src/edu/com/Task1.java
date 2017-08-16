package edu.com;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task1 {

	public static void main(String[] args) throws IOException {
		BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
		double[] array = new double[3];
		for (int i = 0; i < array.length; i++) {
			System.out.print("Enter " + (i + 1) + " float number: ");
			array[i] = Double.parseDouble(read.readLine());
		}
		for (int i = 0; i < array.length; i++) {
			if (array[i] <= (double) 5 && array[i] >= (double) -5) {
				System.out.println(array[i] + " belongs to the range");
			} else {
				System.out.println(array[i] + " doesn't belong to the range");
			}
		}
		
	}

}
