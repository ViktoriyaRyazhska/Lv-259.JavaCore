<<<<<<< HEAD
package homework6.task3;

import java.util.ArrayList;
import java.util.List;




public class Main {

	public static void main(String[] args) {
		
		List<Student> students = new ArrayList<>();
		students.add(new Student("Oleg", 1));
		students.add(new Student("Igor", 2));
		students.add(new Student("Andrii", 5));
		students.add(new Student("Yurii", 3));
		students.add(new Student("Nazar", 1));
		System.out.println("===Sorting by name=== ");

		students.sort(new Student.NameComparator());

		for (int i = 0; i < students.size(); i++) {
			System.out.println(students.get(i));
		}
		
		System.out.println("\n===Sorting by course===");

		students.sort(new Student.CourseComparator());

		for (int i = 0; i < students.size(); i++) {
			System.out.println(students.get(i));
		}
		
	}

}
=======
package homework6.task3;

import java.util.ArrayList;
import java.util.List;




public class Main {

	public static void main(String[] args) {
		
		List<Student> students = new ArrayList<>();
		students.add(new Student("Oleg", 1));
		students.add(new Student("Igor", 2));
		students.add(new Student("Andrii", 5));
		students.add(new Student("Yurii", 3));
		students.add(new Student("Nazar", 1));
		System.out.println("===Sorting by name=== ");

		students.sort(new Student.NameComparator());

		for (int i = 0; i < students.size(); i++) {
			System.out.println(students.get(i));
		}
		
		System.out.println("\n===Sorting by course===");

		students.sort(new Student.CourseComparator());

		for (int i = 0; i < students.size(); i++) {
			System.out.println(students.get(i));
		}
		
	}

}
>>>>>>> 59626368d5152004bbb3464c28e5bfbc0954faaa
