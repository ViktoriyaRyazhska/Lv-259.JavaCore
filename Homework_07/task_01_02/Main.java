package com.pack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		////////////////////////////////////////////////////////////////////////////////////
		// TASK 1
		// display the longest word in the sentence

		System.out.println("Enter a sentence wich consist 5 words");
		String sentence = br.readLine();
		
		System.out.println(sentence);

		String[] massStr = sentence.split(" ");
		String str = " ";
		int numberOfLetters = 0;
		for (int i = 0; i < massStr.length; i++) {
			if (massStr[i].length() >= str.length()) {
				str = massStr[i];
				numberOfLetters = str.length();
			}
		}
		System.out.println("The longest word is " + str);

		// determine the number of its letters

		System.out.println("The number of letters in the longest word is " + numberOfLetters);

		// bring the second word in reverse order

		String secondWord = massStr[1];
		System.out.println("Second word in a common order - " + secondWord);
		StringBuffer buf = new StringBuffer(secondWord);
		System.out.println("Second word in a reverse order - " + buf.reverse()); 

		/////////////////////////////////////////////////////////////////////
//TASK2
		//Enter a sentence that contains the words between more than one space 
		//Convert all spaces, consecutive, one
		
		String sentence2 = "Actions    speak  louder   than    words";
		System.out.println(sentence2.replaceAll("\\s+", " "));
		
	}
}
