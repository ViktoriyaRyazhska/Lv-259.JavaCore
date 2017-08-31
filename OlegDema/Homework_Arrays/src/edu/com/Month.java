package edu.com;

public class Month {

	private String name;
	private int days;
	public Month(String name, int days) {
		super();
		this.name = name;
		this.days = days;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getDays() {
		return days;
	}
	public void setDays(int days) {
		this.days = days;
	}
	@Override
	public String toString() {
		return "Month [name=" + name + ", days=" + days + "]";
	}
	
	
}
