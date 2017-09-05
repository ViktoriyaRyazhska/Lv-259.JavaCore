package com.university;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.Comparator;

public abstract class Cathedra extends Faculty {
    private CathedraName cathedraName;

    public Cathedra() {
        super();
    }

    public Cathedra(String firstName, String middleName, String lastName,int facultyNumber, FacultyName faculty, CathedraName cathedraName) {
        super(firstName,middleName,lastName,facultyNumber, faculty);
        this.cathedraName = cathedraName;
    }

    public CathedraName getCathedraName() {
        return cathedraName;
    }

    public void setCathedraName(CathedraName cathedraName) {
        this.cathedraName = cathedraName;
    }

    public void setCathedra(FacultyName facultyName, BufferedReader reader) {
        if (facultyName == FacultyName.Architecture) {
            System.out.println("Cathedras for faculty " + facultyName + ": ");
            System.out.println("1) Architecture Cathedra");
            System.out.println("2) Physics Cathedra");
            System.out.print("Your choice: ");
            int choiceOfCathedra = 0;
            try {
                choiceOfCathedra = Integer.parseInt(reader.readLine());
            } catch (NumberFormatException | IOException e) {
                System.err.println(e.getMessage());
                System.out.println("Something goes wrong, please retry");
                setCathedra(facultyName, reader);
            }
            switch (choiceOfCathedra) {
            case 1:
                this.setCathedraName(CathedraName.Architecture_Cathedra);
                break;
            case 2:
                this.setCathedraName(CathedraName.Physics_Cathedra);
                break;
            default:
                System.out.println("Wrong number, please retry");
                setCathedra(facultyName, reader);
            }

        } else if (facultyName == FacultyName.Computer_Science) {
            System.out.println("Cathedras for faculty " + facultyName + ": ");
            System.out.println("1) Computer Science Cathedra");
            System.out.println("2) Maths Cathedra");
            System.out.print("Your choice: ");
            int choiceOfCathedra = 0;
            try {
                choiceOfCathedra = Integer.parseInt(reader.readLine());
            } catch (NumberFormatException | IOException e) {
                System.err.println(e.getMessage());
                System.out.println("Something goes wrong, please retry");
                setCathedra(facultyName, reader);
            }
            switch (choiceOfCathedra) {
            case 1:
                this.setCathedraName(CathedraName.ComputerScience_Cathedra);
                break;
            case 2:
                this.setCathedraName(CathedraName.Maths_Cathedra);
                break;
            default:
                System.out.println("Wrong number, please retry");
                setCathedra(facultyName, reader);
            }
        } else if (facultyName == FacultyName.Geology) {
            System.out.println("Cathedras for faculty " + facultyName + ": ");
            System.out.println("1) Geology Cathedra");
            System.out.println("2) Chemistry Cathedra");
            System.out.print("Your choice: ");
            int choiceOfCathedra = 0;
            try {
                choiceOfCathedra = Integer.parseInt(reader.readLine());
            } catch (NumberFormatException | IOException e) {
                System.err.println(e.getMessage());
                System.out.println("Something goes wrong, please retry");
                setCathedra(facultyName, reader);
            }
            switch (choiceOfCathedra) {
            case 1:
                this.setCathedraName(CathedraName.Geology_Cathedra);
                break;
            case 2:
                this.setCathedraName(CathedraName.Chemistry_Cathedra);
                break;
            default:
                System.out.println("Wrong number, please retry");
                setCathedra(facultyName, reader);
            }

        }

    }
    public static final Comparator<Cathedra> CathedraComparator = new Comparator<Cathedra>() {

        @Override
        public int compare(Cathedra o1, Cathedra o2) {
            return o1.getCathedraName().toString().compareToIgnoreCase(o2.getCathedraName().toString());
        }

    };

}
