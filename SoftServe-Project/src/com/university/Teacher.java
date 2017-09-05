package com.university;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.Comparator;

public class Teacher extends Cathedra {
    private int globalId;

    private int teacherId;
    private String subject;

    public Teacher() {
        super();
        University.increaseAmountOfPeople();
        University.increaseAmountOfTeachers();
        this.setGlobalId(University.getAmountOfPeople());
        this.setTeacherId(University.getAmountOfTeachers());
    }

    public Teacher(boolean temp) {
        super();
    }

    public Teacher(String firstName, String middleName, String lastName, int facultyNumber, FacultyName faculty,
            CathedraName cathedra, String subject) {
        super(firstName, middleName, lastName, facultyNumber, faculty, cathedra);
        University.increaseAmountOfPeople();
        University.increaseAmountOfTeachers();
        this.setGlobalId(University.getAmountOfPeople());
        this.setTeacherId(University.getAmountOfTeachers());
        this.subject = subject;
    }

    public void setGlobalId(int globalId) {
        this.globalId = globalId;
    }

    @Override
    public int getGlobalId() {

        return globalId;
    }

    public int getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(int teacherId) {
        this.teacherId = teacherId;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    @Override
    public void inputInformation(BufferedReader reader) {
        System.out.println("===Creating teacher's profile===");
        try {
            System.out.println("Global id = " + this.getGlobalId());
            System.out.println("Teacher's id = " + this.getTeacherId());
            this.setProfileName(reader);
            this.setFaculty(reader);
            this.setCathedra(this.getFacultyName(), reader);
            System.out.print("Enter teacher's subject: ");
            this.setSubject(reader.readLine());
            System.out.println("===Teacher's profile " + this.getLastName() + " " + this.getFirstName()
                    + " was succesfully created and added to " + this.getCathedraName() + " of " + this.getFacultyName()
                    + " faculty.===\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public String toString() {
        String line = String.format(
                "[Teacher] [G_id=%03d] [T_id=%03d] [ Fist name=%-10s] [ Middle name=%-15s] [ Last name=%-15s] [ Faculty=%-17s] [ Cathedra=%-22s] [ Subject=%-15s]",
                this.getGlobalId(), this.getTeacherId(), this.getFirstName(), this.getMiddleName(), this.getLastName(),
                this.getFacultyName().toString(), this.getCathedraName().toString(), this.getSubject());
        return line;
    }

    public static final Comparator<Teacher> TeacherIdComparator = new Comparator<Teacher>() {

        @Override
        public int compare(Teacher o1, Teacher o2) {
            return o1.getTeacherId() - o2.getTeacherId();
        }

    };

    public static final Comparator<Teacher> SubjectComparator = new Comparator<Teacher>() {

        @Override
        public int compare(Teacher o1, Teacher o2) {
            return o1.getSubject().toString().compareToIgnoreCase(o2.getSubject().toString());
        }

    };

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + globalId;
        result = prime * result + ((subject == null) ? 0 : subject.hashCode());
        result = prime * result + teacherId;
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
        Teacher other = (Teacher) obj;
        if (globalId != other.globalId)
            return false;
        if (subject == null) {
            if (other.subject != null)
                return false;
        } else if (!subject.equals(other.subject))
            return false;
        if (teacherId != other.teacherId)
            return false;
        if (!this.getFirstName().equalsIgnoreCase(other.getFirstName())) {
            return false;
        }
        if (!this.getLastName().equalsIgnoreCase(other.getLastName())) {
            return false;
        }
        if (!this.getCathedraName().toString().equalsIgnoreCase(other.getCathedraName().toString())) {
            return false;
        }
        if (!this.getFacultyName().toString().equalsIgnoreCase(other.getFacultyName().toString())) {
            return false;
        }
        return true;
    }

    public static void searchTeacherByFirstName(Teacher obj, String firstName) {
        if (obj.getFirstName().equalsIgnoreCase(firstName)) {
            System.out.println(obj);
        }
    }

    public static void searchTeacherByLastName(Teacher obj, String lastName) {
        if (obj.getLastName().equalsIgnoreCase(lastName)) {
            System.out.println(obj);
        }
    }

    public static void searchTeacherByTeacherId(Teacher obj, int id) {
        if (obj.getTeacherId() == id) {
            System.out.println(obj);
        }
    }

    public static void searchTeacherByFacultyName(Teacher obj, String facultyName) {
        if (obj.getFacultyName().toString().equalsIgnoreCase(facultyName)) {
            System.out.println(obj);
        }
    }

    public static void searchTeacherByCathedraName(Teacher obj, String cathedraName) {
        if (obj.getCathedraName().toString().equalsIgnoreCase(cathedraName)) {
            System.out.println(obj);
        }
    }

    public static void searchTeacherBySubject(Teacher obj, String subject) {
        if (obj.getSubject().toString().equalsIgnoreCase(subject)) {
            System.out.println(obj);
        }
    }

}
