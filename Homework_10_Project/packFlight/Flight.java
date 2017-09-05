package com.packFlight;

import java.util.Scanner;

public abstract class Flight {

	private static int flightCount = 0;
	protected BaggageTransportation baggageTransportation;
	protected int distance;
	private String flightNumber;
	private String cityOfDeparture;
	private String cityOfArrival;
	private String modelOfPlane;
	private int quantityOfPassengers;

	public Flight(String flightNumber, String cityOfDeparture, String cityOfArrival) {
		super();
		this.flightNumber = flightNumber;
		this.cityOfDeparture = cityOfDeparture;
		this.cityOfArrival = cityOfArrival;

	}

	public String getFlightNumber() {
		return flightNumber;
	}

	public void setFlightNumber(String flightNumber) {
		this.flightNumber = flightNumber;
	}

	public static int getFlightCount() {
		return flightCount;
	}

	public int getDistance() {
		return distance;
	}

	public void setDistance(int distance) {
		this.distance = distance;
	}

	public String getCityOfDeparture() {
		return cityOfDeparture;
	}

	public void setCityOfDeparture(String cityOfDeparture) {
		this.cityOfDeparture = cityOfDeparture;
	}

	public String getCityOfArrival() {
		return cityOfArrival;
	}

	public void setCityOfArrival(String cityOfArrival) {
		this.cityOfArrival = cityOfArrival;
	}

	public String getModelOfPlane() {
		return modelOfPlane;
	}

	public void setModelOfPlane(String modelOfPlane) {
		this.modelOfPlane = modelOfPlane;
	}

	public int getQuantityOfPassengers() {
		return quantityOfPassengers;
	}

	public void setQuantityOfPassengers(int quantityOfPassengers) {
		this.quantityOfPassengers = quantityOfPassengers;
	}

	public void setBaggageTransportation(BaggageTransportation baggageTransportation) {
		this.baggageTransportation = baggageTransportation;
	}

	public BaggageTransportation getBaggageTransportation() {
		return baggageTransportation;
	}

	public void defineBaggageProp(Scanner sc) {
		baggageTransportation.baggageProp(sc);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cityOfArrival == null) ? 0 : cityOfArrival.hashCode());
		result = prime * result + ((cityOfDeparture == null) ? 0 : cityOfDeparture.hashCode());
		result = prime * result + distance;
		result = prime * result + ((flightNumber == null) ? 0 : flightNumber.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Flight other = (Flight) obj;
		if (cityOfArrival == null) {
			if (other.cityOfArrival != null)
				return false;
		} else if (!cityOfArrival.equals(other.cityOfArrival))
			return false;
		if (cityOfDeparture == null) {
			if (other.cityOfDeparture != null)
				return false;
		} else if (!cityOfDeparture.equals(other.cityOfDeparture))
			return false;
		if (distance != other.distance)
			return false;
		if (flightNumber == null) {
			if (other.flightNumber != null)
				return false;
		} else if (!flightNumber.equals(other.flightNumber))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Flight [distance=" + distance + ", flightNumber=" + flightNumber + ", cityOfDeparture="
				+ cityOfDeparture + ", cityOfArrival=" + cityOfArrival + "]";
	}

}
