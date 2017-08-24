package regina.com;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static jdk.nashorn.internal.objects.NativeArray.reverse;

public class Main {

    public static void main(String[] args) throws IOException {
        // write your code here

        System.out.println("Please enter a sentence of five words");
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String sentence = bf.readLine();

        String[] words = sentence.split(" ");

        String maxWord = null;
        int maxWordlength = 0;

        for (int i = 0; i < words.length; i++) {
            if (words[i].length() > maxWordlength) {
                maxWord = words[i];
                maxWordlength = words[i].length();
            }
        }

        System.out.println("The longest word from your sentence is: " + maxWord);
        System.out.println();
        System.out.println("The word of: " + maxWord + " contains " + maxWord.length() + " letters");
        System.out.println();
        StringBuilder builder = new StringBuilder(words[1]);

        System.out.println(" The second entered word in reverse order is " + builder.reverse().toString());

    }
}
