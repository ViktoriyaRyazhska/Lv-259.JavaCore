package com.university;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.Comparator;

public abstract class Group extends Faculty {
    private GroupNumber groupNumber;

    public Group() {
        super();
    }

    public Group(String firstName, String middleName, String lastName,int facultyNumber, FacultyName faculty, GroupNumber groupNumber) {
        super(firstName,middleName,lastName,facultyNumber, faculty);
        this.groupNumber = groupNumber;
    }

    public GroupNumber getGroupNumber() {
        return groupNumber;
    }

    public void setGroupNumber(GroupNumber groupNumber) {
        this.groupNumber = groupNumber;
    }

    public void setGroup(FacultyName facultyName, BufferedReader reader) {
        if (facultyName == FacultyName.Architecture) {
            System.out.println("Avaliable groups for faculty " + facultyName + ": A_11, A_21, A_31");
        } else if (facultyName == FacultyName.Computer_Science) {
            System.out.println("Avaliable groups for faculty " + facultyName + ": C_12, C_22, C_32");
        } else if (facultyName == FacultyName.Geology) {
            System.out.println("Avaliable groups for faculty " + facultyName + ": G_13, G_23, G_33");
        }
        System.out.print("Please choose a group (only number): ");
        int choiceOfGroup = 0;
        try {
            choiceOfGroup = Integer.parseInt(reader.readLine());
        } catch (NumberFormatException | IOException e) {
            System.err.println(e.getMessage());
            System.out.println("Something goes wrong, please retry");
            setGroup(facultyName, reader);
        }
        if (facultyName == FacultyName.Architecture) {
            switch (choiceOfGroup) {
            case 11:
                this.setGroupNumber(GroupNumber.A_11);
                break;
            case 21:
                this.setGroupNumber(GroupNumber.A_21);
                break;
            case 31:
                this.setGroupNumber(GroupNumber.A_31);
                break;
            default:
                System.out.println("Wrong number, please retry");
                setGroup(facultyName, reader);
            }
        }
        if (facultyName == FacultyName.Computer_Science) {
            switch (choiceOfGroup) {
            case 12:
                this.setGroupNumber(GroupNumber.C_12);
                break;
            case 22:
                this.setGroupNumber(GroupNumber.C_22);
                break;
            case 32:
                this.setGroupNumber(GroupNumber.C_32);
                break;
            default:
                System.out.println("Wrong number, please retry");
                setGroup(facultyName, reader);
            }
        }
        if (facultyName == FacultyName.Geology) {
            switch (choiceOfGroup) {
            case 13:
                this.setGroupNumber(GroupNumber.G_13);
                break;
            case 23:
                this.setGroupNumber(GroupNumber.G_23);
                break;
            case 33:
                this.setGroupNumber(GroupNumber.G_33);
                break;
            default:
                System.out.println("Wrong number, please retry");
                setGroup(facultyName, reader);
            }
        }

    }
    
    public static final Comparator<Group> GroupComparator = new Comparator<Group>() {

        @Override
        public int compare(Group o1, Group o2) {
            return o1.getGroupNumber().toString().compareToIgnoreCase(o2.getGroupNumber().toString());
        }

    };

}
