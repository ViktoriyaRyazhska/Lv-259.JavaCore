package homework7.task1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task1 {

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter a sentence: ");
		String sentence = reader.readLine();
		String[] array = sentence.replaceAll("[^a-zA-Z_0-9\\. ]", "").split(" ");
		int maxlength = 0;
		int maxlengthIndex = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i].length() > maxlength) {
				maxlength = array[i].length();
				maxlengthIndex = i;
			}
		}
		System.out.println("The longest word is : " + array[maxlengthIndex] + " , it's length = " + maxlength);
		StringBuilder str = new StringBuilder(array[maxlengthIndex]);
		System.out.println(str + " in reverse is : " + str.reverse());

	}

}
