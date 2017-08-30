package Homework;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		double a;
		double b;
		
		Scanner scn = new Scanner (System.in);

		System.out.println("a= ");
		String str1 =scn.next();
		System.out.println("b= ");
		String str2 = scn.next();
		try{
			
		 a = Double.parseDouble(str1);
		 b = Double.parseDouble(str2);}
		catch (NumberFormatException e) {
			e.printStackTrace();
			System.err.println(e.getMessage());
			a = 0; b=1; 
		}	
		
		Div rez =new Div();
		
		try{
		System.out.println("a/b= "+ rez.div(a, b));}
		catch (ArithmeticException e){
			e.printStackTrace();
			System.err.println(e.getMessage());
			System.out.println("Division by zero");
		}
		

	}

}
