package com.pack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		// read 3 float numbers and check: are they all belong to the range [-5,5] //
		
		
		float[]mass = new float[3];
		for(int i = 0; i < mass.length; i++){
			System.out.println("input the number");
			mass[i] = Float.parseFloat(br.readLine());
		}
		for (int i = 0; i < mass.length; i++) {
			if (mass[i]>= -5 && mass[i]<=5){
				System.out.println(mass[i] + " belong to the range [-5, 5]");
			} 
		}
		
	//	read 3 integer numbers and write max and min of them //
		
		int[] intMass = new int[3];
		int maxIndex = 0, minIndex =0;
		for (int i = 0; i < intMass.length; i++) {
			System.out.println("input the number");
			intMass[i] = Integer.parseInt(br.readLine());
		}
		for (int i = 0; i < intMass.length; i++) {
			 if (intMass[maxIndex] < intMass[i]) {
				 maxIndex = i;
			 }
		}
		System.out.println("The max index is " + intMass[maxIndex]);
	
		for (int i = 0; i < intMass.length; i++) {
			 if (intMass[minIndex] > intMass[i]) {
				 minIndex = i;
			 }
		}
		System.out.println("The min index is " + intMass[minIndex]); 
		
		HTTPError er;
		System.out.println("Enter the index of error");
		int erIndex = Integer.parseInt(br.readLine());
		
		switch(erIndex){
		
		case 400:
			er = HTTPError.BAD_REQUEST;
			System.out.println(er);
			break;
		case 401:
			er = HTTPError.UNAUTHORIZED;
			System.out.println(er);
			break;
		case 402:
			er = HTTPError.PAYMENT_REQUIRED;
			System.out.println(er);
			break;
		case 403:
			er = HTTPError.FORBIDDEN;
			System.out.println(er);
			break;
		default:
			System.out.println("Error");
		} 
		
	}
	}