package homework4.task1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task1 {

	public static int getMonthNumber(BufferedReader reader) throws IOException {
		System.out.print("Enter the number of the month: ");
		int number = Integer.parseInt(reader.readLine());
		while (true) {
			if (number > 0 && number < 13) {
				break;
			} else {
				System.out.print("Wrong value, please retry: ");
				number = Integer.parseInt(reader.readLine());
			}
		}
		return number;

	}

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int[] months = new int[] { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		int number = getMonthNumber(reader);
		System.out.println("The amount of days in month = " + months[number - 1]);

	}
}
