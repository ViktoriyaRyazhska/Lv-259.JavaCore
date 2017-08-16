package Homework;

public class Main {

	public static void main(String[] args) {
		Person Miha = new Person("Miha", 1988);
			Miha.output();
		Person Vasia = new Person("Vasia", 1990);
			Vasia.output();
		Person Sofia = new Person("Sofia", 2015);
			Sofia.output();
		Person Oksana = new Person("Oksana", 1992);
			Oksana.output();
			Oksana.changeName();
			System.out.println(Oksana.getName());
		Person Kristina = new Person("Kristina", 1988);
			Kristina.output();

	}

}
