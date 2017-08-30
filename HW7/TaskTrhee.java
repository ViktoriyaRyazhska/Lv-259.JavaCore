package seventh.homework;
import java.util.Scanner;
import java.util.regex.*;


public class TaskTrhee {

	public static void main(String[] args) {
		/*
		 * Implement a pattern for US currency: the first symbol "$", then any number of digits, 
		 * dot and two digits after the dot. Enter the text from the console that contains several 
		 * occurrences of US currency. Display all occurrences on the screen.
		 */

		String pattern = "^\\$+\\d+(\\.)+[0-9]{2}";
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please, enter a couple of dollar money amounts:");
		String text = sc.nextLine();
		sc.close();
		
		String [] tests = text.split(" ");
		
		Pattern p = Pattern.compile(pattern);
		Matcher m = p.matcher(tests[0]);
		
		
		for (int i = 0; i < tests.length; i++) {
			m = p.matcher(tests[i]);
			if (m.matches()) {
				System.out.print(tests[i]);
				m.reset();
				System.out.println();	
			}
		}
		
	}
}



