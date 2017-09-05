package com.university;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;;

public interface Menu {

    public static void doSomeSpace() {
        for (int i = 0; i < 2; i++) {
            System.out.println("");
        }

    }

    public static void addNewStudent(List<University> allPeople, List<Student> students, List<Teacher> teachers,
            BufferedReader reader, BufferedWriter bw) {
        Student tempStudent = new Student();
        tempStudent.inputInformation(reader);
        allPeople.add(tempStudent);
        students.add(tempStudent);
        mainMenu(allPeople, students, teachers, reader, bw);

    }

    public static void addNewTeacher(List<University> allPeople, List<Student> students, List<Teacher> teachers,
            BufferedReader reader, BufferedWriter bw) {

        Teacher tempTeacher = new Teacher();
        tempTeacher.inputInformation(reader);
        allPeople.add(tempTeacher);
        teachers.add(tempTeacher);
        doSomeSpace();
        mainMenu(allPeople, students, teachers, reader, bw);
    }
    
    public static void AddMenu(List<University> allPeople, List<Student> students, List<Teacher> teachers,
            BufferedReader reader, BufferedWriter bw) {
        System.out.println("1) Add new student");
        System.out.println("2) Add new teacher");
        System.out.println("3) Back to menu");
        int choiceOfAdding = 0;
        try {
            System.out.print("\nYour choice: ");
            choiceOfAdding = Integer.parseInt(reader.readLine());
        } catch (IOException | NumberFormatException e) {
            System.err.println(e.getMessage());
            System.out.println("Invalid number. Going back to main menu");
            doSomeSpace();
            mainMenu(allPeople, students, teachers, reader, bw);
        }
        switch (choiceOfAdding) {
        case 1:
            addNewStudent(allPeople, students, teachers, reader, bw);
            doSomeSpace();
            mainMenu(allPeople, students, teachers, reader, bw);
        case 2:
            addNewTeacher(allPeople, students, teachers, reader, bw);
            doSomeSpace();
            mainMenu(allPeople, students, teachers, reader, bw);
        case 3:
            doSomeSpace();
            mainMenu(allPeople, students, teachers, reader, bw);
        default:
            System.out.println("Invalid number. Going back to main menu");
            doSomeSpace();
            mainMenu(allPeople, students, teachers, reader, bw);
        }
        
    }

    public static void showAllStudents(List<University> allPeople, List<Student> students, List<Teacher> teachers,
            BufferedReader reader, BufferedWriter bw) {
        for (University student : students) {
            System.out.println(student);
        }
        doSomeSpace();
        mainMenu(allPeople, students, teachers, reader, bw);
    }

    public static void showAllTeachers(List<University> allPeople, List<Student> students, List<Teacher> teachers,
            BufferedReader reader, BufferedWriter bw) {
        for (University teacher : teachers) {
            System.out.println(teacher);
        }
        doSomeSpace();
        mainMenu(allPeople, students, teachers, reader, bw);
    }

    public static void showAllProfiles(List<University> allPeople, List<Student> students, List<Teacher> teachers,
            BufferedReader reader, BufferedWriter bw) {
        for (University profile : allPeople) {
            System.out.println(profile);
        }
        doSomeSpace();
        mainMenu(allPeople, students, teachers, reader, bw);
    }
    
    public static void displayProfilesMenu(List<University> allPeople, List<Student> students, List<Teacher> teachers,
            BufferedReader reader, BufferedWriter bw) {
        System.out.println("1) Display all profiles");
        System.out.println("2) Display student's profiles");
        System.out.println("3) Display teacher's profiles");
        int choiceOfDisplay = 0;
        try {
            System.out.print("\nYour choice: ");
            choiceOfDisplay = Integer.parseInt(reader.readLine());
        } catch (IOException | NumberFormatException e) {
            System.err.println(e.getMessage());
            System.out.println("Invalid number. Going back to main menu");
            doSomeSpace();
            mainMenu(allPeople, students, teachers, reader, bw);
        }
        switch (choiceOfDisplay) {
        case 1:
            showAllProfiles(allPeople, students, teachers, reader, bw);
            doSomeSpace();
            mainMenu(allPeople, students, teachers, reader, bw);
        case 2:
            showAllStudents(allPeople, students, teachers, reader, bw);
            doSomeSpace();
            mainMenu(allPeople, students, teachers, reader, bw);
        case 3:
            showAllTeachers(allPeople, students, teachers, reader, bw);
            doSomeSpace();
            mainMenu(allPeople, students, teachers, reader, bw);
        default:
            System.out.println("Wrong number! Going back to main menu");
            doSomeSpace();
            mainMenu(allPeople, students, teachers, reader, bw);
        }
    }

