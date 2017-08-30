package com.pack2;

import java.util.Scanner;

public class Main {

	///TASK_2
	
	static int readNumber(int start, int end, Scanner sc) throws MyException {

		System.out.println("Enter the number to chek");
		String input = sc.next();

		if (input.matches("[0-9]+")) {

			int number = Integer.parseInt(input);

			if ((number > start) && (number < end)) {

				return number;
			} else {
				throw new MyException("error input");
			}

		} else {
			throw new MyException("error input");
		}

	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		
		try {
			int a = readNumber(5, 10, sc);
			System.out.println(a);
		} catch (MyException e) {
			System.out.println(e.getMessage());
		}
		
		
		

	}
}
