package task3;

import java.util.Iterator;
import java.util.List;

public class Student {

	private String name;
	private Integer course;
	
	public Student(String name, Integer course) {
		this.name = name;
		this.course = course;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getCourse() {
		return course;
	}

	public void setCourse(Integer course) {
		this.course = course;
	}
	
	@Override
	public String toString() {
		return "Student [name=" + name + ", course=" + course + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((course == null) ? 0 : course.hashCode());
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
		if (course == null) {
			if (other.course != null)
				return false;
		} else if (!course.equals(other.course))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	public static void printStudents(List<Student> list, Integer course) {
		Iterator<Student> iter = list.listIterator();
		while(iter.hasNext()){
			Student student = iter.next();
			if (student.getCourse().equals(course)) {
				System.out.println(student); 
			} // checking for other cases + if students with the same course are more than 1
		}
	}	
}