    public static void searchStudentMenu(List<University> allPeople, List<Student> students, List<Teacher> teachers,
            BufferedReader reader, BufferedWriter bw) {
        System.out.println("1) Search by student's id");
        System.out.println("2) Search by first name");
        System.out.println("3) Search by last name");
        System.out.println("4) Search by birth year");
        System.out.println("5) Go back to main menu");
        int choice = 0;
        try {
            System.out.print("Your choice :");
            choice = Integer.parseInt(reader.readLine());
        } catch (IOException | NumberFormatException e) {
            System.err.println(e.getMessage());
            System.out.println("Wrong number, please retry");
            doSomeSpace();
            searchStudentMenu(allPeople, students, teachers, reader, bw);
        }
        switch (choice) {
        case 1:
            System.out.print("Enter id: ");
            int id = 0;
            try {
                id = Integer.parseInt(reader.readLine());
            } catch (NumberFormatException | IOException e) {
                System.err.println(e.getMessage());
                System.out.println("Wrong id");
                doSomeSpace();
                searchStudentMenu(allPeople, students, teachers, reader, bw);
            }
            System.out.println("Searching by id " + id);
            System.out.println("===Matches===");
            for (University student : students) {
                Student.searchStudentByStudentId((Student) student, id);
            }
            doSomeSpace();
            mainMenu(allPeople, students, teachers, reader, bw);
        case 2:
            System.out.print("Enter fist name: ");
            String firstName = null;
            try {
                firstName = reader.readLine();
            } catch (IOException e) {
                System.err.println(e.getMessage());
                System.out.println("Wrong name");
                doSomeSpace();
                searchStudentMenu(allPeople, students, teachers, reader, bw);
            }
            System.out.println("Searching by name: " + firstName);
            System.out.println("===Matches===");
            for (University student : students) {
                Student.searchStudentByFirstName((Student) student, firstName);
            }
            doSomeSpace();
            mainMenu(allPeople, students, teachers, reader, bw);
        case 3:
            System.out.print("Enter last name: ");
            String lastName = null;
            try {
                lastName = reader.readLine();
            } catch (IOException e) {
                System.err.println(e.getMessage());
                System.out.println("Wrong name");
                doSomeSpace();
                searchStudentMenu(allPeople, students, teachers, reader, bw);
            }
            System.out.println("Searching by last name: " + lastName);
            System.out.println("===Matches===");
            for (University student : students) {
                Student.searchStudentByLastName((Student) student, lastName);
            }
            doSomeSpace();
            mainMenu(allPeople, students, teachers, reader, bw);
        case 4:
            System.out.print("Enter birth year: ");
            int birthYear = 0;
            try {
                birthYear = Integer.parseInt(reader.readLine());
            } catch (NumberFormatException | IOException e) {
                System.err.println(e.getMessage());
                System.out.println("Wrong birth year");
                doSomeSpace();
                searchStudentMenu(allPeople, students, teachers, reader, bw);
            }
            System.out.println("Searching by birth year: " + birthYear);
            System.out.println("===Matches===");
            for (University student : students) {
                Student.searchStudentByBirthYear((Student) student, birthYear);
            }
            doSomeSpace();
            mainMenu(allPeople, students, teachers, reader, bw);

        case 5:
            doSomeSpace();
            mainMenu(allPeople, students, teachers, reader, bw);
        default:
            System.out.println("Wrong number! Going back to main menu!");
            doSomeSpace();
            mainMenu(allPeople, students, teachers, reader, bw);
        }

    }

