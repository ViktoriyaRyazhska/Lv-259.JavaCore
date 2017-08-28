package second.homework;
import java.util.Calendar;

public class Person {
	
	//fields
	private String name;
	private int birthYear;
	//constructors
	public Person() {}
	public Person(String name, int birthYear) {
		super();
		this.name = name;
		this.birthYear = birthYear;
	}
	//methods
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
	public int age () {
		
		int year = Calendar.getInstance().get(Calendar.YEAR);
		return (year - birthYear);	
	}
	public void changeName (String name) {
		this.name = name;
	}
		
}
