package regina.com;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
	// write your code here

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Please, enter the number of month:");

        int numberOfMonth = Integer.parseInt(br.readLine());

        int [] monthDays = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        chekhNumberOfMonth(monthDays,numberOfMonth);
    }

    private static void chekhNumberOfMonth(int[] arr, int numberOfMonthFromConsole) {
        if (numberOfMonthFromConsole <= 0 || numberOfMonthFromConsole > 12) {
            System.out.println("Please enter a right number of month:");
        } else {
            for (int i = 0; i < arr.length; i++) {
                if (i == numberOfMonthFromConsole - 1) {
                    System.out.println("This month contains:" + arr[i] + " days.");
                }
            }
        }
    }
}

