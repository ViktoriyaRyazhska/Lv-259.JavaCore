package Homework_1;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
public class Main{
	
	public static Set<Integer> union(Set<Integer> A, Set<Integer> B){
		 	Set union = new HashSet(A);
		  union.addAll(B);
		  return union;
	}
	
	public static Set<Integer> intersect(Set<Integer> A, Set<Integer> B){
		Set intersect = new HashSet(A);
		intersect.retainAll(B);
	  return intersect;
}

  public static void main (String[] args) {
  Scanner in = new Scanner(System.in);

  Set A = new HashSet();

  for (int j = 0; j <= 10; j++) {
     A.add(j);
  }


  Set B = new HashSet();

  for (int k = 7; k <= 20; k++) {
     B.add(k);
  }
  
  	Set C = union(A, B);
  	Set D = intersect(A, B);
  	
  System.out.println(C);
  System.out.println(D);

  }
}