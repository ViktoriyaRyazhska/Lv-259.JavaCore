package aven.nineth.homework;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class TaskFour {
	
		
	public static void main(String[] args) throws IOException  {
		/*
		 * Create file1.txt file with a text about your career.
Read context from file into array of strings. Each array item contains one line from file.
Write in to the file2.txt
   1) number of lines in file1.txt.xt
   2) the longest line in file1.txt.
   3) your name and birthday date.
		 */
	
		File file = new File("file1.txt");
		BufferedWriter brw = null;
		try {
			brw = new BufferedWriter(new FileWriter(file));
			brw.write("Text \n" +"about my career" + "\n" + "Text about my career third line" + "\n");
			brw.flush();
			brw.close();
		} catch (IOException e) {
			System.out.println("cannot create file");
			e.printStackTrace();
		}
			
			BufferedReader br = new BufferedReader(new FileReader(file));
			String line = br.readLine();
			StringBuffer sbf = new StringBuffer();
			
			int linesNumber = 0;
			int maxLine = 0;
			
			
			
			while ((line = br.readLine()) != null) {
			    sbf.append(line);
			    int tmp = line.length();
			    if (maxLine > tmp){
			    	maxLine = tmp;
			    }
			    linesNumber++;
			    }
			
			String line1 = sbf.toString();
			String [] files = line1.split("\n");
			br.close();
			
			File file2 = new File("file2.txt");
			BufferedWriter brw2 = new BufferedWriter(new FileWriter(file2));
			
			brw2.write("Number of lines in file1 is: " + linesNumber);
			brw2.newLine();
			brw2.write("The longest line of file1 is: " + maxLine);
			brw2.newLine();
			brw2.write("My nabe is Anna and I was born on February 27");
			brw.close();
	}
}


