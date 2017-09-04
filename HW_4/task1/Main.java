package task1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Month[] mont = new Month[12];
		mont[0] = new Month(1, 31);
		mont[1] = new Month(2, 28);
		mont[2] = new Month(3, 31);
		mont[3] = new Month(4, 30);
		mont[4] = new Month(5, 31);
		mont[5] = new Month(6, 30);
		mont[6] = new Month(7, 31);
		mont[7] = new Month(8, 31);
		mont[8] = new Month(9, 30);
		mont[9] = new Month(10, 31);
		mont[10] = new Month(11, 30);
		mont[11] = new Month(12, 31);

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of month: ");
		int num = sc.nextInt();

		for (int i = 0; i < mont.length; i++) {
			if (num == mont[i].getNumOfMonth()) {
				System.out.println("There are " + mont[i].getDay() + " days in month number " + num);

			} 
		}
		sc.close();
	}

}
