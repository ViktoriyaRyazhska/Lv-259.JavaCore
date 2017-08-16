package Homework;

import java.util.Scanner;

public class hw51 {

	public static void main(String[] args) {
		hw51[] mass = new hw51[12];
			mass[0]= new hw51("January", 31);
			mass[1]= new hw51("February", 28);
			mass[2]= new hw51("March", 31);
			mass[3]= new hw51("April", 30);
			mass[4]= new hw51("May", 31);
			mass[5]= new hw51("June", 30);
			mass[6]= new hw51("July", 31);
			mass[7]= new hw51("August", 31);
			mass[8]= new hw51("September", 30);
			mass[9]= new hw51("October", 31);
			mass[10]= new hw51("November", 30);
			mass[11]= new hw51("Desember", 31);
			
			System.out.print("Write month ");
			Scanner scn = new Scanner(System.in);
			String m = scn.nextLine();
			
			int i=0;
			for(int k=0; k<12; k++){
				if (m.equals(mass[k].month) ){System.out.println(m + " , days " +mass[k].days); i=1;}
			}
			
			if (i==0){System.out.println("There is no such month"); }
	}
		String month;
		int days;
		
		public hw51(String m, int d){
			month=m;
			days = d;
		}
}

