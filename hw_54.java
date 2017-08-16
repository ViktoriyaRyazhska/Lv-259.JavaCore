package Homework;

import java.util.Scanner;

public class hw54 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		int m;
				
		int k=0,p=1; 
		do {System.out.println("Write number ");
		m = scn.nextInt();
		p=p*m; k++; }
		while (m>0);
		
		System.out.println("Product = "+p);
		
	}

}
