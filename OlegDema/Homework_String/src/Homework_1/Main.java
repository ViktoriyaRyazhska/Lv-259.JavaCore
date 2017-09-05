package Homework_1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter sentence of five words");
		String sentence = scanner.nextLine();
		String []masWord = sentence.split(" ");
		String maxWord = masWord[0];
		String secMasxWord = masWord[0];
		
		for (String string : masWord) {
			if(string.length()>maxWord.length()){
				maxWord=string;
			}
		}
		
		for(int i=maxWord.length()-1;i>0;i--){
			for (String string : masWord) {
				if(string.length() == i){
					secMasxWord = string;
					break;
				}
			}
			break;
		}
		
		
		System.out.println(maxWord);
		System.out.println("Letters: "+maxWord.length());
		System.out.println("Second max "+secMasxWord);
		System.out.println(new StringBuilder(masWord[1]).reverse().toString());
		
	}

}
