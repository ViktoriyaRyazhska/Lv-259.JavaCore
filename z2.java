package Homework;

import java.util.Scanner;

public class z2 {

	public static void main(String[] args) {
		System.out.println("Enter in the console sentence ");
		Scanner scn = new Scanner(System.in);
		String s= scn.nextLine();
		String[ ] arr = s.split("");
		
		String rez ="";
		for(int k=1; k<arr.length; k++){
			if(arr[k].equals(arr[k-1])&arr[k].equals(" ")){}else{rez = rez +arr[k];}
		}
		System.out.println(rez);
		
	}

}
