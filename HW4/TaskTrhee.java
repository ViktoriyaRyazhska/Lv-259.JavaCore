package aven.forth.homework;

import java.util.Scanner;

public class TaskTrhee {

	public static void main(String[] args) {
	/*
	 * Enter 5 integer numbers. Find 
position of second positive number;
minimum and its position in the array.
	 */

		Scanner sc = new Scanner(System.in);
		System.out.println("Please, enter five integer numbers:");
		int [] numbers = new int [5];
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = Integer.parseInt(sc.nextLine());
		}
		//position of second positive number
		
		
		int i = 0;
		int k = 0;
		while (i < numbers.length) {
			if (numbers[i] >= 0) {
				k = i + 1;
				while (k < numbers.length) {
					if (numbers[k] >= 0) {
						System.out.println("Second positive number is in " + k + " position");
						break;
					}
					k++;
				}
				break;
			}
			i++;
		}
		
		
		//minimun and its position
	
		int min = numbers[0];
		int imin = 0;
		
		while (i < numbers.length) {
			if (numbers[i] < min){
				min = numbers[i];
				imin = i;
			}
			i++;
		}
		System.out.print("Minimum = " + min);
		System.out.println(" is in " + (imin + 1) + " position");
		
		sc.close();
	}
}
			

