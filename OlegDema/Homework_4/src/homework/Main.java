package homework;

public class Main {

	public static void main(String[] args) {
		Dog []dogs = new Dog[3];
		dogs[0] = new Dog("Reks", "boxer", 3);
		dogs[1] = new Dog("Bars", "akita", 8);
		dogs[2] = new Dog("Gaf", "beagle", 5);
		
		int maxAge = dogs[0].getAge();
		boolean exist = true;
		int iteration = 0;
		
		for(int i=0;i<dogs.length;i++){
			if(dogs[i].getAge()>maxAge){
				maxAge=dogs[i].getAge();
				iteration = i;
			}
		}
		
		if((!dogs[0].getName().equals(dogs[1].getName())) && (!dogs[1].getName().equals(dogs[2].getName())) && (!dogs[0].getName().equals(dogs[2].getName()))){
			System.out.println("All names different");
		}
		System.out.println("The oldest dog "+dogs[iteration]);
		

	}

}
