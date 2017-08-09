import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HomeWork3 {

	public static void main(String [] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader (new InputStreamReader (System.in));
		
		double Pi = 3.14;
		
		System.out.println("Enter radius");
		double rAdius = Double.parseDouble(br.readLine());
		double pErimeter = 2 * Pi * rAdius;
		double aRea = Pi * (rAdius * rAdius);
		System.out.println("Perimeter is: " + pErimeter);
		System.out.println("Area is: " + aRea);
		
		
	}
	}

