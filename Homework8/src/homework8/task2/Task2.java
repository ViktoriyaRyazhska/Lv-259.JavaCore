package homework8.task2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task2 {

	public static int readNumber(int start, int end, BufferedReader reader)
			throws NumberFormatException, IOException, TaskException {
		System.out.print("Enter a value: ");
		int value = Integer.parseInt(reader.readLine());
		if ((value >= start) && (value <= end)) {
			return value;
		} else {
			throw new TaskException("Value must be in range [" + start + ";" + end + "]");
		}

	}

	public static void main(String[] args) {
		int rangeStart = 10;
		int rangeEnd = 50;
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		try {
			System.out.print("Enter range's start: ");
			rangeStart=Integer.parseInt(reader.readLine());
			System.out.print("Enter range's end: ");
			rangeEnd=Integer.parseInt(reader.readLine());
		}
		catch(IOException|NumberFormatException e) {
//			System.err.println(e.getMessage());
			e.printStackTrace();
			System.exit(0);
		}
		for (int i = 0; i < 10; i++) {
			try {

				readNumber(rangeStart, rangeEnd, reader);

			} catch (TaskException | IOException | NumberFormatException e) {
				System.err.println(e.getMessage()+"\n");
			}
		}
	}

}
