package regina.com;

import java.util.Comparator;
import java.util.List;

public class Student {
    private String name;
    private int course;

    protected Student(String name, int course) {
        this.name = name;
        this.course = course;
    }

    @Override
    public String toString() {
        return "Student: " + name + ", course: " + course;
    }

    protected static void printStudent(List<Student> students, Integer course) {
        for (Student student : students) {
            if (student.getCourse() == course) {
                System.out.println(student);
            }
        }
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public static class NameComparator implements Comparator<Student> {

        @Override
        public int compare(Student o1, Student o2) {
            return o1.name.compareTo(o2.name);
        }
    }

    public static class CourseComparator implements Comparator<Student> {
        @Override
        public int compare(Student o1, Student o2) {
            return o1.course - o2.course;
        }
    }
}


