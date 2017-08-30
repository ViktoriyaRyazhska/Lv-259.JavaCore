package task2;

import java.util.InputMismatchException;
import java.util.Scanner;

import task1.MyException;

public class task2_1 {

	public static String readNumber(int start, int end) throws MyException {
		if (start >= 0 && end <= 10) {
			return "{" + start + ";" + end + "} belong to the gap [0;10]";
		} else if (start < 0 && end > 10) {
			return "{" + start + ";" + end + "} don't belong to the gap [0;10]";
		} else if (start >= 0 && end > 10) {
			return "{" + start + "} belong to the gap [0;10], {" + end + "} don't belong to the gap [0;10]";
		} else if (start < 0 && end <= 10) {
			return "{" + start + "} don't belong to the gap [0;10], {" + end + "} belong to the gap [0;10]";
		} else {
			throw new MyException("Invalid number");	
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a: ");
		int start = 0;
		try {
			start = sc.nextInt();
		} catch (InputMismatchException e1) {
			System.err.println("\nNot a Number " + e1.getMessage());
		    e1.printStackTrace();
		} 
		
		System.out.print("Enter b: ");
		int end = 0;
		try {
			end = sc.nextInt();
		} catch (InputMismatchException e2) {
			System.err.println("Not a Number " + e2.getMessage());
		    e2.printStackTrace();
		} 
		
		try {
			System.out.println("Plural: " + readNumber(start, end));
		} catch (MyException e) {
			e.printStackTrace();
		}
		sc.close();
	}

}
