package com.dog;

public class TestDog {

	public static void main(String[] args) {
		
		
		//Check if there is no two dogs with the same name 

		
		Dog[] dogs= new Dog[4];
		dogs[0] = new Dog("met", 2, Breed.AKITA);
		dogs[1] = new Dog("met", 1, Breed.BARBET);
		dogs[2] =  new Dog("met", 8, Breed.BOXER);
		dogs[3] =  new Dog("odry", 5, Breed.BOXER);
		String nameCoinc = "";
		int count = 0;
		
		for (int i = 0; i < dogs.length-1; i++) {
			
			for (int j = i+1; j < dogs.length; j++) {
				if(dogs[i].getName().equals(dogs[j].getName())){
					if (!nameCoinc.equals(dogs[j].getName())){
						nameCoinc+=dogs[j].getName();
					}
					count++;
				}
			}
		}
		if(count>0){
		System.out.println("coincide " + count + " times " + "in " + nameCoinc);
		}else{
			System.out.println("no coincidences");
		}
		
		//Display the name and the kind of the oldest dog
	Dog maxAgeDog = new Dog();
	
	for (int i = 0; i < dogs.length; i++) {
		for (int j = 0; j < dogs.length; j++) {
			if(dogs[i].getAge() < dogs[j].getAge()){
				maxAgeDog = dogs[j];
			}
		}
	}
	System.out.println("The oldest dog is " + maxAgeDog.getName() + " his breed is " + maxAgeDog.getBreed() + " and age is " + maxAgeDog.getAge());
	
	}
		
	}

