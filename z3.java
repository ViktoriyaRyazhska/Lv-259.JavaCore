package Homework;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class z3 {

	public static void main(String[] args) {
		System.out.println("Enter the text");
		Scanner scn = new Scanner(System.in);
		String s= scn.nextLine();
				
		Pattern p = Pattern.compile("\\${1}(\\d*)(\\.\\d{2})?");
		Matcher m = p.matcher(s);

		if (m.matches()) {
			System.out.print("US currency");
			m.reset();			
			}else System.out.println("Not US currency");
	

	}
}
