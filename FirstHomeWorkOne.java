import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FirstHomeWorkOne {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		//Define String variables name and address. Output question "What is your name?" 
		//Read the value name and output next question: �Where are you live, (name)?". Read address and write whole information.
		

		String name;
		String address;
		
		BufferedReader br = new BufferedReader(
				new InputStreamReader(System.in));
		
		System.out.println("What is your name?");
		name = br.readLine();
		
		System.out.println("Where are you live, " + name + "?");
		address = br.readLine();
		
		System.out.println(name + ", you live at " + address);
	}

}
