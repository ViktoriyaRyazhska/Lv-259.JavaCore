package Homework_3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Main {

	public static void printStudents(List<Student> students,int course){
		Iterator<Student> iterator = students.iterator();
		while (iterator.hasNext()) {
			Student student = (Student) iterator.next();
			if(student.getCourse() == course){
				System.out.println(student.getName());
			}
			
		}
	}
	
	public static void main(String[] args) {
		List<Student> students1 = new ArrayList<Student>();
		students1.add(new Student("Oleg", 2));
		students1.add(new Student("Yura", 1));
		students1.add(new Student("Gena", 1));
		students1.add(new Student("Kulik", 2));
		students1.add(new Student("Admin", 2));
		printStudents(students1, 2);

		System.out.println();
		System.out.println();
		
		students1.sort(new NameComparator());
		for (Student student : students1) {
			System.out.println(student);
		}
		
		System.out.println();
		System.out.println();
		
		students1.sort(new CourseComparator());
		for (Student student : students1) {
			System.out.println(student);
		}
	}

}
