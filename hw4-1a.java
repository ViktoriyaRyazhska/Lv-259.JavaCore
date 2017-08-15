package Homework;

import java.util.Scanner;

public class d_41a {

	public static void main(String[] args) {
		System.out.println("Write first number k1 = ");
		Scanner scn1 = new Scanner(System.in);
		int k1 = scn1.nextInt();
		
		System.out.println("Write second number k2 = ");
		Scanner scn2 = new Scanner(System.in);
		int k2 = scn2.nextInt();
		
		System.out.println("Write third number k3 = ");
		Scanner scn3 = new Scanner(System.in);
		int k3 = scn3.nextInt();
		
		if (k1>=-5 && k1<=5){System.out.println(k1 + "  belong to the range [-5,5]");} else
			{System.out.println(k1 + "  not belong to the range [-5,5]");}
		if (k2>=-5 && k2<=5){System.out.println(k2 + "  belong to the range [-5,5]");} else
			{System.out.println(k2 + "  not belong to the range [-5,5]");}
		if (k3>=-5 && k3<=5){System.out.println(k3 + "  belong to the range [-5,5]");} else
			{System.out.println(k3 + "  not belong to the range [-5,5]");}
		
	}

}
