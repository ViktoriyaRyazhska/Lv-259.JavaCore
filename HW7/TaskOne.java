package seventh.homework;

import java.util.Scanner;

public class TaskOne {

	public static void main(String[] args) {

		/*
		 * Enter in the console sentence of five words. display the longest word in the
		 * sentence determine the number of its letters bring the second word in reverse
		 * order
		 */

		System.out.println("Please, enter five-words sentence:");
		Scanner sc = new Scanner(System.in);

		String str = sc.nextLine();
		sc.close();
		String[] words = str.split(" ");

		// the longest word in the sentence
		// the number of letters in the longets word:

		String maxLength = words[0];
		for (int i = 0; i < words.length; i++) {
			if (words[i].length() > maxLength.length()) {
				maxLength = words[i];
			}
		}

		System.out.println("the longest word in the sentence is: " + maxLength + " with the number of letters: "
				+ maxLength.length());

		// bring the second word in reverse order

		for (int i = words[1].length() - 1; i >= 0; i--) {
			System.out.print(words[1].charAt(i));
		}

	}

}
