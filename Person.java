package Homework;

public class Person {
	private String name;
	private int birthYear;

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
	
	public Person (){
		}
	public Person(String n, int b ){
		name=n;
		birthYear=b;
	}
	
	public int age (){
		return 2017-birthYear;
	}
	public void input () {
	}
	public void output(){
		System.out.println("Person " + name);
		System.out.println("birthYear - " + birthYear);
		System.out.println("age " + (2017-birthYear));
		System.out.println();
	}
	
	public void changeName (){
		name = "Kristina";
	}
}