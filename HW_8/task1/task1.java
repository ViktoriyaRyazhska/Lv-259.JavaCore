package task1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class task1 {

	public static double div(double a, double b) throws MyException {
		if (b != 0) {
			return a/b;
		} else {
			throw new MyException("Division by zero");

		}
	}
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a: ");
		double a = 0;
		try {
			a = sc.nextDouble();
		} catch (InputMismatchException e1) {
			System.err.println("\nNot a Number " + e1.getMessage());
		    e1.printStackTrace();
		} 
		
		System.out.print("Enter b: ");
		double b = 0;
		try {
			b = sc.nextDouble();
		} catch (InputMismatchException e2) {
			System.err.println("Not a Number " + e2.getMessage());
		    e2.printStackTrace();
		} 
		
		try {
			System.out.println("Division = " + div(a, b));
		} catch (MyException e) {
			System.err.println(e.getMessage());
		    e.printStackTrace();
		} 
		
		sc.close();
	}

}
