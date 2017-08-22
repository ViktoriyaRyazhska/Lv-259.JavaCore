package regina.com;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {

    public static void main(String[] args) throws IOException {
	// write your code here

        System.out.println("Please enter 10 different numbers:");

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int arr []  = new int[10];
        for (int i = 0 ; i < arr.length; i++){
         arr[i] = Integer.parseInt(br.readLine());
        }

        calculateArr(arr);
    }

    private static void calculateArr(int[] arr) {
        int result = 0;
        for (int i = 0; i <= 4; i++) {
            if (arr[i] > 0) {
                result = result + arr[i];
            } else {
                result = 1;
                for (i = 5; i <= 9; i++) {
                    result = result * arr[i];
                }
            }
        }
        System.out.println(result);
    }
}
