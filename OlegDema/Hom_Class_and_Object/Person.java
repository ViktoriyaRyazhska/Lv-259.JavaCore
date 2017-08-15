package homework;

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
	@Override
	public String toString() {
		return "Person [name=" + name + ", birthYear=" + birthYear + "]";
	}
	
	public int getAge(){
		return 2017-birthYear;
	}
	
	public void input(){
		System.out.println("Input name of Person");
		Scanner scanner = new Scanner(System.in);
		String name = scanner.next();
		this.name = name;
		System.out.println("Inpur year of birth");
		int year = scanner.nextInt();
		this.birthYear = year;		
	}
	
	public void outputInformation(){
		System.out.println("Name: "+name+" Year of birth: "+birthYear+" Age: "+getAge());
	}
	
	public void changeName(String name){
		this.name = name;
	}
	
	

}
