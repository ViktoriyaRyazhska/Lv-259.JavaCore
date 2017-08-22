package Homework;

public class Main {

	public static void main(String[] args) {
		
		 bird [] birds = new bird[5];
		  birds[0]= new Eagle();
		  birds[1]= new Chicken();
		  birds[2]= new Eagle();
		  birds[3]= new Penguin();
		  birds[4]= new Swallow();
		  
		  for (int i=0; i < birds.length; i++){
		  birds[i].fly();
		  System.out.println(birds[i].toString());
		  System.out.println("");}
		
	}

}
