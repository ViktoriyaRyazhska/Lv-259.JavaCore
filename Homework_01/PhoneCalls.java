package com.pack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PhoneCalls {
	

	public Double[] initCosts() throws NumberFormatException, IOException {

		Double[] coastOfCalls = new Double[3];

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter the cost of C1's call ");
		coastOfCalls[0] = Double.parseDouble(br.readLine());
		System.out.println("Enter the cost of C2's call ");
		coastOfCalls[1] = Double.parseDouble(br.readLine());
		System.out.println("Enter the cost of C3's call ");
		coastOfCalls[2] = Double.parseDouble(br.readLine());
		System.out.println("The initialization of call's coast was successful");
		return coastOfCalls;

	}
	
	public Double[] initTimeOfCalls() throws NumberFormatException, IOException{
		
		Double[] lastingOfCalls = new Double[3];
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the lasting of C1's call in minutes");
		lastingOfCalls[0] = Double.parseDouble(br.readLine());
		System.out.println("Enter the lasting of C2's call");
		lastingOfCalls[1] = Double.parseDouble(br.readLine());
		System.out.println("Enter the lasting of C3's call");
		lastingOfCalls[2] = Double.parseDouble(br.readLine());
		System.out.println("The initialization of time's duration was successful");
		return lastingOfCalls;
		
	}
	
	public void costCaunting() throws NumberFormatException, IOException{
		Double [] coastOfCalls = initCosts();
		Double[] lastingOfCalls = initTimeOfCalls();
		
		double c1Cst = coastOfCalls[0] * lastingOfCalls[0];
		double c2Cst = coastOfCalls[1] * lastingOfCalls[1];
		double c3Cst = coastOfCalls[2] * lastingOfCalls[2];
		double totalCst = c1Cst + c2Cst + c3Cst;
		System.out.println("The coast of C1's call equals - " + c1Cst);
		System.out.println("The coast of C2's call equals - " + c2Cst);
		System.out.println("The coast of C2's call equals - " + c3Cst);
		System.out.println("The total coast equals - " + totalCst);
	}
}
