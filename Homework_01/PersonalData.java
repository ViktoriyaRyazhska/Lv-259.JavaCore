package com.pack;

import java.util.Scanner;

public class PersonalData {

	public void personalDataEntering() {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your name, please");
		String name = sc.next();
		System.out.println(name + ", enter your address, please");
		String address = sc.next();
		System.out.println("Enter your phone number, plese");
		String phoneNumber = sc.next();

		System.out.println(name + " live in " + address + ". The phone number is " + phoneNumber + ".");

	}
}
