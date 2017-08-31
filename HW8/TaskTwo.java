package aven.eigtth.homework;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * 		 * Write a method readNumber(int start, int end), that read from console integer
		 * number and return it, if it is in the range [start...end]. If an invalid
		 * number or non-number text is read, the method should throw an exception.
		 * Using this method write a method main(), that has to enter 10 numbers:
		 * a1, a2, ..., a10, such that 1 < a1 < ... < a10 < 100
 */
public class TaskTwo {
	int start;
	int end;
	static int k;

	public static int readNumber(int start, int end) throws newException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			k = Integer.parseInt(br.readLine());
			return k;
		} catch (NumberFormatException | IOException e) {
			return -1;
		} catch (ArithmeticException e) {
			return -2;
		} finally {
			if (k > start && k < end) {
				System.out.println(k);
			}else {
				throw new newException("error occured: number is not in defined range");
			}
		}
	}
	
	public static void main(String[] args) throws newException {
		
		int [] mainNumbers = new int [10];
			System.out.println("Please, enter ten integers between 1 and 100:");
			for (int i = 0; i < mainNumbers.length; i++) {
				mainNumbers[i] = readNumber(1, 100);		
	
		}

	}
}

