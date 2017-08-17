package homework4.task4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task4 {

	public static void main(String[] args) throws IOException {
		int numb;
		int product = 1;
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		do {
			System.out.print("Enter a number: ");
			numb = Integer.parseInt(reader.readLine());
			if (numb > 0) {
				product *= numb;
			} else {
				break;
			}
		} while (numb > 0);
		System.out.print("Product of positive numbers = " + product);
	}

}
