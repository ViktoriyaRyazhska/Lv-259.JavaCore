package regina.com;

import java.util.*;

import static regina.com.Student.printStudent;

public class Main {

    public static void main(String[] args) {
        // write your code here
        List<Student> students = new ArrayList<Student>();
        students.add(new Student("Polischuk",5));
        students.add(new Student("Onyschuk",2));
        students.add(new Student("Yurkivska",4));
        students.add(new Student("Lekh",3));
        students.add(new Student("Monzolevskiy",5));

        List<Student> list1 = new ArrayList<>();
        list1.addAll(students);
        printStudent(list1,4 );

        System.out.println();

        List<Student> list2 = new ArrayList<Student>();
        list2.addAll(students);
        System.out.println("Students sorted by name:");

        list2.sort(new Student.NameComparator());
        for (Student student : list2){
            System.out.println(student);
        }

        System.out.println();

        List<Student>list3 = new ArrayList<Student>();
        list3.addAll(students);
        System.out.println("Students sorted by course:");
        list3.sort(new Student.CourseComparator());
        for (Student student : list3) {
            System.out.println(student);
        }
    }
}

        /*Write class Student that provides information about the name of the student and his course.
        Class Student should consists of properties for access to these fields
        constructor with parameters
        method printStudents (List students, Integer course),
        which receives a list of students and the course number and prints to the console
        the names of the students from the list, which are taught in this course (use an iterator)
        methods to compare students by name and by course
        In the main() method
        declare List students
        and add to the list five different students

        display the list of students ordered by name
        display the list of students ordered by course.*/

       