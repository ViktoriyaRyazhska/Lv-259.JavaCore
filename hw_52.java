package Homework;

public class hw52 {

	public static void main(String[] args) {
		int[] mass = { 8, 6, 8, 7, 7, 12, -9, 3, 101, 42 };
		
		
		int m = 0;
		for (int k = 0; k <5; k++) {
			if (mass[k] > 0) {m++;};
		}
		
		int s=0, p=1;
		if (m==5){
		for (int k = 0; k < 5; k++) {s=s+mass[k];} 
		System.out.println("sum of first 5 elements " + s);}
		 else {for (int k = 5; k < mass.length; k++) {p=p*mass[k];} 
			System.out.println("product of last 5 element " + p);}
		
	}

}
