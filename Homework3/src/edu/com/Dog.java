package edu.com;

import java.io.BufferedReader;
import java.io.IOException;
import edu.com.Breed;

public class Dog {
	private String name;
	private int age;
	private Breed dogbreed;

	public Dog() {
		this.dogbreed = Breed.NoInfo;
	}

	public Dog(String name, int age, Breed breed) {
		this.name = name;
		this.age = age;
		this.dogbreed = breed;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Breed getBreed() {
		return dogbreed;
	}

	public void setBreed(Breed breed) {
		this.dogbreed = breed;
	}

	public void selectBreed(String breed) {
		switch (breed.toLowerCase()) {
		case "terrier":
			this.setBreed(Breed.Terrier);
			break;
		case "hound":
			this.setBreed(Breed.Hound);
			break;
		case "beagle":
			this.setBreed(Breed.Beagle);
			break;
		case "boxer":
			this.setBreed(Breed.Boxer);
			break;
		case "bulldog":
			this.setBreed(Breed.Bulldog);
			break;
		case "dalmantian":
			this.setBreed(Breed.Dalmantian);
			break;
		case "doberman":
			this.setBreed(Breed.Doberman);
			break;
		default:
			this.setBreed(Breed.NoInfo);
			break;
		}
	}

	public void inputInfo(BufferedReader read) throws IOException {
		System.out.print("Enter the name of the dog: ");
		this.setName(read.readLine());
		System.out.print("Enter the age of the dog: ");
		this.setAge(Integer.parseInt(read.readLine()));
		System.out.print("Enter the breed of the dog: ");
		this.selectBreed(read.readLine());

	}

	public String checkEquality(Dog obj) {
		String str = "No match with " + this.getName() + " and " + obj.getName();
		if (this.equals(obj) == true) {
			str = this.getBreed() + " " + this.getName() + " has the same name as " + obj.getBreed() + " "
					+ obj.getName();

			return str;
		} else {

			return str;
		}

	}

	@Override
	public String toString() {
		return "name=" + this.name + ", age=" + this.age + ", breed=" + this.dogbreed;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Dog other = (Dog) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

}
