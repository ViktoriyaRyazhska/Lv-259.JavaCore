package files.entree.project;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * implements handling of thoughts in Study direction
 */
public class Study extends PassionRoutes implements arrangeThoughts {
	/**
	 * gets category of thoughts or plans to arrange from user
	 */
	int priority;
	/**
	 * gets category of thoughts or plans to arrange from user
	 */
	String category;

	// Collections to be used to arrange user data
	List<String> mainList = new ArrayList<String>();
	List<Study> linkedSubList = new LinkedList<Study>();

	public Study() {
		super();
	}

	public Study(String textInput) {
		super(textInput);
	}

	public Study(String textInput, int priority, String category) {
		super(textInput);
		this.priority = priority;
		this.category = category;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public int getPriority() {
		return priority;
	}

	public void setPriority(int priority) {
		this.priority = priority;
	}

	@Override
	public String toString() {
		return "Study category = " + category + " text = " + textInput + " priority=" + priority;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + priority;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Study other = (Study) obj;
		if (priority != other.priority)
			return false;
		return true;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see files.entree.project.PassionRoutes#getInput()
	 */
	@Override
	public void getInput() {
		// implements arrangement of study related data as lists if any data input is
		// complements with provided categories
		String[] tmpList = { "PHYSICS", "MATH", "LITERATURE", "HUMANITIES" };
		for (String s : tmpList) {
			mainList.add(s);
		}
		String isContinue = null;
		do {
			System.out.println("Please choose among subjects listed below:" + mainList);
			String subjInput = Main.sc.nextLine().toUpperCase().trim();
			for (int i = 0; i < tmpList.length; i++) {
				if (tmpList[i].contentEquals(subjInput)) {
					Study obj = new Study();
					obj.setCategory(subjInput);

					System.out.println("leave your thoughts here:");
					textInput = Main.sc.nextLine();
					obj.setTextInput(textInput);

					System.out.println("Please set estimated priority:");
					priority = Integer.parseInt(Main.sc.nextLine());
					obj.setPriority(priority);

					linkedSubList.add(obj);
				}
			}
			System.out.println("Would you like to arrange something else?");
			isContinue = Main.sc.nextLine();
		} while (isContinue.toUpperCase().trim().contentEquals("YES"));
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see files.entree.project.PassionRoutes#passOutput()
	 */
	@Override
	public void passOutput() {

		File file = new File("file2.txt");
		BufferedWriter brw = null;
		try {
			brw = new BufferedWriter(new FileWriter(file));
			brw.write("Here are your plans:" + linkedSubList);
			brw.flush();
			brw.close();
		} catch (IOException e) {
			System.out.println("cannot create file");
			e.printStackTrace();
		}

	}

}
