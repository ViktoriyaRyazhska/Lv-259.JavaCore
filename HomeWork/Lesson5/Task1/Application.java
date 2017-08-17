import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Bogdan on 17.08.2017.
 */
public class Application
{
    public static void main(String[] args) throws IOException {
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        int[]days={31,29,31,30,31,30,31,31,30,31,30,31};
        System.out.println("Please enter the number of month");
        System.out.println("this mounth have - " +days[Integer.parseInt(reader.readLine())]+" days");
    }
}
