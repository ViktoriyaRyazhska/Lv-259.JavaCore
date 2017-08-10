import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class FirstHomeWork {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(
				new InputStreamReader(System.in));
		
		//Flower bed is shaped like a circle. Calculate the perimeter and area by entering the radius. Output obtained results.
		
		System.out.println("Please enter the radius of a shape:");

		int radius = Integer.parseInt(br.readLine());
		
		int perimeter = (int) (2 * radius * Math.PI);
		int area = (int) (radius * radius * Math.PI);
		
		System.out.println("Perimeter of a flower bed is: " + perimeter);
		System.out.println("Area of a flower bed is: " + area);
	}

}

