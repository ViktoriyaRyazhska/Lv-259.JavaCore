package aven.sixth.homework;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class TaskOne {

	/*
	 * Write parameterized methods union(Set set1, Set set2) and intersect(Set set1, Set set2), 
	 * realizing the operations of union and intersection of two sets. Test the operation of these 
	 * techniques on two pre-filled sets. 
	 */
	
	public static void intersection (Set<Integer> s1, Set <Integer> s2)
	{
		 s2.retainAll(s1);
	}
	
	public static void union (Set<Integer> s1, Set <Integer> s2)
	{
		s1.addAll(s2);
	}
			
	public static void main(String[] args) {
		
		Set <Integer> s1 = new HashSet <Integer> ();
		Set <Integer> s2 = new HashSet <Integer> ();
		
			
		int j = 0;
	    for (int i = 0; i < 10; i++) {
	    	Random rand = new Random();
	    	j = rand.nextInt(10);
	    	s1.add(j);
	    }
	    
	    
		int k = 0;
	    for (int i = 0; i < 10; i++) {
	    	Random rand = new Random();
	    	k = rand.nextInt(10);
	    	s2.add(k);
	    }
	   
	    System.out.println("Initial sets:");
	    System.out.println(s1 +"\n"+s2);
	    System.out.println(" ");
	    Set <Integer> inters = new HashSet<Integer>(s2);

//Testing intersection and union methods
	   intersection(s1, s2);
	   union(s1,inters);
	    	   
	    System.out.println("Intersection testing:");
	    System.out.println(s2);
	    System.out.println(" ");
	    System.out.println("Union testing:");
	    System.out.println(s1);
	}

}

