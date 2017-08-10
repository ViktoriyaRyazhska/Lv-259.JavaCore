import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Bogdan on 08.08.2017.
 */
public class Radius
{
    public static void main(String[] args) throws IOException {
        final double P=3.14;
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Please enter the radius of the bed");
        double radius=Double.parseDouble(reader.readLine());
        System.out.println("Perimetr = " + (2*P*radius));
        System.out.println("Area = " + (P*radius*radius));
    }
}
