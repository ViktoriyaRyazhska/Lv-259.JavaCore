package regina.com;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args)throws IOException {
	// write your code here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Please, enter the integer number:");

        int number = 1;
        int product = 1;

        while (number > 0){
            number = Integer.parseInt(br.readLine());
            if( number % 2 == 0 && number > 0){
                product = product * number;
            }
        }
        System.out.println("The product of all entered even numbers is: " + product);
    }
}
