package com.university;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.Comparator;

public class Student extends Group {
    private int globalId;
    private int studentId;
    private int studentBirthYear;

    public Student() {
        super();
        University.increaseAmountOfStudents();
        University.increaseAmountOfPeople();
        this.setGlobalId(University.getAmountOfPeople());
        this.setStudentId(University.getAmountOfStudents());
    }

    public Student(boolean temp) {
        super();
    }

    public Student(String firstName, String middleName, String lastName, int studentBirthYear, int facultyNumber,
            FacultyName faculty, GroupNumber groupNumber) {
        super(firstName, middleName, lastName, facultyNumber, faculty, groupNumber);
        University.increaseAmountOfStudents();
        University.increaseAmountOfPeople();
        this.setGlobalId(University.getAmountOfPeople());
        this.setStudentId(University.getAmountOfStudents());
        this.studentBirthYear = studentBirthYear;

    }

    @Override
    public int getGlobalId() {
        return globalId;
    }

    public void setGlobalId(int globalId) {
        this.globalId = globalId;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public int getStudentBirthYear() {
        return studentBirthYear;
    }

    public void setStudentBirthYear(int studentBirthYear) {
        this.studentBirthYear = studentBirthYear;
    }

    @Override
    public void inputInformation(BufferedReader reader) {
        System.out.println("===Creating student's profile===");
        try {
            System.out.println("Global id = " + this.getGlobalId());
            System.out.println("Student id = " + this.getStudentId());
            this.setProfileName(reader);
            System.out.print("Enter year of birth: ");
            this.setStudentBirthYear(Integer.parseInt(reader.readLine()));
            this.setFaculty(reader);
            this.setGroup(this.getFacultyName(), reader);
            System.out.println("===Student's " + this.getLastName() + " " + this.getFirstName()
                    + " was succesfully created and added to group " + this.getGroupNumber() + " of "
                    + this.getFacultyName() + " faculty.===\n");

        } catch (IOException | NumberFormatException e) {
            e.printStackTrace();
        }
    }

    @Override
    public String toString() {
        String line = String.format(
                "[Student] [G_id=%03d] [S_id=%03d] [ Fist name=%-10s] [ Middle name=%-15s] [ Last name=%-15s] [ Faculty=%-17s] [ Group=%-25s] [ Birth year=%-12d]",
                this.getGlobalId(), this.getStudentId(), this.getFirstName(), this.getMiddleName(), this.getLastName(),
                this.getFacultyName().toString(), this.getGroupNumber().toString(), this.getStudentBirthYear());
        return line;
    }

    public static final Comparator<Student> BirthYearComparator = new Comparator<Student>() {

        @Override
        public int compare(Student o1, Student o2) {
            return o1.getStudentBirthYear() - o2.getStudentBirthYear();
        }

    };
    public static final Comparator<Student> StudentIdComparator = new Comparator<Student>() {

        @Override
        public int compare(Student o1, Student o2) {
            return o1.getStudentId() - o2.getStudentId();
        }

    };

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + globalId;
        result = prime * result + studentBirthYear;
        result = prime * result + studentId;
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
        if (globalId != other.globalId)
            return false;
        if (studentBirthYear != other.studentBirthYear)
            return false;
        if (studentId != other.studentId)
            return false;
        if (!this.getFirstName().equalsIgnoreCase(other.getFirstName())) {
            return false;
        }
        if (!this.getLastName().equalsIgnoreCase(other.getLastName())) {
            return false;
        }
        if (!this.getGroupNumber().toString().equalsIgnoreCase(other.getGroupNumber().toString())) {
            return false;
        }
        if (this.getStudentBirthYear() != other.getStudentBirthYear()) {
            return false;
        }
        if (!this.getFacultyName().toString().equalsIgnoreCase(other.getFacultyName().toString())) {
            return false;
        }

        return true;
    }

    public static void searchStudentByFirstName(Student obj, String firstName) {
        if (obj.getFirstName().equalsIgnoreCase(firstName)) {
            System.out.println(obj);
        }

    }

    public static void searchStudentByLastName(Student obj, String lastName) {
        if (obj.getLastName().equalsIgnoreCase(lastName)) {
            System.out.println(obj);
        }

    }

    public static void searchStudentByStudentId(Student obj, int id) {
        if (obj.getStudentId() == id) {
            System.out.println(obj);
        }
    }

    public static void searchStudentByBirthYear(Student obj, int birthYear) {
        if (obj.getStudentId() == birthYear) {
            System.out.println(obj);
        }
    }

    public static void searchStudentByFacultyName(Student obj, String facultyName) {
        if (obj.getFacultyName().toString().equalsIgnoreCase(facultyName)) {
            System.out.println(obj);
        }
    }

    public static void searchStudentByGroup(Student obj, String groupNumber) {
        if (obj.getGroupNumber().toString().equalsIgnoreCase(groupNumber)) {
            System.out.println(obj);
        }
    }

}
