package homework6.task3;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class Student {
	private String name;
	private Integer course;

	public Student(String name, int course) {
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

	public void setCourse(int course) {
		this.course = course;
	}

	public void inputInfo(BufferedReader reader) throws IOException {
		System.out.print("Enter the name of the student : ");
		this.setName(reader.readLine());
		System.out.print("Enter the name of the course : ");
		this.setCourse(Integer.parseInt(reader.readLine()));
	}

	@Override
	public String toString() {
		return "Student name=" + this.getName() + ", course=" + this.getCourse();
	}

	public void printStudents(List<Student> students, Integer course) {
		Iterator<Student> iterator = students.iterator();
		while (iterator.hasNext()) {
			Student current = iterator.next();
			if (current.getCourse().equals(course)) {
				System.out.println(current);
			}
		}
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

	static class NameComparator implements Comparator<Student> {

		@Override
		public int compare(Student o1, Student o2) {
			return o1.getName().compareTo(o2.getName());
		}

	}

	static class CourseComparator implements Comparator<Student> {

		@Override
		public int compare(Student o1, Student o2) {
			return o1.getCourse() - o2.getCourse();
		}

	}

}
