package com.pack3;

import java.util.Scanner;

public class Main {

	static void readNumber(int start, int end, Scanner sc) throws MyException {
		
		// create a String array and fill it using console
		String [] mass = new String[5];
		int temp=0;
		
		for (int i = 0; i < mass.length; i++) {
			System.out.println("Enter the numbers ");
			mass[i] = sc.nextLine();
		}
		
		// create another array
		int []mass2 = new int[5];
		
		// fill mass2 with elements from mass if they could be parsed into Integer
		for (int i = 0; i < mass.length;) {
			for (int j = 0; j < mass.length; j++) {
			if(mass[i].matches("[0-9]+")){
					mass2[j]=Integer.parseInt(mass[i]); 
				i++;
				}else{
					i++;
				}
			}
		}
		// make a checking if the elements from the array mass2 belong to the set range
		for (int i = 0; i < mass2.length; i++) {
			
			if((mass2[i] > start)&&(mass2[i] < end)){
			System.out.println(mass2[i] + " is in the range of [ " + start + "-" + end + " ]");
			}else if(mass2[i]==0){
				temp ++;
			}
		}
		// if not - throw an error
		if(temp > 0){
			throw new MyException("there is one or more input error");
		}
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		try {
			readNumber(5, 10, sc);
		} catch (MyException e) {
			System.out.println(e.getMessage());
		}
		
		
		

	}
}
