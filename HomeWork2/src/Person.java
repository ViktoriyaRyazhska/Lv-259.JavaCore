import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Person {

	private static int thisYear = 2017;
	private String name;
	private int birthYear;
	
	BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
	
public String getName() {
	return name;
		}
	
public void setName(String name) {
	this.name = name;
		}

public int getBirthYear() {
	return birthYear;
		}

public void setBirthYear(int birthYear) {
	this.birthYear = birthYear;
		}

public Person() {}

public Person(String name, int birthYear) {
	this.name = name;
	this.birthYear = birthYear;
		}

public int Age() throws NumberFormatException, IOException  {
	return Person.thisYear - this.birthYear;
}
	public void Input () throws IOException {
		System.out.print("Hello, enter your Name: ");
		this.setName(br.readLine());
		System.out.println("Enter your birthyear ");
		this.setBirthYear(Integer.parseInt(br.readLine()));
	}

	public void Output() throws  {
		System.out.println("Person name: " + this.getName() + ", birthyear in: " + this.getBirthYear() + ", and have: " + this.Age() + "Year");
	}

	public void ChangeName() throws IOException {
		System.out.println("Enter your new name: ");
		this.setName(br.readLine());
		
	}
	
}
