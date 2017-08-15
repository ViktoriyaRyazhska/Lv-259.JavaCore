package second.homework;

public class MainForSecondHomework {

	public static void main(String[] args) {
	
		Person first = new Person();
		Person second = new Person();
		Person third = new Person();
		Person forth = new Person();
		Person fifth = new Person("Alice", 1983);
		
		first.setName("First");
		first.setBirthYear(1951);
		
		second.setName("Second");
		second.setBirthYear(1997);
		
		third.setName("Third");
		third.setBirthYear(1987);
		
		forth.setName("Forth");
		forth.setBirthYear(1983);

	}

}
