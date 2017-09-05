package com.packFlight;

public class Lowcost extends Flight{

	public Lowcost(String flightNumber, String cityOfDeparture, String cityOfArrival, int distance) {
		super(flightNumber, cityOfDeparture, cityOfArrival);
		this.distance = distance;
		baggageTransportation = new BaggageExcluded();
		
	}

	

	
	
}
