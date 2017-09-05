package com.university;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.Comparator;

public abstract class Faculty extends University {
    private int facultyNumber;
    private FacultyName facultyName;

    Faculty() {
        super();
    }

    public Faculty(String firstName, String middleName, String lastName, int facultyNumber, FacultyName facultyName) {
        super(firstName, middleName, lastName);
        this.facultyNumber = facultyNumber;
        this.facultyName = facultyName;
    }

    public int getFacultyNumber() {
        return facultyNumber;
    }

    public void setFacultyNumber(int facultyNumber) {
        this.facultyNumber = facultyNumber;
    }

    public FacultyName getFacultyName() {
        return facultyName;
    }

    public void setFacultyName(FacultyName facultyName) {
        this.facultyName = facultyName;
    }

    public void setFaculty(BufferedReader reader) {
        System.out.println("Choose the faculty (1-3):");
        System.out.println("1) Architecture");
        System.out.println("2) Computer Science");
        System.out.println("3) Geology");
        System.out.print("Your choice: ");
        int choiceOfFaculty = 0;
        try {
            choiceOfFaculty = Integer.parseInt(reader.readLine());
        } catch (NumberFormatException | IOException e) {
            System.err.println(e.getMessage());
            System.out.println("Something goes wrong, please retry");
            setFaculty(reader);
        }
        switch (choiceOfFaculty) {

        case 1:
            this.setFacultyNumber(choiceOfFaculty);
            this.setFacultyName(FacultyName.Architecture);
            break;
        case 2:
            this.setFacultyNumber(choiceOfFaculty);
            this.setFacultyName(FacultyName.Computer_Science);
            break;
        case 3:
            this.setFacultyNumber(choiceOfFaculty);
            this.setFacultyName(FacultyName.Geology);
            break;
        default:
            System.out.println("Wrong number, please retry");
            setFaculty(reader);

        }

    }

    public static final Comparator<Faculty> FacultyComparator = new Comparator<Faculty>() {

        @Override
        public int compare(Faculty o1, Faculty o2) {
            return o1.getFacultyName().toString().compareToIgnoreCase(o2.getFacultyName().toString());
        }

    };

}
