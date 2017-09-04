package task4;

import java.io.IOException;
import java.util.Scanner;

public class task4 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		//int[] array = {2, -3, 5, 0, 9, 6, 5, 1, 0, -4};
		int[] array = new int[10];
		Scanner sc = new Scanner(System.in);
		int i = 0;
		System.out.println("Enter a number");
		
		while (i < array.length) {
			int num = sc.nextInt();
			if (num > 0) {
				array[i] = num;
			} else {
				break;
			}
			i++;
		}
		
		int product = 1;
		for (i = 0; i < array.length; i++) {
			if (array[i] > 0) {
				product = product * array[i];
			}
		}
		System.out.println("Product = " + product);
	}

}
