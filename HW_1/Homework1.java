package home;

import java.util.Scanner;

public class Homework1 {

	public static void main(String[] args) {
		System.out.println("Task 1:");
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the radius of the circle: ");
		double r = scan.nextDouble();
		System.out.println("  r = " + r);
		System.out.println("  pi = 3.14 (const)");
		double pi = 3.14;
		System.out.println("Square: S = " + (pi * r * r));
		System.out.println("Perimeter: L = " + (2 * pi * r));
		
		System.out.println("-------------------------------");
		
		// Scanner scan1 = new Scanner(System.in);
		System.out.println("Task 2:");
		System.out.println("What is your name?");
		String name = scan.nextLine();
		System.out.print("Where do you live, " + name + "?");
		String address = scan.nextLine();
		System.out.println("Information");
		System.out.println("  Name: " + name);
		System.out.println("  Address: " + address);
		
		System.out.println("-------------------------------");
		
		System.out.println("Task 3:");
		//Scanner scan2 = new Scanner(System.in);
		System.out.println("Enter the 1-st country");
		String c1 = scan.nextLine();
		System.out.println("Enter the 2-st country");
		String c2 = scan.nextLine();
		System.out.println("Enter the 3-st country");
		String c3 = scan.nextLine();
		
		System.out.println("How much time did you speak on the phone with " + c1 + "? (Input format - hh,mm)");
		double t1 = scan.nextDouble(); 
		System.out.println("How much time did you speak on the phone with " + c2 + "? (Input format - hh,mm)");
		double t2 = scan.nextDouble(); 
		System.out.println("How much time did you speak on the phone with " + c3 + "? (Input format - hh,mm)");
		double t3 = scan.nextDouble(); 
		double price1 = 2.50;
		double price2 = 1.05;
		double price3 = 0.30;
		
		double a1 = t1 * price1;
		double a2 = t2 * price2;
		double a3 = t3 * price3;
		
		System.out.println("Information:");
		System.out.println("   The cost of talking " + t1 + " hours with the country " + c1 + " at the cost of conversation " + price1 + " - " + a1 + " hryvnias");
		System.out.println("   The cost of talking " + t2 + " hours with the country " + c2 + " at the cost of conversation " + price2 + " - " + a2 + " hryvnias");
		System.out.println("   The cost of talking " + t3 + " hours with the country " + c3 + " at the cost of conversation " + price3 + " - " + a3 + " hryvnias");
		System.out.println(" Total cost with three countries - " + (a1 + a2 + a3) + " hryvnias");
		scan.close();
	}

}
