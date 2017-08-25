package home;

import java.util.Calendar;
import java.util.Scanner;

public class Person {

	private String name;
	private int birthYear;
	
	public Person() {
	}

	public Person(String name, int birthYear) {
		this.name = name;
		this.birthYear = birthYear;
	}
	
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
	
	public int calculateAge() {
		Calendar calendar = Calendar.getInstance();
		return calendar.get(Calendar.YEAR) - birthYear;
	}
	
	public void inputInf() {
		Scanner scan = new Scanner(System.in);
		System.out.println("What is your name?");
		setName(scan.nextLine());
		System.out.println("What is your birth year?");
		setBirthYear(scan.nextInt());
	}
	
	public void outputInf() {
		System.out.println("Personal information:");
		System.out.println("  Name: " + getName());
		System.out.println("  Year of birth: " + getBirthYear());
		System.out.println("  Years: " + calculateAge());
	}
	
	public void changeName (String name) {
		System.out.println("Changed personal information:");
		System.out.println("  Name: " + name);
		System.out.println("  Year of birth: " + getBirthYear());
		System.out.println("  Years: " + calculateAge());
	}
}