    public static void searchTeacherMenu(List<University> allPeople, List<Student> students, List<Teacher> teachers,
            BufferedReader reader, BufferedWriter bw) {
        System.out.println("1) Search by teacher's id");
        System.out.println("2) Search by first name");
        System.out.println("3) Search by last name");
        System.out.println("4) Search by subject");
        System.out.println("5) Go back to main menu");
        int choice = 0;
        try {
            System.out.print("Your choice :");
            choice = Integer.parseInt(reader.readLine());
        } catch (IOException | NumberFormatException e) {
            System.err.println(e.getMessage());
            System.out.println("Wrong number, please retry");
            searchTeacherMenu(allPeople, students, teachers, reader, bw);
        }
        switch (choice) {
        case 1:
            System.out.print("Enter id: ");
            int id = 0;
            try {
                id = Integer.parseInt(reader.readLine());
            } catch (NumberFormatException | IOException e) {
                System.err.println(e.getMessage());
                System.out.println("Wrong id");
                searchTeacherMenu(allPeople, students, teachers, reader, bw);
            }
            System.out.println("Searching by id " + id);
            System.out.println("===Matches===");
            for (University teacher : teachers) {
                Teacher.searchTeacherByTeacherId((Teacher) teacher, id);
            }
            doSomeSpace();
            mainMenu(allPeople, students, teachers, reader, bw);
        case 2:
            System.out.print("Enter fist name: ");
            String firstName = null;
            try {
                firstName = reader.readLine();
            } catch (IOException e) {
                System.err.println(e.getMessage());
                System.out.println("Wrong name");
                searchTeacherMenu(allPeople, students, teachers, reader, bw);
            }
            System.out.println("Searching by name: " + firstName);
            System.out.println("===Matches===");
            for (University teacher : teachers) {
                Teacher.searchTeacherByFirstName((Teacher) teacher, firstName);
            }
            doSomeSpace();
            mainMenu(allPeople, students, teachers, reader, bw);
        case 3:
            System.out.print("Enter last name: ");
            String lastName = null;
            try {
                lastName = reader.readLine();
            } catch (IOException e) {
                System.err.println(e.getMessage());
                System.out.println("Wrong name");
                searchTeacherMenu(allPeople, students, teachers, reader, bw);
            }
            System.out.println("Searching by last name: " + lastName);
            System.out.println("===Matches===");
            for (University teacher : teachers) {
                Teacher.searchTeacherByLastName((Teacher) teacher, lastName);
            }
            doSomeSpace();
            mainMenu(allPeople, students, teachers, reader, bw);
        case 4:
            System.out.print("Enter the subject: ");
            String subject = null;
            try {
                subject = reader.readLine();
            } catch (IOException e) {
                System.err.println(e.getMessage());
                System.out.println("Wrong subject");
                searchTeacherMenu(allPeople, students, teachers, reader, bw);
            }
            System.out.println("Searching by subject: " + subject);
            System.out.println("===Matches===");
            for (University teacher : teachers) {
                Teacher.searchTeacherBySubject((Teacher) teacher, subject);
            }
            doSomeSpace();
            mainMenu(allPeople, students, teachers, reader, bw);

        case 5:
            doSomeSpace();
            mainMenu(allPeople, students, teachers, reader, bw);
        default:
            System.out.println("Invalid number! Going back to main menu");
            doSomeSpace();
            mainMenu(allPeople, students, teachers, reader, bw);

        }
    }

