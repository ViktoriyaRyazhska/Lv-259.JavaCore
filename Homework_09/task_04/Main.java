package com.pack4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException {

		// Create file1.txt file with a text about your career.
		// Read context from file into array of strings. Each array item
		// contains one line from file.

		File file = new File("file1.txt");
		BufferedWriter br = new BufferedWriter(new FileWriter(file));

		br.write("He was an old man who fished alone in a skiff in the Gulf Stream " + "\n"
				+ "and he had gone eighty-four days now without taking a fish. " + "\n"
				+ "In the first forty days a boy had been with him.");

		br.flush();
		br.close();

		BufferedReader brd = new BufferedReader(new FileReader(file));
		StringBuilder sb = new StringBuilder();
		String abs;
		String line;

		while ((line = brd.readLine()) != null) {
			sb.append(line);

		}
		abs = sb.toString();

		String[] mass = abs.split(" ");

		// writing into the file2.txt

		File file2 = new File("file2.txt");
		BufferedWriter br2 = new BufferedWriter(new FileWriter(file2));
		int massLength = mass.length;

		String maxSizeWord = "";
		for (int i = 0; i < mass.length; i++) {
			for (int j = 0; j < mass.length; j++) {
				if (mass[i].length() < mass[j].length()) {
					mass[i] = mass[j];
				}
			}
			maxSizeWord = mass[i];
		}
		;

		br2.write("The number of lines in file1 is " + String.valueOf(massLength) + "\n");
		br2.append("The longest line in file1 is '" + maxSizeWord + "', it's size is " + maxSizeWord.length()
				+ " symbols" + "\n");
		br2.append("My name is Khrystyna and my birthday date is Juny 19" + "\n");
		br2.flush();
		br2.close();

	}
}
