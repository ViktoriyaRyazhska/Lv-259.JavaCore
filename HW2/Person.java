package aven.second.homework;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Calendar;

public class Person {
	
	//fields
	private String name;
	private int birthYear;
	//constructors
	public Person() {}
	public Person(String name, int birthYear) {
		this.name = name;
		this.birthYear = birthYear;
	}
	//methods
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getBirthYear() {
		return birthYear;
	}
	public void setBirthYear(int birthYear) {
		this.birthYear = birthYear;
	}
	public int age () {
		
		int year = Calendar.getInstance().get(Calendar.YEAR);
		return (year - birthYear);	
	}
	public void changeName (String name) {
		this.name = name;
	}
	
	BufferedReader br = new BufferedReader (
			new InputStreamReader(System.in));
	
	public void input () throws IOException {
		System.out.println("Please type a name:");
		name = br.readLine();
		System.out.println("Please type the year of birth:");
		birthYear = Integer.parseInt(br.readLine());
	}
	
	public void output () throws IOException {
		System.out.println("Name:" + this.getName());
		System.out.println("Year of birth:" + this.getBirthYear());
		System.out.println(" ");
	}
		
}