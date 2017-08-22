package regina.com;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
	// write your code here

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Please enter three float numbers:");

        float array[] = new float[3];

        for (int i = 0; i < 3; i++) {
            array[i] = (Float.parseFloat(bf.readLine()));
        }
        checkRangArray(array);
    }

    private static void checkRangArray(float[] arr) {
        int count  = 0;
                for (int i = 0 ; i < arr.length; i++) {
                    if (arr[i] < -5.00 || arr[i] > 5.00) {
                        count++;
                    }
                }
                        if (count == 0){
                            System.out.println("You entered all right numbers");}
                            else {
                            System.out.println( "You entered " + count + " wrong numbers");
                    }
                }

}



