package task1;

import java.util.HashSet;
import java.util.Set;

public class task1 {

	public static void main(String[] args) {
		
		Set<Integer> set1 = new HashSet<Integer>();
		Set<Integer> set2 = new HashSet<Integer>();
		set1.add(1);
		set1.add(2);
		set1.add(9);
		set1.add(10);
		set2.add(32);
		set2.add(11);
		set2.add(2);
		set2.add(91);
		set2.add(10);
		set2.add(312);
	
		System.out.println("Set 1: " + set1 + "\nSet 2: " + set2);
		System.out.println("Intersection of two sets:");
		intersect(set1, set2);
		System.out.println("Union of two sets:");
		union(set1, set2);
 		
		// uncomment for review but comment on lines (23-27)
//		System.out.println("Verification: ");
//		Set<Integer> set = new HashSet<Integer>(set1);
//		set.retainAll(set2);
//		System.out.println("\tIntersection of two sets: " + set);
//		set.addAll(set2);
//		System.out.println("\tUnion of two sets: " + set);
	}
	
	public static void intersect(Set<Integer> set1, Set<Integer> set2) {
		set1.retainAll(set2);
		System.out.println(set1);
	}
	
	public static void union(Set<Integer> set1, Set<Integer> set2) {
		set1.addAll(set2);
		System.out.println(set1);
	}

}
