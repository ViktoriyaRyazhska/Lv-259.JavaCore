package com.pack;

import java.awt.image.AreaAveragingScaleFilter;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
	
	//TASK_1

	public static double div(double a, double b) {
		return a / b;
	}
	

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		try {
			
			System.out.println("Input the first number");
			double a = sc.nextDouble();
			System.out.println("Input the second number");
			double b = sc.nextDouble();
			
			double result = div(a, b);
			
			String s = String.format("%,.2f", result);
			System.out.println(s);
			
		} catch (ArithmeticException ex) {
			ex.printStackTrace();
		} catch (InputMismatchException ex) {
			ex.printStackTrace();
		} finally {
			sc.close();
		}

			
		
		
		
		
	}
}
