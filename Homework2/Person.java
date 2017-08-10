package edu.com;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Person {
	private String name;
	private int birthYear;
	private static int currentYear=2017;
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	
	public Person() {}

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

	public void setBirthYear(int birthYear) throws IOException {
		this.birthYear = birthYear;
		this.checkBirthYear();
	}
	
	public void checkBirthYear() throws  IOException {
		while (this.birthYear>Person.currentYear) {
			System.out.print("Invalid birthday year, please retry: ");
			this.setBirthYear(Integer.parseInt(br.readLine()));
		}
	}
	
	public int getAge() {
		return Person.currentYear-this.birthYear;
	}
	
	public void input() throws IOException {
		System.out.print("Enter your name: ");
		this.setName(br.readLine());;
		System.out.print("Enter your birthday year: ");
		this.setBirthYear(Integer.parseInt(br.readLine()));
		this.checkBirthYear();
	}
	
	public void output() {
		System.out.println("Name: "+this.getName()+", age: "+this.getAge());
	}
	
	public void changeName() throws IOException
	{
		System.out.print("Enter your new name: ");
		this.setName(br.readLine());
	}
	
}
