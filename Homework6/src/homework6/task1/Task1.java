package homework6.task1;

import java.util.HashSet;
import java.util.Set;

public class Task1 {

	public static void main(String[] args) {
		Set<Integer> s1 = new HashSet<Integer>();
		Set<Integer> s2 = new HashSet<Integer>();
		s1.add(10);
		s1.add(12);
		s1.add(3);
		s2.add(4);
		s2.add(3);
		s2.add(10);
		s2.add(15);
		s2.add(122);
		System.out.println("s1 = " + s1.toString());
		System.out.println("s2 = " + s2.toString());

		Set<Integer> res = new HashSet<Integer>(s1);
		res.retainAll(s2);
		System.out.println("Interselection of s1 and s2 = " + res);
		res = s1;
		res.addAll(s2);
		System.out.println("Union of s1 and s2 = " + res);

	}

}
