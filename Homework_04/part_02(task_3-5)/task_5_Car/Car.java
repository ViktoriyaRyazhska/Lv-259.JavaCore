package com.pack3;

public class Car {

	private String type;
	private int year;
	private String production;
	private double engineCapacity;
	
	
	public Car(String type, int year, String production, double engineCapacity) {
		super();
		this.type = type;
		this.year = year;
		this.production = production;
		this.engineCapacity = engineCapacity;
	}


	public String getType() {
		return type;
	}


	public void setType(String type) {
		this.type = type;
	}


	public int getYear() {
		return year;
	}


	public void setYear(int year) {
		this.year = year;
	}


	public String getProduction() {
		return production;
	}


	public void setProduction(String production) {
		this.production = production;
	}


	public double getEngineCapacity() {
		return engineCapacity;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(engineCapacity);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((production == null) ? 0 : production.hashCode());
		result = prime * result + ((type == null) ? 0 : type.hashCode());
		result = prime * result + year;
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
		Car other = (Car) obj;
		if (Double.doubleToLongBits(engineCapacity) != Double.doubleToLongBits(other.engineCapacity))
			return false;
		if (production == null) {
			if (other.production != null)
				return false;
		} else if (!production.equals(other.production))
			return false;
		if (type == null) {
			if (other.type != null)
				return false;
		} else if (!type.equals(other.type))
			return false;
		if (year != other.year)
			return false;
		return true;
	}


	public void setEngineCapacity(double engineCapacity) {
		this.engineCapacity = engineCapacity;
	}

	

	@Override
	public String toString() {
		return "Car [type=" + type + ", year=" + year + ", production=" + production + ", engineCapacity="
				+ engineCapacity + "]";
	}
	
	
}
