package homework4.task3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task3 {

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int[] array = new int[5];
		for (int i = 0; i < array.length; i++) {
			System.out.print("Enter " + (i + 1) + " number: ");
			array[i] = Integer.parseInt(reader.readLine());
		}
		int firstpos = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] > 0) {
				firstpos = i;
				break;
			}

		}
		int secondpos = firstpos + 1;
		for (int i = secondpos; i < array.length; i++) {
			if (array[i] > 0) {
				secondpos = i;
				break;
			}
		}
		System.out.println("\nSecond positive number is " + array[secondpos] + " on the position is " + secondpos);

		int min = array[0];
		int mini = 0;
		for (int i = 0; i < array.length; i++) {
			if (min > array[i]) {
				min = array[i];
				mini = i;
			}
		}
		System.out.println("\nMin number is " + min + " on the position " + mini);

	}

}
