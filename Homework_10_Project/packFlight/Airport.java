package com.packFlight;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.Map.Entry;

public class Airport {

	public Map<String, List<? extends Flight>> map = new HashMap<String, List<? extends Flight>>();

	List<LongDistanceFlight> listLong = new ArrayList<>();
	List<ShortDistanceFlight> listshort = new ArrayList<>();
	List<Lowcost> listLowcost = new ArrayList<>();

	public Airport() {
		createKeys();
	}

	public void createKeys() {
		map.put("long", listLong);
		map.put("short", listshort);
		map.put("lowcost", listLowcost);

	}

	public void addFlights(Scanner sc) throws DistanceException {

		System.out.println("Input the kind of flight U want to add: long, short or lowcost ...");
		String inputKey = sc.next();

		if (!(inputKey.equalsIgnoreCase("short")) && (!(inputKey.equalsIgnoreCase("long")))
				&& (!(inputKey.equalsIgnoreCase("lowcost")))) {
			System.out.println("input eror");
		} else {

			Set<Map.Entry<String, List<? extends Flight>>> set = map.entrySet();
			for (Entry<String, List<? extends Flight>> entry : set) {
				if (entry.getKey().equalsIgnoreCase(inputKey)) {

					System.out.println("Input flight number");
					String inputFlightNumber = sc.next();
					System.out.println("Input city of departure");
					String inputCityOfDeparture = sc.next();
					System.out.println("Input city of arrival");
					String inputCityOfArrival = sc.next();
					System.out.println("Input distance");
					int inputDistance = sc.nextInt();

					if (inputKey.equalsIgnoreCase("short")) {
						Flight flight = new ShortDistanceFlight(inputFlightNumber, inputCityOfDeparture,
								inputCityOfArrival, inputDistance);
						Flight flight2 = new ShortDistanceFlight("Lv-148", "Lviv", "Kyiv", 600);
						Flight flight3 = new ShortDistanceFlight("KL-136", "Lviv", "Warshava", 400);

						listshort.add((ShortDistanceFlight) flight);
						listshort.add((ShortDistanceFlight) flight2);
						listshort.add((ShortDistanceFlight) flight3);

					} else if (inputKey.equalsIgnoreCase("lowcost")) {
						Flight flight = new Lowcost(inputFlightNumber, inputCityOfDeparture, inputCityOfArrival,
								inputDistance);

						Flight flight2 = new Lowcost("MI-516", "Krakow", "Berlin", 300);
						listLowcost.add((Lowcost) flight);
						listLowcost.add((Lowcost) flight2);

					} else if (inputKey.equalsIgnoreCase("long")) {
						System.out.println("Input if additional petrol is necessary: true / false");
						boolean inputAdditionalPetrolNeedness = sc.nextBoolean();
						Flight flight = new LongDistanceFlight(inputFlightNumber, inputCityOfDeparture,
								inputCityOfArrival, inputDistance, inputAdditionalPetrolNeedness);
						Flight flight2 = new LongDistanceFlight("PO-811", "Warshawa", "New York", 7000, true);

						listLong.add((LongDistanceFlight) flight);
						listLong.add((LongDistanceFlight) flight2);

					}
				}

			}

		}
	}

	public void deleteFlight(Scanner sc) {

		int tempo = 0;
		System.out.println("Input the kind of flight U want to delete: long, short or lowcost ... ");
		String inputKey = sc.next();
		if (!(inputKey.equalsIgnoreCase("short")) && (!(inputKey.equalsIgnoreCase("long")))
				&& (!(inputKey.equalsIgnoreCase("lowcost")))) {
			System.out.println("input eror");
		} else {

			Set<Map.Entry<String, List<? extends Flight>>> set = map.entrySet();
			Iterator<Entry<String, List<? extends Flight>>> iter = set.iterator();
			while (iter.hasNext()) {
				Entry<String, List<? extends Flight>> temp = iter.next();
				if (temp.getKey().equals(inputKey)) {
					System.out.println("Input number of flight U want to delete");
					String inputNumberOfFlight = sc.next();
					List<? extends Flight> list = temp.getValue();
					Iterator<? extends Flight> it = list.iterator();
					while (it.hasNext()) {
						Flight flight = it.next();
						if (flight.getFlightNumber().equalsIgnoreCase(inputNumberOfFlight)) {
							it.remove();
							System.out
									.println("Flight number " + inputNumberOfFlight + " has been successfully deleted");
						} else if(!(flight.getFlightNumber().equalsIgnoreCase(inputNumberOfFlight))){
							tempo++;   // ???
						}
					}
				}
			}

		}
		
	}

	public void showBaggageProp(Scanner sc) {
		System.out.println("Input the number of flight U want to see baggage properties");
		String inputFlightNumber = sc.next();

		Set<Map.Entry<String, List<? extends Flight>>> set = map.entrySet();
		Iterator<Entry<String, List<? extends Flight>>> iter = set.iterator();
		while (iter.hasNext()) {
			Entry<String, List<? extends Flight>> temp = iter.next();

			List<? extends Flight> list = temp.getValue();
			Iterator<? extends Flight> it = list.listIterator();
			while (it.hasNext()) {
				Flight flight = it.next();

				if (flight.getFlightNumber().equalsIgnoreCase(inputFlightNumber)) {
					flight.defineBaggageProp(sc);
				}
			}
		}
		System.out.println("Do U want to change baggage properies ? Input Yes or No");
		String inputAnswer = sc.next();
		if (inputAnswer.equalsIgnoreCase("yes")) {
			changeBaggageProp(sc);
		} else {
			System.out.println("Ok! Leave it as it is");
		}

	}

