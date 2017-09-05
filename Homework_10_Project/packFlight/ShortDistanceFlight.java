package com.packFlight;

public class ShortDistanceFlight extends Flight {

	public ShortDistanceFlight(String flightNumber, String cityOfDeparture, String cityOfArrival, int distance) throws DistanceException {
		super(flightNumber, cityOfDeparture, cityOfArrival);
		baggageTransportation = new BaggageIncluded();
		if (distance < 2500) {
			this.distance = distance;
		} else {
			throw new DistanceException("Exception! Too short distance for this kind of flight. "
					+ "Set correct distance or go to the long kind flights");
			
		}
		
	}

	@Override
	public void setDistance(int distance) {
		
		if (distance < 2500) {
			super.setDistance(distance);
		} else {
			System.out.println("Too long distance for this kind of flight");
		}
	
	}

	
	
}
