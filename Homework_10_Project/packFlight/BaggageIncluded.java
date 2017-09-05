package com.packFlight;

import java.util.Scanner;

public class BaggageIncluded implements BaggageTransportation {

	@Override
	public void baggageProp(Scanner sc) {
		
		System.out.println("Baggage is allowed. Use baggage calculator for cost counting");
		
		System.out.println("Do U want to use baggage calculator: Yes or not");
		String inputAnswer = sc.next();
		if(inputAnswer.equalsIgnoreCase("yes")){
			
			baggageCalculator();
		}else{
			System.out.println("Oh, its better to know the cost");
		}
		
	}

	public static void baggageCalculator() {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter baggage capacity");
		double baggageCapacity = sc.nextDouble();
		System.out.println("Enter baggage weight");
		double baggageWeight = sc.nextDouble();
		System.out.println("Enter the destination");
		int distance = sc.nextInt();
		
		final double shortDistanceRate = 1.7;
		final double longDistanceRate = 3.2;

		double result = 0;

		if (((baggageCapacity >= 125) || (baggageWeight >= 23)) && (baggageCapacity < 1000) && (baggageWeight < 200)) {

			if (distance < 2500) {
				result = baggageCapacity * shortDistanceRate;
			} else if (distance > 2500) {
				result = baggageCapacity * longDistanceRate;
			}
			System.out.println("The baggage transportation cost is " + result + " $");

		} else if ((baggageCapacity < 125) && (baggageWeight < 23)) {
			System.out.println("It's hand luggage. No need to pay!");
		} else {
			System.out.println("Error capacity or weight");
		}

	}

}
