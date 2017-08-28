package aven.third.homework;


public class Dog {

	/*
	 * Create class Dog with fields name, breed, age. 
	Declare enum for field breed. 
	Create 3 instances of type Dog. 
	Check if there is no two dogs with the same name. 
	Display the name and the kind of the oldest dog. 
	 */

		private String name;
		Breed breed = null;
		private int age;
		
		public Dog(String name, Breed breed, int age) {
			this.name = name;
			this.breed = breed;
			this.age = age;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public Breed getBreed() {
			return breed;
		}
		public void setBreed(Breed breed) {
			this.breed = breed;
		}
		public int getAge() {
			return age;
		}

		public void setAge(int age) {
			this.age = age;
		}
		

		public static void main(String[] args) {
			
			Dog first = new Dog("Bim", Breed.BEAGLE, 15);
			Dog second = new Dog("Rex", Breed.DOG, 11);
			Dog third = new Dog("Fox", Breed.ARMANT, 4);
				
			//whether all the names are different	
			boolean sameName = (first.equals(second))||(second.equals(third))||(third.equals(first));	

			System.out.println("Not all names of dogs are different:" + sameName);
			
			//who is the oldest dog
			if (first.age > second.age) {
				if (first.age > third.age) {
					System.out.println("Dog " + first.name + ", " + first.breed + " is the oldest one.");}
			} else if (second.age > third.age){
				System.out.println("Dog " + second.name + ", " + second.breed + " is the oldest one.");
			} else {
				System.out.println("Dog " + third.name + ", " + third.breed + " is the oldest one.");
			}
				
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
		

