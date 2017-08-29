package seventh.homework;

import java.util.Scanner;

public class TaskTwo {

	public static void main(String[] args) {
		/*
		 * Enter a sentence that contains the words between more than one space. Convert all spaces, consecutive, one. For example, if we introduce the sentence 
		 * "I    am      learning     Java   Core», we have to get the "I'm learning Java Core»
		 */
		System.out.println("Please enter a lot of spaces between words of any sentence: ");
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		
		
		//String rStr = str.replaceAll("( )+", " ");
		System.out.println("The right sentence will be: " + str.trim().replaceAll("\\s{2,}", " ").replaceAll("\\t", " "));
		
		sc.close();
		
	}

}