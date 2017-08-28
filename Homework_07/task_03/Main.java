package com.pack2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

	public static void main(String[] args) throws IOException {
		
		// TASK 3 (US currency)
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Input a text");
		String inputText = br.readLine();
		
		String pattern = "\\${1}(\\d*)(\\.\\d{2})?";
		
		Pattern p = Pattern.compile(pattern);
		Matcher m = p.matcher(inputText);
		
		while(m.find()){
			System.out.println(m.group() + " starts with index " + m.start());
		}
	}

}
