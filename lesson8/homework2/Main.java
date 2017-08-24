package regina.com;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {
        // write your code here

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Please enter a sentence");

        String result = new String(bf.readLine())
                .trim()
                .replaceAll("\\s{2,}", " ")
                .replace("I am", "I'm");
        System.out.println(result);
    }
}
