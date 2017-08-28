package aven.fifth.homework;

public class BirdMain {

	public static void main(String[] args) {
	
		/*
		 * Create array Bird and add different birds to it. 
		 * Call fly() method for all of it. Output the information about each type created bird
		 */

	Eagle eagle = new Eagle("eagle", true);
	Swallow swallow = new Swallow("swallow", true);
	Chicken chicken = new Chicken("chicken", false);
	Penguin penguin = new Penguin("penguin", true);
		
	Bird [] birds = {eagle, swallow, chicken, penguin};
	
	for (int j = 0; j < birds.length; j++) {
		
		System.out.println(birds[j]);
		birds[j].fly();
		System.out.println(" ");
	}
	
		
		
	}

}
