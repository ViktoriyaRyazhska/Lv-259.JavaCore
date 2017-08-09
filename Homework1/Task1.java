import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter radius in cm: ");
        double radius = Double.parseDouble(br.readLine());
        System.out.println("Perimeter = "+(2*Math.PI*radius)+" cm");
        System.out.println("Area = "+(Math.PI*(radius*radius))+" cm");
    }
}