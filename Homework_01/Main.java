package com.pack;

import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		// method for personal data entering
		PersonalData data = new PersonalData();
		data.personalDataEntering();
	
		//methods for calculating flower bed's perimeter and area
		FlowerBed fb = new FlowerBed();
		fb.calculatePerimeter();
		fb.calculateArea();
		
		//method for calls cost calculation
		PhoneCalls calls = new PhoneCalls();
		calls.costCaunting();
	
	
		
		
	}
}