    public static void studentsSortMenu(List<University> allPeople, List<Student> students, List<Teacher> teachers,
            BufferedReader reader, BufferedWriter bw) {
        System.out.println("1) Sort by id");
        System.out.println("2) Sort by first name");
        System.out.println("3) Sort by last  name");
        System.out.println("4) Sort by birth year");
        System.out.println("5) Sort by group number");
        System.out.println("6) Sort by faculty");
        System.out.println("7) Go back to main menu");
        int choice = 0;
        try {
            System.out.print("Your choice: ");
            choice = Integer.parseInt(reader.readLine());
        } catch (IOException | NumberFormatException e) {
            System.err.println(e.getMessage());
            System.out.println("Wrong number, please retry");
            studentsSortMenu(allPeople, students, teachers, reader, bw);
        }
        switch (choice) {
        case 1:
            students.sort(Student.StudentIdComparator);
            for (Student student : students) {
                System.out.println(student);
            }
            doSomeSpace();
            mainMenu(allPeople, students, teachers, reader, bw);
            // back to menu
        case 2:
            students.sort(Student.FirstNameComparator);
            for (Student student : students) {
                System.out.println(student);
            }
            doSomeSpace();
            mainMenu(allPeople, students, teachers, reader, bw);
        case 3:
            students.sort(Student.LastNameComparator);
            for (Student student : students) {
                System.out.println(student);
            }
            doSomeSpace();
            mainMenu(allPeople, students, teachers, reader, bw);
        case 4:
            students.sort(Student.BirthYearComparator);
            for (Student student : students) {
                System.out.println(student);
            }
            doSomeSpace();
            mainMenu(allPeople, students, teachers, reader, bw);
        case 5:
            students.sort(Student.GroupComparator);
            for (Student student : students) {
                System.out.println(student);
            }
            doSomeSpace();
            mainMenu(allPeople, students, teachers, reader, bw);
        case 6:
            students.sort(Student.FacultyComparator);
            for (Student student : students) {
                System.out.println(student);
            }
            doSomeSpace();
            mainMenu(allPeople, students, teachers, reader, bw);
        case 7:
            doSomeSpace();
            mainMenu(allPeople, students, teachers, reader, bw);
        default:
            System.out.println("Invalid number! Going back to main menu");
            doSomeSpace();
            mainMenu(allPeople, students, teachers, reader, bw);

        }
    }
    
    public static void searchMenu(List<University> allPeople, List<Student> students, List<Teacher> teachers,
            BufferedReader reader, BufferedWriter bw) {
        System.out.println("1) Student's profiles");
        System.out.println("2) Teacher's profiles");
        System.out.println("3) Back to menu");
        int choiceOfSearching = 0;
        try {
            System.out.print("\nYour choice: ");
            choiceOfSearching = Integer.parseInt(reader.readLine());
        } catch (IOException | NumberFormatException e) {
            System.err.println(e.getMessage());
            System.out.println("Invalid number. Going back to main menu");
            doSomeSpace();
            mainMenu(allPeople, students, teachers, reader, bw);
        }
        switch (choiceOfSearching) {
        case 1:
            searchStudentMenu(allPeople, students, teachers, reader, bw);
            doSomeSpace();
            mainMenu(allPeople, students, teachers, reader, bw);
        case 2:
            searchTeacherMenu(allPeople, students, teachers, reader, bw);
            doSomeSpace();
            mainMenu(allPeople, students, teachers, reader, bw);
        case 3:
            doSomeSpace();
            mainMenu(allPeople, students, teachers, reader, bw);
        default:
            System.out.println("Invalid number. Going back to main menu");
            doSomeSpace();
            mainMenu(allPeople, students, teachers, reader, bw);

        }
    }

