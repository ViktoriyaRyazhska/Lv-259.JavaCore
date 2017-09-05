package com.packFlight;

import java.util.Comparator;

public class SortByDeparture implements Comparator<Flight>{

	@Override
	public int compare(Flight o1, Flight o2) {
	
		return o1.getCityOfDeparture().compareTo(o2.getCityOfDeparture());
	}

}
