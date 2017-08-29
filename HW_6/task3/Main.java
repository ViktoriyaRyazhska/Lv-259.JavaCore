package task3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		List<Student> students = new ArrayList<>();
		
		students.add(new Student("Caprice", 11));
		students.add(new Student("Harley", 3));
		students.add(new Student("Erwin", 4));
		students.add(new Student("Taisha", 7));
		students.add(new Student("Harley", 9));
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the course number: ");
		Student.printStudents(students, sc.nextInt());
		
		menu(students, sc);
		
		sc.close();
	}
	
	public static void menu(List <Student> students, Scanner sc) {
		System.out.println("\nTo sort students: "
				+ "\n  1- Sort by name" 
				+ "\n  2- Sort by course"
				+ "\n  3- Exit");
		int input = sc.nextInt();
		switch (input) {
		case 1: students.sort(new SortByName());
			printSort(students);
			menu(students, sc);
			break;
		case 2: students.sort(new SortByCourse());
			printSort(students);
			menu(students, sc);
			break;
		case 3:
			System.out.println("Goodbye!");
			System.exit(0);
			break;
		default:
			System.out.println("You entered wrong!!!");
			menu(students, sc);
		}
	}
	
	public static void printSort(List <Student> students) {
		for (int i = 0; i < students.size(); i++) {
			System.out.println(students.get(i));
		}

	}

}
