package homework4.task2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task2 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int[] array = new int[10];
		System.out.println("===Enter 10 integer numbers===");
		for (int i = 0; i < array.length; i++) {
			System.out.print("Enter " + (i + 1) + " number: ");
			array[i] = Integer.parseInt(reader.readLine());
		}
		boolean condition = true;
		for (int i = 0; i < array.length / 2; i++) {
			if (array[i] >= 0) {
				continue;
			} else {
				condition = false;
				System.out.println("Negative number in position: " + (i + 1));
			}
		}

		if (condition == true) {
			System.out.println("First 5 elements are positive");
			System.out.println("Running 1st condition");
			int sum = 0;
			for (int i = 0; i < array.length / 2; i++) {
				sum += array[i];
			}
			System.out.println("Sum of first 5 elements = " + sum);
		} else {
			System.out.println("Running 2nd condition");
			int product = 1;
			for (int i = array.length / 2; i < array.length; i++) {
				product *= array[i];
			}
			System.out.println("Product of last 5 elements = " + product);

		}

	}

}
