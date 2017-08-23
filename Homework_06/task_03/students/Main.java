package com.students;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

public class Main {

	public static void main(String[] args) {

		// test method printStudents
		List<Student> students = new ArrayList<Student>();
		students.add(new Student("olesia", 5));
		students.add(new Student("ira", 3));
		students.add(new Student("olena", 2));
		students.add(new Student("katia", 1));
		students.add(new Student("maryna", 1));
		
		Student.printStudents(students, 8);
		
		

		/*List<Student> list = new ArrayList<Student>();
		list.add(new Student("Anna", 1));
		list.add(new Student("Bob", 2));
		list.add(new Student("Jayson", 6));
		list.add(new Student("Milana", 3));
		list.add(new Student("Charley", 4));
		System.out.println();
		Student.sortByName(list);
		System.out.println();
		Student.sortByCourse(list);*/

	}
}
