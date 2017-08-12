import java.io.IOException;
import java.util.Scanner;

public class Golova {

	public static void main(String [] args) throws NumberFormatException, IOException {
		
		Person man1 = new Person ();
		
		man1.setName("Yura");
		man1.setBirthYear(1999);
		
		man1.Age();
		System.out.println(man1.Age());	

		man1.Input();
		man1.Output();
		
		man1.ChangeName();
		
		man1.Output();
		
		
Person man2 = new Person ();
		
		man2.setName("A");
		man2.setBirthYear(1958);
		
		man2.Age();
		System.out.println(man1.Age());	

		man2.Input();
		man2.Output();
		
		man2.ChangeName();
		
		man2.Output();
		
Person man3 = new Person ();
		
		man3.setName("B");
		man3.setBirthYear(2001);
		
		man3.Age();
		System.out.println(man1.Age());	

		man3.Input();
		man3.Output();
		
		man3.ChangeName();
		
		man3.Output();
		
Person man4 = new Person ();
		
		man4.setName("C");
		man4.setBirthYear(1996);
		
		man4.Age();
		System.out.println(man1.Age());	

		man4.Input();
		man4.Output();
		
		man4.ChangeName();
		
		man4.Output();

		
Person man5 = new Person ();
		
		man5.setName("D");
		man5.setBirthYear(1978);
		
		man5.Age();
		System.out.println(man1.Age());	

		man5.Input();
		man5.Output();
		
		man5.ChangeName();
		
		man5.Output();
		
	}
}