package Homework;

public class hw53 {

	public static void main(String[] args) {
		int[] mass = { 8, -6, -8, 7, 7 };
		
		
		int m = 0;
		
		for (int k = 0; k <mass.length; k++) {
			if (mass[k] > 0) {m++;};
			if (m==2){System.out.println("second positive number mass[" + k +"]=" + mass[k] ); break;}
		}
		
		if (m<2){System.out.println("mass do not second positive number");}
		
		int min=mass[0], t =0;
		for (int k = 0; k <mass.length; k++) {
			if (mass[k] <min) {min=mass[k]; t=k;};}
		System.out.println("min number in mass[" + t +"]=" + mass[t] ); 
		
	}

}
