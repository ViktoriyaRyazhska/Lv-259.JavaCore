package com.pack;

import java.util.Scanner;

public class FlowerBed {

	 double pi = Math.PI;
	
	public double radiusInit() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the radius, please");
		double rds = sc.nextDouble();
		return rds;

	}

	public void calculatePerimeter() {
		double a = radiusInit();
		double per = 2 * pi * a;
		System.out.println("The perimetr of flower bed is " + per);
	}
	
	public void calculateArea(){
		double a = radiusInit();
		double ar = pi*(a * a);
		System.out.println("The area of flower bed is " + ar);
	}

}