    public static void teachersSortMenu(List<University> allPeople, List<Student> students, List<Teacher> teachers,
            BufferedReader reader, BufferedWriter bw) {
        System.out.println("1) Sort by id");
        System.out.println("2) Sort by first name");
        System.out.println("3) Sort by last  name");
        System.out.println("4) Sort by subject");
        System.out.println("5) Sort by cathedra");
        System.out.println("6) Sort by faculty");
        System.out.println("7) Go back to main menu");
        int choice = 0;
        try {
            System.out.print("Your choice: ");
            choice = Integer.parseInt(reader.readLine());
        } catch (IOException | NumberFormatException e) {
            System.err.println(e.getMessage());
            System.out.println("Wrong number, please retry");
            teachersSortMenu(allPeople, students, teachers, reader, bw);
        }
        switch (choice) {
        case 1:
            teachers.sort(Teacher.TeacherIdComparator);
            for (Teacher teacher : teachers) {
                System.out.println(teacher);
            }
            doSomeSpace();
            mainMenu(allPeople, students, teachers, reader, bw);
            // back to menu
        case 2:
            teachers.sort(Teacher.FirstNameComparator);
            for (Teacher teacher : teachers) {
                System.out.println(teacher);
            }
            doSomeSpace();
            mainMenu(allPeople, students, teachers, reader, bw);
        case 3:
            teachers.sort(Teacher.LastNameComparator);
            for (Teacher teacher : teachers) {
                System.out.println(teacher);
            }
            doSomeSpace();
            mainMenu(allPeople, students, teachers, reader, bw);
        case 4:
            teachers.sort(Teacher.SubjectComparator);
            for (Teacher teacher : teachers) {
                System.out.println(teacher);
            }
            doSomeSpace();
            mainMenu(allPeople, students, teachers, reader, bw);
        case 5:
            teachers.sort(Teacher.CathedraComparator);
            for (Teacher teacher : teachers) {
                System.out.println(teacher);
            }
            doSomeSpace();
            mainMenu(allPeople, students, teachers, reader, bw);
        case 6:
            teachers.sort(Teacher.FacultyComparator);
            for (Teacher teacher : teachers) {
                System.out.println(teacher);
            }
            doSomeSpace();
            mainMenu(allPeople, students, teachers, reader, bw);
        case 7:
            doSomeSpace();
            mainMenu(allPeople, students, teachers, reader, bw);
        default:
            System.out.println("Wrong number! Going back to main menu");
            doSomeSpace();
            mainMenu(allPeople, students, teachers, reader, bw);
        }
    }

    public static void profilesSortMenu(List<University> allPeople, List<Student> students, List<Teacher> teachers,
            BufferedReader reader, BufferedWriter bw) {
        System.out.println("1) Sort by id");
        System.out.println("2) Sort by first name");
        System.out.println("3) Sort by last  name");
        System.out.println("4) Go back to main menu");
        int choice = 0;
        try {
            System.out.print("Your choice: ");
            choice = Integer.parseInt(reader.readLine());
        } catch (IOException | NumberFormatException e) {
            System.err.println(e.getMessage());
            System.out.println("Wrong number, please retry");
            profilesSortMenu(allPeople, students, teachers, reader, bw);
        }
        switch (choice) {
        case 1:
            allPeople.sort(University.GlobalIdComparator);
            for (University profile : allPeople) {
                System.out.println(profile);
            }
            doSomeSpace();
            mainMenu(allPeople, students, teachers, reader, bw);
            // back to menu
        case 2:
            allPeople.sort(University.FirstNameComparator);
            for (University profile : allPeople) {
                System.out.println(profile);
            }
            doSomeSpace();
            mainMenu(allPeople, students, teachers, reader, bw);
            // back to menu
        case 3:
            allPeople.sort(University.LastNameComparator);
            for (University profile : allPeople) {
                System.out.println(profile);
            }
            doSomeSpace();
            mainMenu(allPeople, students, teachers, reader, bw);
            // back to menu
        case 4:
            doSomeSpace();
            mainMenu(allPeople, students, teachers, reader, bw);
            // back to menu
        default:
            System.out.println("Wrong number! Going back to main menu");
            doSomeSpace();
            mainMenu(allPeople, students, teachers, reader, bw);
        }
    }
    
