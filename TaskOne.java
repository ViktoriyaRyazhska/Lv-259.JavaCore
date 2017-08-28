package third.homework;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TaskOne {
	
	private enum HTTPError {
		A(400), B(401), C(402), D(403), E(404)
	}
	
	public static void main (String [] args) throws NumberFormatException, IOException {
/*
 * Solve the next tasks:
read 3 float numbers and check: are they all belong to the range [-5,5];
read 3 integer numbers and write max and min of them;
read number of HTTP Error (400, 401,402, ...) and write the name of this error (Declare enum HTTPError)
 */
		
		//public static boolean intervallContains(int low, int high, int n) {
	  //  return n >= low && n <= high;
	//}
		
		BufferedReader br = new BufferedReader(
				 new InputStreamReader(System.in));
		
	//	read 3 float numbers and check: are they all belong to the range [-5,5];
		System.out.println("Task 1.a");
		System.out.println("Please enter three number:");
		float[] floats = new float [3];
		
		for (int i = 0; i < 3; i++) {
			floats[i] = Float.parseFloat(br.readLine());
		}
		
				
		for (int i = 0; i < 3; i++) {
			if (((double) floats[i] >= -5.0)&&((double) floats[i] <= 5.0)) { //remember to try with compare
				System.out.printf("Float %s is in range [-5; 5]"+ "\n", i+1);
			} else {
				System.out.printf("Float %s is not in range [-5; 5]"+ "\n", i+1);
			}
		}
		
	//read 3 integer numbers and write max of them;
		System.out.println("Task 1.b");
		System.out.println("Please enter three number:");
		int[] ints = new int[3];
		
		for (int i= 0; i < 3; i++) {
			ints[i] = Integer.parseInt(br.readLine());
		}
		
		if (ints[0] > ints[1]) {
			if (ints[0] > ints[2]) {
				System.out.println("Max value is " + ints[0]);
			}
		}else if(ints[1] > ints[2]){
			System.out.println("Max value is " + ints[1]);
		}else {
			System.out.println("Max value is " + ints[2]);
		}
		
	//read 3 integer numbers and write max of them;
			if (ints[0] < ints[1]) {
			if (ints[0] < ints[2]) {
				System.out.println("Min value is " + ints[0]);
			}
		}else if(ints[1] < ints[2]){
			System.out.println("Min value is " + ints[1]);
		}else {
			System.out.println("Min value is " + ints[2]);
		}
		
	//read number of HTTP Error (400, 401,402, ...) and write the name of this error (Declare enum HTTPError)
			System.out.println("Task 1.c");
			System.out.println("Please enter the number of the error:");
			
			int errorName = Integer.parseInt(br.readLine());
			
			switch (errorName) {
				case 400:
					System.out.println("Bad Request");
					break;
				case 401:
					System.out.println("Unauthorized");
					break;
				case 402: 
					System.out.println("Payment Required");
					break;
				case 403:
					System.out.println("Forbidden");
					break;
				case 404:
					System.out.println("Not Found");
					break;
				default: 
					System.out.println("Something else");
					
			}


	
	}
}

				
		

