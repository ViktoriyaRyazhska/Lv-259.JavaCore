package Homework3;

public class Student {
	private String name;
	private int course;
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
	public Student(){};
	public Student (String n, int c){
		this.name = n;
		this.course = c;
	}
	
}
