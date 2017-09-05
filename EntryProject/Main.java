/*
 * This software is intended to help gathering together plans and thoughts for specific categories 
 * It is possible to choose between study and work categories for now
 */

package files.entree.project;

import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static final Scanner sc = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
		/**
		 * all calculations of the project are happens through
		 */

		/*
		 * based on user choice whether to write something and in what category, specific methods 
		 * of corresponding class are called
		 */
		
		Boolean getThoughts = PassionRoutes.getThoughts(); //getting user decision to write
		if (getThoughts == true) {
			String userInput = InputBuilder.userInput(); //getting user choice of a category
			if ((InputBuilder.greetingUser(userInput)).toString() != null) {
				PassionRoutes choosedRoute = InputBuilder.greetingUser(userInput); //deciding what class should be used
				choosedRoute.getInput();
				choosedRoute.passOutput();
			} else {
				System.out.println("Ok, see you round");
			}
		} else {
			System.out.println("Ok, see you round");
		}
		sc.close();		
	}
}
