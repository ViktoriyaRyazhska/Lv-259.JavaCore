package Homework;

import Homework.Dog.breeds;

public class Main {

	public static void main(String[] args) {
		Dog d1 = new Dog("name 1", 2, breeds.breed2);
		Dog d2 = new Dog("name 2", 1, breeds.breed3);
		Dog d3 = new Dog("name 5", 7, breeds.breed3);

		if (d1.getName() == d2.getName() || d1.getName()==d3.getName()|| d2.getName()==d3.getName()) 
		{System.out.println("Yes");}
		else {System.out.println("No");}
		
		if (d1.getAge()>=d2.getAge() && d1.getAge()>=d3.getAge())
		{System.out.println(d1.getName() + " the oldest dog. Age - "+ d1.getAge() + ", breed "+ d1.getBreed());} 
		if (d2.getAge()>=d1.getAge() && d2.getAge()>=d3.getAge())
		{System.out.println(d2.getName() + " the oldest dog. Age - "+ d2.getAge() + ", breed "+ d2.getBreed());} 
		if (d3.getAge()>=d2.getAge() && d3.getAge()>=d1.getAge())
		{System.out.println(d3.getName() + " the oldest dog. Age - "+ d3.getAge() + ", breed "+ d3.getBreed());} 
	}

}
