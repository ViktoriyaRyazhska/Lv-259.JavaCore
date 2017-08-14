package com.pack;

public class Main {

	public static void main(String[] args) {

		Person p1 = new Person();
		Person p2 = new Person();
		Person p3 = new Person();
		Person p4 = new Person();
		Person p5 = new Person();
		
		p1.input();
		p2.input();
		p3.input();
		p4.input();
		p5.input();
		
		// demonstration of other methods //
		
		p1.changeName();
		p1.countAge();
		p1.output();
	}
}
