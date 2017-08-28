package aven.forth.homework;

import java.util.Scanner;

public class TaskTwo {

	
	public static void main(String[] args) {
/*
 * Enter 10 integer numbers. Calculate the sum of first 
 * 5 elements if they are positive or product of last 5 element in the other case.
 */
		Scanner sc = new Scanner(System.in);
		System.out.println("Please, enter ten integer numbers:");
		int [] numbers = new int [10];
		
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = Integer.parseInt(sc.nextLine());
		}
		
		int totalProduct = 1;
		int sum = 0;
		int product = 1;
		
		for (int i = 0; i < numbers.length; i++) {
			totalProduct = totalProduct * numbers[i];}
		
		
		if (totalProduct >=0) {
			for (int i = 0; i < 5; i++) {
				 sum += numbers[i]; 
				 } 
			System.out.println("Sum of five first integers: " + sum);
		}else {
			for (int i = 4; i < numbers.length; i++ ) {
				product = product * numbers[i];				
			}
			System.out.println("Product of last five integers: " + product);
				
		}
		
	sc.close();
				
	}
}
