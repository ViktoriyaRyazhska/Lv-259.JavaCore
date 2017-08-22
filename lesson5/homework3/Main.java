package regina.com;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
	// write your code here

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Please enter five integer numbers:");

        int [] arr = new int[5];

        for (int i = 0; i < 5; i++) {
            arr[i] = (Integer.parseInt(bf.readLine()));
        }

        foundPositionOfsecondPositNumber(arr);
        minAndItsPosition(arr);
    }

    private static void minAndItsPosition(int[] arr) {
        int min = arr[0];
        int position = 0;
        for (int i = 0; i < arr.length; i++){
            if (arr[i] < min){
                min = arr[i];
                position = i;
               }
        }
        System.out.println("The min is: " + min + " and its position is: " + (position + 1));
    }

    private static void foundPositionOfsecondPositNumber(int[] arr) {
        boolean isHaveFirstPositive = false;
        for (int i = 0; i < arr.length; i++){
            if (arr[i] > 0){
                if (isHaveFirstPositive) {
                    System.out.println( "The position of second positive number is:" + (i+1));
                    break;
                } else {
                    isHaveFirstPositive = true;
                }
            }
        }
    }
}
