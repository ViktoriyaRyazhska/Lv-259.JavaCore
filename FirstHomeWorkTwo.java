import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FirstHomeWorkTwo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		//Phone calls from three different countries are ñ1, ñ2 and ñ3 standard units per minute. 
		//Talks continued t1, t2 and t3 minutes. How much computer will count for each call separately and all talk together? 
		//Input all source data from console, make calculations and output to the screen.
		
		BufferedReader br = new BufferedReader(
				new InputStreamReader(System.in));
		
		System.out.println("Please enter the cost per minute of each of three calls:");
		
		int n = 3;
		int[] tariff = new int [n];
		
		for (int i = 0; i < n; i++) {
			tariff[i] = Integer.parseInt(br.readLine());
		}
		
		
		System.out.println("Please enter the duration of each of three calls:");
		
		int[] duration = new int [n];
		
		for (int i = 0; i < n; i++) {
			duration[i] = Integer.parseInt(br.readLine());
		
		}
		
		//count the cost of each
		int d = 0;
		for (int i = 0; i < n; i++) {
			
			System.out.printf("The cost of the %s call is: " + tariff[i] * duration[i] + "\n", i+1);
			
			d += tariff[i] * duration[i];
			
		}
		//count of total cost
		System.out.println("Total cost of the call is: " + d);
		
		
	}

}
