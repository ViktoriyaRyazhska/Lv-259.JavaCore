package edu.com;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Task2 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
		int[] array = new int[3];
		for (int i = 0; i < array.length; i++) {
			System.out.print("Enter " + (i + 1) + " number: ");
			array[i] = Integer.parseInt(read.readLine());
		}
		int min = array[0];
		int max = array[0];
		for (int i = 0; i < array.length; i++) {
			if (array[i] < min) {
				min = array[i];
			}
		}
		System.out.println("Min number: " + min);
		for (int i = 0; i < array.length; i++) {
			if (array[i] > max) {
				max = array[i];
			}
		}
		System.out.println("Max number: " + max);

	}

}
