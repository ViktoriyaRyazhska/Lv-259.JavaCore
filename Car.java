package Homework;

public class Car {
	private String type;
	private int yer, capacity;
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getYer() {
		return yer;
	}
	public void setYer(int yer) {
		this.yer = yer;
	}
	public int getCapacity() {
		return capacity;
	}
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	
	public Car (String t, int y, int c){
		type = t;
		yer = y;
		capacity = c;
	}
}
