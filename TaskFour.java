import java.util.Scanner;

public class TaskFour {

	public static void main(String[] args) {
		//Organize entering integers until the first negative number. Count the product of all entered even numbers.
		
		Scanner sc = new Scanner(System.in);
		//int n = 0; ??? int [n], then n++ ???
		int [] numbers = new int [36];		
		int input = 0;
		
		System.out.println("Please enter numbers: ");
		for (int i = 0; i < numbers.length; i++) {
			input = Integer.parseInt(sc.nextLine());
			if (input >= 0) {	
				numbers[i] = input;
			}else {
				System.out.println("Negative number was entered");
				break;
			}
		}
		int evensSum = 0;
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] % 2 == 0) {evensSum += numbers[i];}
		}
		System.out.println("Sum of ene numbers: " + evensSum);
		sc.close();
		
	}

}
