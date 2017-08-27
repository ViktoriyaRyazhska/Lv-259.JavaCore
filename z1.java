package Homework;

import java.util.Scanner;

public class z1 {

	public static void main(String[] args) {
		System.out.println("Enter in the console sentence of five words");
		Scanner scn = new Scanner(System.in);
		String s= scn.nextLine();
		String[ ] arr = s.split(" ");
		
		int i=0, max=arr[0].length();
		for(int k=0; k<arr.length; k++){
			if(arr[k].length()>max){
				max=arr[k].length(); i=k;}
		}
		System.out.println("The longest word in the sentence - " + arr[i]+ ".  The number of its letters - " + max);
		
		String reverse="";
		for (int k=0; k<arr[1].length(); k++){
			reverse = reverse + arr[1].charAt(arr[1].length()-1-k); 
		}
		System.out.println("The second word in reverse order " + reverse);
	}

}
