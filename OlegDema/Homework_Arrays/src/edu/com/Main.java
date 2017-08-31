package edu.com;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
//		System.out.println("Enter number of month");
//		Month [] mas = {(new Month("Січень",31)),(new Month("Лютий",28)),(new Month("Березень",31)),(new Month("Квітень",30)),(new Month("Травень",31)),(new Month("Червень",30)),(new Month("Липень",31)),(new Month("Серпень",31)),(new Month("Вересень",30)),(new Month("Жовтень",31)),(new Month("Листопад",30)),(new Month("Грудень",31)),};
//		int number = scanner.nextInt();
//		if(number<=0 || number>12){
//			System.out.println("ERROR");
//		}else{
//			System.out.println(mas[number-1]);
//		}

		//////////////////////////////////////////////////////////////////////////
		
//		int [] mas = new int [10];
//		System.out.println("Enter 10 integer numbers");
//		for(int i=0;i<mas.length;i++){
//			mas[i]= scanner.nextInt();
//		}
//		int sum = 0;
//		boolean exist = true;
//		for(int i=0;i<5;i++){
//			if(mas[i]<0){
//				exist=false;
//			}
//		}
//		
//		if(exist){
//			for(int i=0;i<5;i++){
//				sum += mas[i];
//			}			
//			System.out.println(sum);
//		}else{
//			System.out.println("Negative number");
//		}
	//////////////////////////////////////////////////////////////////
//		System.out.println("Enter 5 integer numbers");
//		int mas[] = new int [5];
//		for(int i=0;i<5;i++){
//			mas[i]=scanner.nextInt();
//		}
//		
//		boolean positive = false;
//		int secondPositive = 0;
//		for(int i=0;i<mas.length;i++){
//			if(mas[i]>=0){
//				if(positive){
//					secondPositive=mas[i];
//					break;
//				}
//				positive = true;
//			}
//		}
//		System.out.println(secondPositive);
//		
//		int min = mas[0];
//		int position = 0;
//		
//		for(int i =0;i<mas.length;i++){
//			if(mas[i]<min){
//				min =mas[i];
//				position=i;
//			}
//		}
//		System.out.println(min+" "+position);
		//////////////////////////////////////////////////////////////
		
//		boolean positive = true;
//		int count =0;
//		while (positive) {
//			int i = scanner.nextInt();
//			if(i<=0){
//				positive=false;
//			}
//			count++;
//		}
//		System.out.println(count);
		
		//////////////////////////////////////////////////////////////////
		System.out.println("Enter year");
		Car [] cars = {(new Car("Shkoda",2005 , 100)),(new Car("Reno", 2002, 50)),(new Car("Porshe", 2012, 200)),(new Car("Lambo", 2015, 500)),(new Car("Bugatti", 2017, 800)),(new Car("BMW", 2010, 250))};
		
		int year = scanner.nextInt();
		for(int i=0;i<cars.length;i++){
			if(cars[i].getYear()==year){
				System.out.println(cars[i]);
			}
		}
		
		Car car = null;
		
		for(int i =0;i<cars.length;i++){
			for(int j=0;j<cars.length-1;j++){
				if(cars[j].getYear()>cars[j+1].getYear()){
					car=cars[j];
					cars[j]=cars[j+1];
					cars[j+1]=car;
				}
			}
		}
		
		for(int i=0;i<cars.length;i++){
			System.out.println(cars[i]);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
