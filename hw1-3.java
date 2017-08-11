package Homework;

import java.util.Scanner;

public class d3 {

	public static void main(String[] args) {
		System.out.print("c1=");
		Scanner scn1 = new Scanner(System.in);
		int c1 = scn1.nextInt();
		System.out.print("c2=");
		Scanner scn2 = new Scanner(System.in);
		int c2 = scn2.nextInt();
		System.out.print("c3=");
		Scanner scn3 = new Scanner(System.in);
		int c3 = scn3.nextInt();
		
		System.out.print("t1=");
		Scanner scn4 = new Scanner(System.in);
		int t1 = scn4.nextInt();
		System.out.print("t2=");
		Scanner scn5 = new Scanner(System.in);
		int t2 = scn5.nextInt();
		System.out.print("t3=");
		Scanner scn6 = new Scanner(System.in);
		int t3 = scn6.nextInt();
		
		System.out.println("S1 = " + (c1*t1));
		System.out.println("S2 = " + (c2*t2));
		System.out.println("S1 = " + (c3*t3));
		System.out.println("S = " + (c1*t1+c2*t2+c3*t3));

	}

}
