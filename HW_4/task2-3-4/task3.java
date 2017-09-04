package task3;

import java.util.Scanner;

public class task3 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		//int[] array = {3, -4, -9, -1, 6};
		int[] array = new int[5];
 		int positiveNumber = 0;
		
 		System.out.println("Enter 5 numbers: ");
 		for (int i = 0; i < array.length; i++) {
 			array[i] =sc.nextInt();
		}
 		
		for (int i = 0; i < array.length; i++) {
			
			if (array[i] >= 0) {
				positiveNumber++;
			}
			
			if (positiveNumber == 2) {
				System.out.println("Position of second - ["  + array[i] + "] positive number" + " is in " + i + " place");
				break;
			}
		}
		
		int max = array[0];
		int iMax = 0;
		int i = 0;
		while (i < array.length) {
			if (array[i] < max) {
				max = array[i];
				iMax = i;
			}
			i++;
		}
		System.out.println("Minimum = " + max + " is in " + (iMax + 1) + " place");
		
		sc.close();
	}

}
