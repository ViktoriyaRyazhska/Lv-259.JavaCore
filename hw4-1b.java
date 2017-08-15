package Homework;

import java.util.Scanner;

public class d_41b {

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
		
		if (k1>=k2 && k1>=k3){System.out.println("max = " + k1);};
		if (k2>=k1 && k2>=k3){System.out.println("max = " + k2);};
		if (k3>=k2 && k3>=k1){System.out.println("max = " + k3);}
		
		if (k1<=k2 && k1<=k3){System.out.println("min = " + k1);};
		if (k2<=k1 && k2<=k3){System.out.println("min = " + k2);};
		if (k3<=k2 && k3<=k1){System.out.println("min = " + k3);}
	}

}
