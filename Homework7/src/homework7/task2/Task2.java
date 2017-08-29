package homework7.task2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task2 {

	public static void main(String[] args) throws IOException {
		BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
		//String sentence = "I     am    learning      Java     Core";
		System.out.print("Enter a sentence : ");
		String sentence=reader.readLine();
		System.out.println(sentence);
		System.out.println("===Replacing n-times spaces for 1===");
		System.out.println(sentence.replaceAll(" +", " "));
	}

}
