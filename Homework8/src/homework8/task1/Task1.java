package homework8.task1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task1 {

	public static double div(double a, double b) throws ArithmeticException {
		if (b > 0) {
			return a / b;
		} else {
			throw new ArithmeticException("Can't divide by 0");
		}
	}

	public static void main(String[] args) throws IOException, NumberFormatException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		try {
			System.out.print("Enter first value: ");
			double firstValue = Double.parseDouble(reader.readLine());
			System.out.print("Enter second value: ");
			double secondValue = Double.parseDouble(reader.readLine());
			System.out.println(firstValue + " / " + secondValue + " = " + div(firstValue, secondValue));

		}
		catch(IOException|NumberFormatException|ArithmeticException e) {
			System.err.println(e.getMessage() + "\n");
		}
	}

}
