package Homework;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Car [] car = new Car[4];
			car[0] = new Car("Volkswagen", 1999, 101);
			car[1] = new Car("Mersedes", 2009, 101);
			car[2] = new Car("Volkswagen", 2017, 101);
			car[3] = new Car("Audi", 2009, 101);
			
			Scanner scn = new Scanner(System.in);
			System.out.println("Write model year ");
			int m = scn.nextInt();
		
		int l=0;
		for(int i=0; i < car.length; i++){
			if (car[i].getYer()==m){l++;
			System.out.println(car[i].getType() +" , model yer " +car[i].getYer() +" , engine capacity "+car[i].getCapacity());}
		}
		if(l==0){System.out.println("There is no such car in the base ");}
		
		Car t = new Car("n",1,1);
		 
		 for (int i = 0; i < car.length - 1; i++) {
		 	for (int j = i + 1; j < car.length; j++) {
		 		if (car[i].getYer() > car[j].getYer()) {
		 			t = car[i];
		 			car[i]=car[j];
		 			car[j]=t;
		 		}
		 	}
		 }
		 
	for (int i = 0; i < car.length; i++) {
		System.out.println(car[i].getType() +" , model yer " +car[i].getYer() +" , engine capacity "+car[i].getCapacity());
		 }
		 
	}

}
