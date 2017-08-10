package edu.com;


import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException {
		Person[] person=new Person[5];
		for (int i = 0; i < 5; i++) {
			person[i]=new Person();
			person[i].input();
		}
		for (int i = 0; i < 5; i++) {
			person[i].output();
		}
	}

}
