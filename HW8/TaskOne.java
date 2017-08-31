package aven.eigtth.homework;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TaskOne {

	// public static void main(String[] args) {
	/*
	 * method div(), which calculates the dividing of two double numbers. In main
	 * method input 2 double numbers and call this method. Catch all exceptions.
	 */

	public static double div() {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter two doubles:");
		try {
			double n = Double.parseDouble(br.readLine());
			double k = Double.parseDouble(br.readLine());
			return n / k;
		} catch (NumberFormatException | IOException e) {
			return -1; 
		} catch (ArithmeticException e) {
			return -2;
		} catch (NullPointerException e) {
			return -3;
		} catch (Exception e) {
			return -4;
		}
	}

	public static void main(String[] args) {
		System.out.println(TaskOne.div());
	}

}
