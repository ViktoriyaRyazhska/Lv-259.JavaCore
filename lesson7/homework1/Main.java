package regina.com;

import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Set<String> setResult;

        Set<String> setFirst = new HashSet<>();
        Set<String> setSecond = new HashSet<>();

        setFirst.add("Yellow");
        setFirst.add("Green");
        setFirst.add("Blue");

        setSecond.add("Green");
        setSecond.add("Yellow");
        setSecond.add("Black");

        setResult = union(setFirst, setSecond);
        System.out.println(setResult);

        setResult = intersect(setFirst, setSecond);
        System.out.println(setResult);
    }

    public static <T> Set<T> union(Set<T> set1, Set<T> set2) {
        Set<T> result = new HashSet<>();
        result.addAll(set1);
        result.addAll(set2);
        return result;
    }

    public static <T> Set<T> intersect(Set<T> set1, Set<T> set2) {
        Set<T> result = new HashSet<>();
        for (T t : set1) {
            if (set2.contains(t)) {
                result.add(t);
            }
        }
        return result;
    }
}
