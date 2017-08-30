package task2;

import java.util.InputMismatchException;
import java.util.Scanner;

import task1.MyException;

public class task2 {

	public static void readNumber(int start, int end, Scanner sc) throws MyException {
		
		int[] array = new int[10];
	
		try {
			for (int i = 0; i < array.length; i++) {
				array[i] = sc.nextInt();	
			}
		} catch (InputMismatchException e1) {
			System.err.println("\nNot a Number " + e1.getMessage());
		    e1.printStackTrace();
		} catch (ArrayIndexOutOfBoundsException e2) {
			System.err.println("Array Index Out Of Bounds" + e2.getMessage());
		    e2.printStackTrace();
		} catch (NumberFormatException e3) {
			System.out.println("You must enter Integer" + e3.getMessage());
			e3.printStackTrace();
		}
		
		System.out.println("Which belongs to the gap:");
		for (int i = 0; i < array.length; i++) {
			if ((array[i] >= start) && (array[i] <= end)) {
				System.out.println("\t{" + array[i] + "} belongs to the gap [" + start + ";" + end + "]");
			} else  {
				System.out.println("\tThis " + array[i] + " number don't belong to the gap [" + start + ";" + end + "]");	
			} 	
		}	
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		try {
			System.out.println("Enter numbers: ");
			readNumber(1, 10, sc);
		} catch (MyException e) {
			e.printStackTrace();
		} 
		
		sc.close();
	}

}