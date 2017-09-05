package com.packFlight;

import java.util.Scanner;

public class BaggageExcluded implements BaggageTransportation{

	@Override
	public void baggageProp(Scanner sc) {
		System.out.println("Sorry, only hand luggage");
		
	}

}
