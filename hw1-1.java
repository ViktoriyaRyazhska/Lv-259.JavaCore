package Homework;

import java.util.Scanner;

public class d1 {
	public static void main(String args[]){
		double S;
		double P;
		double Pi=3.14;
		System.out.print("Read radius R = ");
		Scanner scn = new Scanner(System.in);
		double R = scn.nextInt();

		S = Pi *R*R;
		System.out.println("Area S = " + S);
		
		P =2* Pi *R;
		System.out.println("Perimeter P = " + P);
		
	}

}
