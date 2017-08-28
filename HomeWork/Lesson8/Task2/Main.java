import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Bogdan on 29.08.2017.
 */
public class Main {
    public static void main(String[] args) {
        String s="I                      am   learning       Java       Core";
        System.out.println(s);
        s=s.replaceAll(" \\s+ "," ");
        System.out.println(s);
        s=s.replaceAll("I am","I'm");
        System.out.println(s);

    }
}
