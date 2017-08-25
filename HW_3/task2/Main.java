package task2;
	/* Ñreate class Dog with fields name, breed, age. 
	Declare enum for field breed. 
	Create 3 instances of type Dog. 
	Check if there is no two dogs with the same name. 
	Display the name and the kind of the oldest dog. 
	 */
import task2.Dog.Breed;

public class Main {

	public static void main(String[] args) {
		
		Dog dog1 = new Dog("Bobi", 8, Breed.AKBASH);
		System.out.println(dog1);
		Dog dog2 = new Dog("Rex", 2, Breed.BRAZILIAN_DOGO);
		System.out.println(dog2);
		Dog dog3 = new Dog("Alfa", 10, Breed.AKITA_INU);
		System.out.println(dog3);
		
		System.out.println();
		
		if ((dog1.equals(dog2) || dog2.equals(dog3) || dog3.equals(dog1)) != true) {
			System.out.println("All names are differents");
		} else {
			System.out.println("Not all names are differents");
		}
		
		System.out.println();
		
		if (dog1.getAge() > dog2.getAge()) {
			if (dog1.getAge() > dog3.getAge()) {
				System.out.println("The oldest dog is - " + dog1.getName() + " " + dog1.getBreed() + " " + dog1.getAge());
			} else {
				System.out.println("The oldest dog is - " + dog3.getName() + " " + dog3.getBreed() + " " + dog3.getAge());
			}
		} else if (dog2.getAge() > dog3.getAge()) {
			System.out.println("The oldest dog is - " + dog2.getName() + " " + dog2.getBreed() + " " + dog2.getAge());
		} else {
			System.out.println("The oldest dog is - " + dog3.getName() + " " + dog3.getBreed() + " " + dog3.getAge());
		}
			
	}

}
