package com.students;

import java.util.Comparator;

public class SortByCourse implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		
		return o1.getCourse()-o2.getCourse();
	}

	

	
	
}
