package homework;

public class Main {

	public static void main(String[] args) {
	Person person = new Person("Oleg", 1997);
	Person person1 = new Person("Yura", 1998);
	Person person2 = new Person("Olexsandr", 1999);
	Person person3 = new Person("Rostuk", 1999);
	Person person4 = new Person("Evgen", 1945);
	System.out.println(person.getAge());
	person.changeName("Anton");
	person.outputInformation();
	person.setBirthYear(1996);
	System.out.println(person.getAge());
	person.outputInformation();
	person1.outputInformation();
	person2.outputInformation();
	person3.outputInformation();
	person4.outputInformation();
	
	}

}
