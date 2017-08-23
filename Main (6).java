package Homework3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scn1 = new Scanner(System.in);
		System.out.println("Write course");
		 int k = scn1.nextInt();
		
		 
		List<Student> students = new ArrayList<Student>();
		students.add(new Student("Kristina",5));
		students.add(new Student("Oksana",1));
		students.add(new Student("Ivan",3));
		students.add(new Student("Miha",2));
		students.add(new Student("Petro",5));
		
		int t1=0;
		for (int i=0 ; i<students.size();i++){
			 if ((students.get(i)).getCourse()==k){t1++;
			 System.out.println((students.get(i)).getName() + " , course "+ (students.get(i)).getCourse());}
		}
		if (t1==0){
			 System.out.println("There are no such students");}
		
		Scanner scn2 = new Scanner(System.in);
		 System.out.println("Write name");
		 String n = scn2.nextLine();
		 int t2=0;
		 
		for (int i=0 ; i<students.size();i++){
			 if ((students.get(i)).getName().equals(n)){t2++;
			 System.out.println((students.get(i)).getName() + " , course "+ (students.get(i)).getCourse());}
		}
		if (t2==0){
		 System.out.println("There are no such students");}
		
	}
}