	public void changeBaggageProp(Scanner sc) {

		System.out.println("Input the number of flight U want to change baggage properties");
		String inputFlightNumber = sc.next();

		Set<Map.Entry<String, List<? extends Flight>>> set = map.entrySet();
		Iterator<Entry<String, List<? extends Flight>>> iter = set.iterator();
		while (iter.hasNext()) {
			Entry<String, List<? extends Flight>> temp = iter.next();

			List<? extends Flight> list = temp.getValue();
			Iterator<? extends Flight> it = list.listIterator();
			while (it.hasNext()) {
				Flight flight = it.next();

				if (flight.getFlightNumber().equalsIgnoreCase(inputFlightNumber)) {
					if (flight.getBaggageTransportation().getClass().getName()
							.equals("com.packFlight.BaggageIncluded")) {
						flight.setBaggageTransportation(new BaggageExcluded());
					} else if (flight.getBaggageTransportation().getClass().getName()
							.equals("com.packFlight.BaggageExcluded")) {
						flight.setBaggageTransportation(new BaggageIncluded());
					}

				}
			}
		}
		System.out.println("The baggage properties have been successfully changed");
	}

	public void clearParticularKindOfFlight(Scanner sc) {
		System.out.println("Input particulat branch of flight U want to clear: long, short or lowcost ... ");
		String inputKey = sc.next();

		Set<Map.Entry<String, List<? extends Flight>>> set = map.entrySet();
		Iterator<Entry<String, List<? extends Flight>>> iter = set.iterator();
		while (iter.hasNext()) {
			Entry<String, List<? extends Flight>> temp = iter.next();
			if (temp.getKey().equals(inputKey)) {
				temp.getValue().clear();

			}
		}
	}

	public void showAllFlights() {

		Set<Entry<String, List<? extends Flight>>> set = map.entrySet();
		for (Entry<String, List<? extends Flight>> entry : set) {
			List<? extends Flight> list = entry.getValue();
			if (!list.isEmpty()) {

				System.out.println("There some " + entry.getKey() + " flights like:");
				for (Flight f : list) {
					System.out.println("Flight number " + f.getFlightNumber() + " from " + f.getCityOfDeparture()
							+ " to " + f.getCityOfArrival() + ". Distance = " + f.getDistance());

				}
			}

		}
	}

	public void showFlightsSortedByDepatrure() {
		Set<Entry<String, List<? extends Flight>>> set = map.entrySet();
		for (Entry<String, List<? extends Flight>> entry : set) {
			List<? extends Flight> list = entry.getValue();
			if (!list.isEmpty()) {
				Collections.sort(list, new SortByDeparture());

				System.out.println("There some " + entry.getKey() + " flights like:");
				for (Flight f : list) {
					System.out.println("Flight number " + f.getFlightNumber() + " from " + f.getCityOfDeparture()
							+ " to " + f.getCityOfArrival() + ". Distance = " + f.getDistance());
				}

			}

		}
	}

	public void cancelParticularFlightsTo(Scanner sc) {

		System.out.println("Input the city U want delete all flights to");
		String inputCityOfArrival = sc.next();

		Set<Map.Entry<String, List<? extends Flight>>> set = map.entrySet();
		Iterator<Entry<String, List<? extends Flight>>> iter = set.iterator();
		while (iter.hasNext()) {
			Entry<String, List<? extends Flight>> temp = iter.next();

			List<? extends Flight> list = temp.getValue();
			Iterator<? extends Flight> it = list.listIterator();
			while (it.hasNext()) {
				Flight flight = it.next();
				if (flight.getCityOfArrival().equalsIgnoreCase(inputCityOfArrival)) {
					it.remove();
					System.out.println("All flights to " + inputCityOfArrival + " have been successfully deleted");
				}
			}
		}

	}

	public void cancelParticularFlightsFrom(Scanner sc) {

		System.out.println("Input the city U want delete all flights from");
		String inputCityOfDeparture = sc.next();

		Set<Map.Entry<String, List<? extends Flight>>> set = map.entrySet();
		Iterator<Entry<String, List<? extends Flight>>> iter = set.iterator();
		while (iter.hasNext()) {
			Entry<String, List<? extends Flight>> temp = iter.next();

			List<? extends Flight> list = temp.getValue();
			Iterator<? extends Flight> it = list.listIterator();
			while (it.hasNext()) {
				Flight flight = it.next();
				if (flight.getCityOfDeparture().equalsIgnoreCase(inputCityOfDeparture)) {
					it.remove();
					System.out.println("All flights from " + inputCityOfDeparture + " have been successfully deleted");
				}
			}
		}

	}

}
