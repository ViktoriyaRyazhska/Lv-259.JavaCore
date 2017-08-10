import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Bogdan on 08.08.2017.
 */
public class NameAdress
{
    public static void main(String[] args) throws IOException {
        String name;
        String address;
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("What is your name?");
        name=reader.readLine();
        System.out.println("Where do you live " + name + " ?");
        address=reader.readLine();
        System.out.println("Name - " + name );
        System.out.println("Address - " + address);

    }
}
