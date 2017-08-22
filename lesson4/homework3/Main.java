package regina.com;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        // write your code here

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Please enter number of HTTP error:");

        HttpError httpError = HttpError.valueOf(Integer.parseInt(bf.readLine()));

        System.out.println(httpError.getErrorType());
    }

}



