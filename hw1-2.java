package Homework;

import java.util.Scanner;

public class d2 {
	public static void main(String args[]) {

		System.out.println("What is your name?");
		Scanner scn1 = new Scanner(System.in);
		String name = scn1.nextLine();
		System.out.println("Where are you live, " + name + "?");
		Scanner scn2 = new Scanner(System.in);
		String address = scn2.nextLine();
		
		System.out.println("name - " + name + ", address - " + address);
	}

}
