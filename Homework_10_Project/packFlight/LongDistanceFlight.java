package com.packFlight;

public class LongDistanceFlight extends Flight {

	private boolean additionalPetrolNeedness;
	private String additionalPetrolPlace;

	public LongDistanceFlight(String flightNumber, String cityOfDeparture, String cityOfArrival, int distance,
			boolean additionalPetrolNeedness) throws DistanceException {
		super(flightNumber, cityOfDeparture, cityOfArrival);
		this.additionalPetrolNeedness = additionalPetrolNeedness;
		baggageTransportation = new BaggageIncluded();
		if (distance > 2500) {
			this.distance = distance;
		} else {
			throw new DistanceException("Exception! Too short distance for this kind of flight."
					+ " Set correct distance or go to the short kind flights");
		}

	}

	public boolean isAdditionalPetrolNeedness() {
		return additionalPetrolNeedness;
	}

	public void setAdditionalPetrolNeedness(boolean additionalPetrolNeedness) {
		this.additionalPetrolNeedness = additionalPetrolNeedness;
	}

	public String getAdditionalPetrolPlace() {
		return additionalPetrolPlace;
	}

	public void setAdditionalPetrolPlace(String additionalPetrolPlace) {
		if (additionalPetrolNeedness == true) {
			this.additionalPetrolPlace = additionalPetrolPlace;
		} else {
			System.out.println("No needness in additional petrol");
		}
	}

	@Override
	public void setDistance(int distance) {
		if (distance > 2500) {
			super.setDistance(distance);
		} else {
			System.out.println("Too short distance for this kind of flight");
		}
	}

}
