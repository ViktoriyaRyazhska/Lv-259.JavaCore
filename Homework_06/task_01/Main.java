package pack3;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Main {
	
	
	public static  void union(Set set1, Set set2){
		set1.addAll(set2);
		
		Iterator iter = set1.iterator();
		while(iter.hasNext()){
		System.out.println(iter.next());	
		}
		
	} 
	
	public static void intersect(Set set1, Set set2){
		set1.retainAll(set2);
	} 

	public static void main(String[] args) {
	
		Set<Integer> set1 = new HashSet<Integer>();
		set1.add(10);
		set1.add(20);
		set1.add(30);
		set1.add(40);
		
		Set<Integer> set2 = new HashSet<Integer>();
		set2.add(40);
		set2.add(60);
		set2.add(70);
		set2.add(80);

		union(set1, set2);
		
		intersect(set1, set2);
		System.out.println(set1);
		
	}
}
