package com.packFlight;

import java.util.Scanner;

public class Test {

	static void menu() {
		System.out.println("\n--------------------\n" + "Input 1 to add a flight" + "\nInput 2 to delete a flight"
				+ "\nInput 3 to cancel particular flights from" + "\nInput 4 to cancel particular flights to"
				+ "\nInput 5 to clear a particular flights branch" + "\nInput 6 to see baggage transportation properties"
				+ "\nInput 7 to change baggage transportation properties" + "\nInput 8 to see all flights"
				+ "\nInput 9 to see flights sorted by city Of departure" + "\n--------------------\n");
	}

	public static void main(String[] args) {

		Airport airport = new Airport();

		while (true) {
			menu();
			Scanner sc = new Scanner(System.in);
			if (sc.hasNext()) {
				int input = sc.nextInt();

				switch (input) {

				case 1:
					try {
						airport.addFlights(sc);
					} catch (DistanceException ex) {
						System.out.println(ex.getMessage());
					}
					break;
				case 2:
					airport.deleteFlight(sc);
					break;
				case 3:
					airport.cancelParticularFlightsFrom(sc);
					break;
				case 4:
					airport.cancelParticularFlightsTo(sc);
					break;
				case 5:
					airport.clearParticularKindOfFlight(sc);
					break;
				case 6:
					airport.showBaggageProp(sc);
					break;
				case 7:
					airport.changeBaggageProp(sc);
					break;
				case 8:
					airport.showAllFlights();
					break;
				case 9:
					airport.showFlightsSortedByDepatrure();
					break;
					
				default:
					System.out.println("Error! Input nymber from 1 to 9");
				}

			}

		}

	}
}