    public static void sortMenu(List<University> allPeople, List<Student> students, List<Teacher> teachers,
            BufferedReader reader, BufferedWriter bw) {
        System.out.println("1) Sort all profiles");
        System.out.println("2) Sort student's profiles");
        System.out.println("3) Sort teacher's profiles");
        System.out.println("4) Back to menu");
        int choiceOfSorting = 0;
        try {
            System.out.print("\nYour choice: ");
            choiceOfSorting = Integer.parseInt(reader.readLine());
        } catch (IOException | NumberFormatException e) {
            System.err.println(e.getMessage());
            System.out.println("Invalid number. Going back to main menu");
            doSomeSpace();
            mainMenu(allPeople, students, teachers, reader, bw);
        }
        switch (choiceOfSorting) {
        case 1:
            profilesSortMenu(allPeople, students, teachers, reader, bw);
            doSomeSpace();
            mainMenu(allPeople, students, teachers, reader, bw);
        case 2:
            studentsSortMenu(allPeople, students, teachers, reader, bw);
            doSomeSpace();
            mainMenu(allPeople, students, teachers, reader, bw);
        case 3:
            teachersSortMenu(allPeople, students, teachers, reader, bw);
            doSomeSpace();
            mainMenu(allPeople, students, teachers, reader, bw);
        case 4:
            doSomeSpace();
            mainMenu(allPeople, students, teachers, reader, bw);
        default:
            System.out.println("Invalid number. Going back to main menu");
            doSomeSpace();
            mainMenu(allPeople, students, teachers, reader, bw);

        }
        
    }

    public static void writeProfilesToFile(List<University> allPeople, List<Student> students, List<Teacher> teachers,
            BufferedReader reader, BufferedWriter bw) {
        String filename = null;
        String fileExtension = null;
        try {
            System.out.print("Enter file name(without extension): ");
            filename = reader.readLine();
            System.out.print("Enter file extension(with dot): ");
            fileExtension = reader.readLine();
            bw = new BufferedWriter(new FileWriter(filename.concat(fileExtension)));
        } catch (IOException e) {
            System.err.println(e.getMessage());
            System.out.println("Please retry\n");
            writeProfilesToFile(allPeople, students, teachers, reader, bw);
        }
        for (University people : allPeople) {
            try {

                bw.write(people.toString());
                bw.newLine();

            } catch (IOException e) {
                System.err.println(e.getMessage());
                mainMenu(allPeople, students, teachers, reader, bw);
            }
        }
        try {
            bw.close();
        } catch (IOException e) {
            System.err.println(e.getMessage());
            doSomeSpace();
            mainMenu(allPeople, students, teachers, reader, bw);
        }
        System.out.println("All data was succesfully writed to " + filename.concat(fileExtension));

    }

    public static void writeStudentsToFile(List<University> allPeople, List<Student> students, List<Teacher> teachers,
            BufferedReader reader, BufferedWriter bw) {
        String filename = null;
        String fileExtension = null;
        try {
            System.out.print("Enter file name(without extension): ");
            filename = reader.readLine();
            System.out.print("Enter file extension(with dot): ");
            fileExtension = reader.readLine();
            bw = new BufferedWriter(new FileWriter(filename.concat(fileExtension)));
        } catch (IOException e) {
            System.err.println(e.getMessage());
            System.out.println("Please retry\n");
            writeStudentsToFile(allPeople, students, teachers, reader, bw);
        }
        for (Student student : students) {
            try {

                bw.write(student.toString());
                bw.newLine();
            } catch (IOException e) {
                System.err.println(e.getMessage());
                mainMenu(allPeople, students, teachers, reader, bw);
            }
        }
        try {
            bw.close();
        } catch (IOException e) {
            System.err.println(e.getMessage());
            doSomeSpace();
            mainMenu(allPeople, students, teachers, reader, bw);
        }
        System.out.println("All data was succesfully writed to " + filename.concat(fileExtension));

    }

    public static void writeTeachersToFile(List<University> allPeople, List<Student> students, List<Teacher> teachers,
            BufferedReader reader, BufferedWriter bw) {
        String fileName = null;
        String fileExtension = null;
        try {
            System.out.print("Enter file name(without extension): ");
            fileName = reader.readLine();
            System.out.print("Enter file extension(with dot): ");
            fileExtension = reader.readLine();
            bw = new BufferedWriter(new FileWriter(fileName.concat(fileExtension)));
        } catch (IOException e) {
            System.err.println(e.getMessage());
            System.out.println("Please retry\n");
            writeTeachersToFile(allPeople, students, teachers, reader, bw);
        }
        for (Teacher teacher : teachers) {
            try {

                bw.write(teacher.toString());
                bw.newLine();
            } catch (IOException e) {
                System.err.println(e.getMessage());
                mainMenu(allPeople, students, teachers, reader, bw);
            }
        }
        try {
            bw.close();
        } catch (IOException e) {
            System.err.println(e.getMessage());
            doSomeSpace();
            mainMenu(allPeople, students, teachers, reader, bw);
        }
        System.out.println("All data was succesfully writed to " + fileName.concat(fileExtension));

    }

