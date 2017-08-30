package Homework;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Hw10_3 {

	public static void main(String[] args) {
		FileReader fr = null;
		FileWriter fw = null;
		BufferedReader br = null;
		int count = 0;

		ArrayList<String> mass = new ArrayList(); 
		
		try {
			fr = new FileReader("D:/file1.txt");
			br = new BufferedReader(fr);
			String s = null;
			
			while ((s = br.readLine()) != null) {
				mass.add(s);
				System.out.println("row " + ++count + " read:" + s);

				System.out.println(s + count);
			}
			br.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String s =mass.get(0);
		for(int i=0;i< mass.size();i++){
			if(mass.get(i).length()>s.length()){s =mass.get(i);}
		}
		
		try {
			fw = new FileWriter("file2.txt", true);
			fw.write(s);
			fw.write("Mykhailo ");
			fw.write(count);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{ try {
			fw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
		}

		System.out.println(mass.get(3));

	}


}
