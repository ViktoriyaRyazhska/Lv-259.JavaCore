package aven.forth.homework;

import java.util.Scanner;

public class TaskOne {

	public static void main(String[] args) {
/*
 * Ask user to enter the number of month. Read the value and write 
 * the amount of days in this month 
 * (create array with amount days of each month).
 */
		int [] monthDays = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}; 
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter the month number:");
		int monthNumber = Integer.parseInt(sc.nextLine());
		//int days = 0;
		
		for (int i= 0; i < monthDays.length; i++) {
			if (i == monthNumber) {
			//days = monthDays [i+1];
			System.out.println(monthDays[i-1]);
			}	
		}
		sc.close();
		
	}

}
