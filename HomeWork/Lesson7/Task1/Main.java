import java.util.Set;
import java.util.TreeSet;

/**
 * Created by Bogdan on 29.08.2017.
 */
public class Main {
    public static void main(String[] args) {
        TreeSet<Character> set1 = new TreeSet<Character>();
        TreeSet<Character> set2 = new TreeSet<Character>();

        set1.add('A');
        set1.add('B');
        set1.add('C');
        set1.add('D');

        set2.add('C');
        set2.add('D');
        set2.add('E');
        set2.add('F');
        TreeSet<Integer> set3 = new TreeSet<Integer>();
        TreeSet<Integer> set4 = new TreeSet<Integer>();

        set3.add(1);
        set3.add(3);
        set3.add(5);
        set3.add(7);

        set4.add(2);
        set4.add(5);
        set4.add(9);
        set4.add(1);
        System.out.println("Union: " + union(set1, set2));
        System.out.println("Intersection: " + intersection(set1, set2));
        System.out.println("Union: " + union(set3, set4));
        System.out.println("Intersection: " + intersection(set3, set4));

    }
    public static <T> Set<T> union(Set<T> setA, Set<T> setB) {
        Set<T> set = new TreeSet<T>(setA);
        set.addAll(setB);
        return set;
    }
    public static <T> Set<T> intersection(Set<T> setA, Set<T> setB) {
        Set<T> set = new TreeSet<T>();
        for (T x : setA)
            if (setB.contains(x))
                set.add(x);
        return set;
    }
}
