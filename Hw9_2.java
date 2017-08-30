package Homework;

import java.util.Scanner;

public class Hw9_2 {

	public static int readNumber(int start, int end) throws Exception{
		int a;
		Scanner scn = new Scanner (System.in);
		System.out.println("a= ");
		String str =scn.next();
		a = Integer.parseInt(str);
		if(a>=start & a<=end){
			return a;
		}else{ throw new Exception();}
	} 
	
	public static boolean f (int [] arr1 )throws Exception{
		int k;
		if (arr1[0]>1){k=1;}else{k=0;} ;
		for (int i=1; i < arr1.length; i++){
			if(arr1[i]>arr1[i-1] ){k++;}
		}
		if (arr1[arr1.length-1]<100 & k==arr1.length){
		return true;} else { throw new Exception();}
	}
	
	public static void main(String[] args) {
		
		try {
			System.out.println(readNumber(2, 20));
		} catch (Exception e1) {
			System.out.println("Number must belong [2; 20] ");
			e1.printStackTrace();
		}
		
		Scanner scn = new Scanner (System.in);
		int [] arr	= new int[10];
		System.out.println("Write 10 numbers ");
		for (int i=0; i<10; i++){
			String a =scn.next();
			try{
				arr[i] = Integer.parseInt(a);
			}catch (NumberFormatException e){
				e.printStackTrace();
				arr[i]=0;
			}
		}
		
		try {
			System.out.print(f(arr));
		} catch (Exception e) {
			System.out.println("Numbers are not ordered ");
			e.printStackTrace();
		}
		
	}
}
	
