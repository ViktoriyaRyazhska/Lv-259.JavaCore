package com.university;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        BufferedWriter bw = null;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<University> allPeople = new ArrayList<>();
        List<Student> students = new ArrayList<>();
        List<Teacher> teachers = new ArrayList<>();
        students.add(new Student("Andrii", "Petrovych", "Hil", 1998, 1, FacultyName.Architecture, GroupNumber.A_11));
        students.add(
                new Student("Roman", "Olegovych", "Nate", 1999, 2, FacultyName.Computer_Science, GroupNumber.C_22));
        students.add(new Student("Bogdan", "Ostapovych", "Ansor", 1997, 3, FacultyName.Geology, GroupNumber.G_33));
        students.add(
                new Student("Vasia", "Petrovych", "Vakharuk", 2000, 1, FacultyName.Architecture, GroupNumber.A_11));
        students.add(
                new Student("Nazar", "Romanovych", "Sekh", 1998, 2, FacultyName.Computer_Science, GroupNumber.C_22));
        students.add(new Student("Yurii", "Olegovych", "Yunko", 1996, 3, FacultyName.Geology, GroupNumber.G_33));
        teachers.add(new Teacher("Khrystyna", "Bogdanyvna", "Sheremet", 2, FacultyName.Computer_Science,
                CathedraName.Maths_Cathedra, "Maths analyzis"));
        teachers.add(new Teacher("Yaroslav", "Dmytrovych", "Vasylytsya", 1, FacultyName.Architecture,
                CathedraName.Architecture_Cathedra, "Architecture"));
        teachers.add(new Teacher("Natalya", "Dmytrivna", "Zolotova", 3, FacultyName.Geology,
                CathedraName.Geology_Cathedra, "Geology"));
        allPeople.addAll(students);
        allPeople.addAll(teachers);
        allPeople.sort(University.GlobalIdComparator);

        Menu.mainMenu(allPeople, students, teachers, reader, bw);

    }
}
