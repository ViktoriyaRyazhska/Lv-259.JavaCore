import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class HomeWork2 {

	public static void main(String [] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(
				new InputStreamReader(System.in));

		
		
		System.out.print("Enter cost call for 1 minute at dollars for country1: ");
		double c1 = Double.parseDouble(br.readLine());
		System.out.print("Enter how much call continued at minutes without seconds: ");
		int t1 = Integer.parseInt(br.readLine());
		System.out.println("Country1 spoke on: " + (c1 * t1) + "$ for " + t1 + " minutes");
		
		System.out.print("Enter cost call for 1 minute at dollars for country2: ");
		double c2 = Double.parseDouble(br.readLine());
		System.out.print("Enter how much call continued at minutes without seconds: ");
		int t2 = Integer.parseInt(br.readLine());
		System.out.println("Country1 spoke on: " + (c2 * t2) + "$ for " + t1 + " minutes");
		
		System.out.print("Enter cost call for 1 minute at dollars for country1: ");
		double c3 = Double.parseDouble(br.readLine());
		System.out.print("Enter how much call continued at minutes without seconds: ");
		int t3 = Integer.parseInt(br.readLine());
		System.out.println("Country1 spoke on: " + (c3 * t3) + "$ for " + t1 + " minutes");
		
		double res1 = (c1 * t1); // result
		double res2 = (c2 * t2);
		double res3 = (c3 * t3);
		
		System.out.println("All countries have spoken on " + (res1+res2+res3) + "$ for " + (t1 + t2 + t3) + " minutes" );
		
		
	}
	
}