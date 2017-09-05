package files.entree.project;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/**
 * implements handling of thoughts in Work life direction
 */
public class Work extends PassionRoutes implements arrangeThoughts {
	/**
	 * gets category of thoughts or plans to arrange from user
	 */
	String category;
	/**
	 * gets category of thoughts or plans to arrange from user
	 */
	int priority;

	// Collections to be used to arrange user data
	Map<Integer, String> workOrdering = new TreeMap<Integer, String>();
	List<String> mainList = new ArrayList<String>();
	List<Work> linkedSubList = new LinkedList<Work>();

	public Work() {
		super();
	}

	public Work(String textInput) {
		super(textInput);
	}

	public Work(int priority, String category) {
		super();
		this.priority = priority;
		this.category = category;
	}

	public int getPriority() {
		return priority;
	}

	public void setPriority(int priority) {
		this.priority = priority;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	@Override
	public String toString() {
		return "Work category = " + category + " text = " + textInput + " priority=" + priority;
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
		Work other = (Work) obj;
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
		String[] tmpList = { "PLAN", "STRATEGY", "TEST" };
		for (String s : tmpList) {
			mainList.add(s);
		}
		String isContinue = null;
		do {
			System.out.println("Please choose among subjects listed below:" + mainList);
			String subjInput = Main.sc.nextLine().toUpperCase().trim();
			for (int i = 0; i < tmpList.length; i++) {
				if (tmpList[i].contentEquals(subjInput)) {
					Work obj = new Work();
					obj.setCategory(subjInput);

					System.out.println("leave your thoughts here:");
					String userInput = Main.sc.nextLine();
					workOrdering.put(i + 1, userInput);
					textInput = workOrdering.toString();
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

		File file = new File("file1.txt");
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