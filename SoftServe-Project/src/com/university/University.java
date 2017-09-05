package com.university;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.Comparator;

public abstract class University {
    private static final String universityName = "NU\"LP\"";
    private static int amountOfStudents = 0;
    private static int amountOfTeachers = 0;
    private static int amountOfPeople = 0;
    private String firstName;
    private String lastName;
    private String middleName;

    public University() {
    }

    public University(String firstName, String middleName, String lastName) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;

    }

    public abstract int getGlobalId();

    public static int getAmountOfPeople() {
        return amountOfPeople;
    }

    public static String getUniversityName() {
        return universityName;
    }

    public static int getAmountOfStudents() {
        return amountOfStudents;
    }

    public static int getAmountOfTeachers() {
        return amountOfTeachers;
    }

    public static void increaseAmountOfStudents() {
        University.amountOfStudents++;
    }

    public static void increaseAmountOfTeachers() {
        University.amountOfTeachers++;
    }

    public static void increaseAmountOfPeople() {
        University.amountOfPeople++;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public void setProfileName(BufferedReader reader) {

        try {
            System.out.print("Enter first name: ");
            this.setFirstName(reader.readLine());
            System.out.print("Enter middle name: ");
            this.setMiddleName(reader.readLine());
            System.out.print("Enter last name: ");
            this.setLastName(reader.readLine());
        } catch (IOException e) {
            System.err.println(e.getMessage());
            System.out.println("Please, retry");
            setProfileName(reader);
        }
    }

    public abstract void inputInformation(BufferedReader reader);

    public static final Comparator<University> FirstNameComparator = new Comparator<University>() {

        @Override
        public int compare(University o1, University o2) {
            return o1.getFirstName().compareToIgnoreCase(o2.getFirstName());
        }

    };

    public static final Comparator<University> LastNameComparator = new Comparator<University>() {

        @Override
        public int compare(University o1, University o2) {
            return o1.getLastName().compareToIgnoreCase(o2.getLastName());
        }

    };

    public static final Comparator<University> GlobalIdComparator = new Comparator<University>() {

        @Override
        public int compare(University arg0, University arg1) {
            return arg0.getGlobalId() - arg1.getGlobalId();
        }

    };

    public static void searchProfileByGlobalId(University obj, int id) {
        if (obj.getGlobalId() == id) {
            System.out.println(obj);
        }
    }

}
