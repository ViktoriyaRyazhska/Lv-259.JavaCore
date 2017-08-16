package Practic.aven;

public class ArrayPractice {

	/*
	 * Create an array of ten integers. Display 
the biggest of these numbers;
the sum of positive numbers in the array;
the amount of negative numbers in the array.
    What values there are more: negative or positive?

	 */
	public static void main(String[] args) {
		
	
	int[] tenInts = {1, -3, 5, -7, -8, -111, 43, -65, -12, 4};
	//max
	
	int max = tenInts[0];
		int i = 0;
	
	while (i < tenInts.length) {
		if (tenInts[i] > max) {
			max = tenInts[i];
		}
		i++;
	}
	System.out.println("The biggest number is: "+ max);
	
	
	//sum of positive numbers
	
	int posSum = 0;
	for (i = 0; i < tenInts.length; i++) {
		if (tenInts[i] >= 0) {
			posSum += tenInts[i];
		}
	
	}
	System.out.println("Sum of positives: "+ posSum);
	
		
	
	//amount of negatives
	
	int negAmount = 0;
	for (int j : tenInts) {
		if (j < 0) {negAmount++;}
	}
	System.out.println("Amount of negatives: " + negAmount);
	
	
	//amount of values comparison
	
	int posAmount = 0;
	for (int k : tenInts) {
		if (k > 0) {posAmount++;}
	}
	
	if (posAmount > negAmount) {
		System.out.println("There are more positives");
	}else if (posAmount < negAmount) {
		System.out.println("There are more negatives");
	}else{
		System.out.println("There are equal amount of positives and negatives");
	}
	
	
	}
	
	
	}
	


