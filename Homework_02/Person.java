package com.pack;

import java.util.Scanner;

public class Person {

	private String name;
	private int birthYear;

	public Person() {

	}

	public Person(String name, int birthYear) {
		super();
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

	public void changeName() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please, enter a new person name");
		String newName = sc.nextLine();
		setName(newName);
	}

	public void input() {
		System.out.println("Enter a person's name");
		Scanner sc = new Scanner(System.in);
		String inputName = sc.nextLine();
		System.out.println("Enter a person's year of birth");
		int inputYearOfBirth = sc.nextInt();
		setName(inputName);
		setBirthYear(inputYearOfBirth);
		System.out.println("Successful input");
	}

	public int countAge() {
		int currentYear = 2017;
		int age = currentYear - birthYear;
		return age;
	}

	/*
	 * public void output(){ System.out.println(toString()); }
	 */

	public void output() {
		int age = countAge();
		if (age > 1) {
			System.out.println("Hello, my name is " + name + ", my birthday year is " + birthYear + ". I'm " + age
					+ " years old.");
		} else if (age == 1) {
			System.out.println(
					"Hello, my name is " + name + ", my birthday year is " + birthYear + ". I'm " + age + " year old.");
		} else if (age == 0) {
			System.out.println("Hello, my name is " + name + ", my birthday year is " + birthYear + ". I'm a baby");

		}

	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", birthYear=" + birthYear + "]";
	}
}
