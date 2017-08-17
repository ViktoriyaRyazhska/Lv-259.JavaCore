package homework4.task5;

import java.io.BufferedReader;
import java.io.IOException;

public class Car {
	private String type;
	private int year;
	private int engineCapacity;

	public Car() {
	}

	public Car(String type, int year, int engineCapacity) {
		this.type = type;
		this.year = year;
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

	public int getEngineCapacility() {
		return engineCapacity;
	}

	public void setEngineCapacity(int engineCapacity) {
		this.engineCapacity = engineCapacity;
	}

	@Override
	public String toString() {
		return "Car type=" + type + ", year=" + year + ", engineCapacity=" + engineCapacity;
	}

	public void inputInfo(BufferedReader reader) throws IOException {
		System.out.print("Enter the car type: ");
		this.setType(reader.readLine());
		System.out.print("Enter the year of production: ");
		this.setYear(Integer.parseInt(reader.readLine()));
		System.out.print("Enter the engine capacity: ");
		this.setEngineCapacity(Integer.parseInt(reader.readLine()));
	}

}