    public static void writeToFileMenu(List<University> allPeople, List<Student> students, List<Teacher> teachers,
            BufferedReader reader, BufferedWriter bw) {
        System.out.println("1) Write all profiles to file");
        System.out.println("2) Write student's profiles to file");
        System.out.println("3) Write teacher's profiles to file");
        System.out.println("4) Back to menu");
        int choice = 0;
        try {
            System.out.print("Your choice: ");
            choice = Integer.parseInt(reader.readLine());
        } catch (NumberFormatException | IOException e) {
            System.err.println(e.getMessage());
            System.out.println("Wrong number! Retry please");
            writeToFileMenu(allPeople, students, teachers, reader, bw);
        }
        switch (choice) {
        case 1:
            writeProfilesToFile(allPeople, students, teachers, reader, bw);
            doSomeSpace();
            mainMenu(allPeople, students, teachers, reader, bw);
            // menu
        case 2:
            writeStudentsToFile(allPeople, students, teachers, reader, bw);
            doSomeSpace();
            mainMenu(allPeople, students, teachers, reader, bw);
            // menu
        case 3:
            writeTeachersToFile(allPeople, students, teachers, reader, bw);
            doSomeSpace();
            mainMenu(allPeople, students, teachers, reader, bw);
            // menu
        case 4:
            // menu
            doSomeSpace();
            mainMenu(allPeople, students, teachers, reader, bw);
        default:
            System.out.println("Wrong number! Going back to main menu");
            doSomeSpace();
            mainMenu(allPeople, students, teachers, reader, bw);
        }
    }

    public static void mainMenu(List<University> allPeople, List<Student> students, List<Teacher> teachers,
            BufferedReader reader, BufferedWriter bw) {
        System.out.println("1) Display profiles");
        System.out.println("2) Add new profiles");
        System.out.println("3) Sorting options");
        System.out.println("4) Searching options");
        System.out.println("5) Write information to file");
        System.out.println("6) Exit");
        int choiceOfMainMenu = 0;
        try {
            System.out.print("\nYour choice: ");
            choiceOfMainMenu = Integer.parseInt(reader.readLine());
        } catch (IOException | NumberFormatException e) {
            System.err.println(e.getMessage());
            System.out.println("Please retry\n");
            mainMenu(allPeople, students, teachers, reader, bw);
        }
        switch (choiceOfMainMenu) {
        case 1:
            displayProfilesMenu(allPeople, students, teachers, reader, bw);
            doSomeSpace();
            mainMenu(allPeople, students, teachers, reader, bw);
        case 2:
            AddMenu(allPeople, students, teachers, reader, bw);
            doSomeSpace();
            mainMenu(allPeople, students, teachers, reader, bw);
            
        case 3:
           sortMenu(allPeople, students, teachers, reader, bw);
           doSomeSpace();
           mainMenu(allPeople, students, teachers, reader, bw);
        case 4:
           searchMenu(allPeople, students, teachers, reader, bw);
           doSomeSpace();
           mainMenu(allPeople, students, teachers, reader, bw);
        case 5:
            writeToFileMenu(allPeople, students, teachers, reader, bw);
            doSomeSpace();
            mainMenu(allPeople, students, teachers, reader, bw);
        case 6:
            System.exit(0);
        default:
            System.out.println("Invalid number");
            doSomeSpace();
            mainMenu(allPeople, students, teachers, reader, bw);

        }
        doSomeSpace();

    }

}
