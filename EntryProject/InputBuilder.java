package files.entree.project;

/**
 * implements possibility to getting information from user whether any help in
 * self organization is needed
 */

public class InputBuilder {
/**
 * 
 * @param userInput - gets String value from public static String userInput() method as user's category choice
 * @return object of parent PassionRoutes class (greetingUser) to pass it to further methods 
 * to allow handling of specified category
 */
	public static PassionRoutes greetingUser(String userInput) {

		PassionRoutes greetingUser = new PassionRoutes();
		switch (userInput) {
		case "WORK":
			System.out.println("Let's do some work.");
			greetingUser = new Work();
			break;
		case "STUDY":
			System.out.println("Let's learn");
			greetingUser = new Study();
			break;
		}
		return greetingUser; //returns object of chosen class work or study for now for further handling within methods
	}
/**
 * 
 * @return String userInput that contains user's choice of a category to thought about
 */
	public static String userInput() {
		System.out.println("Welcome. Use it well");
		System.out.println("Please choose the way to think on, select one of the following: " + "WORK, STUDY");
		String userInput = Main.sc.nextLine();
		return userInput.toString().trim().toUpperCase();

	}

}
