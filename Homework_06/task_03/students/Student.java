package com.students;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Map.Entry;

import java.util.Set;

public class Student {

	private String name;
	private int course;


	public Student(String name, int course) {
		super();
		this.name = name;
		this.course = course;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCourse() {
		return course;
	}

	public void setCourse(int course) {
		this.course = course;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + course;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (course != other.course)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
	// method printStudents 

	public static void printStudents(List<Student> list, Integer course) {
		int temp = 0;
		String name = " ";
		Iterator<Student> iter = list.listIterator();
		while(iter.hasNext()){
			Student student = iter.next();
			if(student.getCourse()==course){
				temp++;
				name += " "+ student.getName();
			}

		}
		if(temp == 0){
			System.out.println("There are no student's at the entered course");
		} else if(temp == 1){
			System.out.println("There is " + temp + " student in the " + course + " course:" + name);
		} else if(temp > 1){
		System.out.println("There are " + temp + " students in the " + course + " course:" + name);
		}

	}
	
 //	Methods for comparison

	
	public static void sortByName(List<Student> list) {

		Collections.sort(list, new SortByName());

		ListIterator<Student> it = list.listIterator();
		
		while (it.hasNext()) {
		Student student = it.next();
			System.out.println(student.getName() + " is studing on the " + student.getCourse() + " course");

		}
	}

	public static void sortByCourse(List<Student> list) {

		Collections.sort(list, new SortByCourse());
		
		ListIterator<Student> it = list.listIterator();
		while (it.hasNext()) {
			Student student = it.next();
			System.out.println(student.getCourse() + " " + student.getName());

		}

	}

}
