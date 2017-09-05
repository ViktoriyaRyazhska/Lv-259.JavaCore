package files.entree.project;

/**
 * @author Anna Venzhega 
 * implements ability to handle thoughts in a simple way
 */

public class PassionRoutes implements arrangeThoughts {

  //parent for classes that will implement specific categories of choices foe user to think about
 

	/**
	 * gets input of thoughts or plans to arrange from user
	 */
	protected String textInput;

	public PassionRoutes() {
	}

	public PassionRoutes(String textInput) {
		this.textInput = textInput;
	}

	public String getTextInput() {
		return textInput;
	}

	public void setTextInput(String textInput) {
		this.textInput = textInput;
	}

	@Override
	public String toString() {
		return "PassionRoutes textInput=" + textInput;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((textInput == null) ? 0 : textInput.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PassionRoutes other = (PassionRoutes) obj;
		if (textInput == null) {
			if (other.textInput != null)
				return false;
		} else if (!textInput.equals(other.textInput))
			return false;
		return true;
	}
/**
 * 
 * @return Boolean getThoughts() provides ability to decide whether user needs any arrangements to be performed
 * and whether further specific methods shall be hiring
 */
	public static Boolean getThoughts() {
		System.out.println("Would you like to arrange something?");
		String input = Main.sc.nextLine();
		if (input.toUpperCase().trim().contentEquals("YES")) {
			return true;

		} else {
			return false;
		}
	}

	@Override
	public void getInput() {
		System.out.println("Please try again later");
	}

	@Override
	public void passOutput() {
		System.out.println("Please try again later");
	}
}
