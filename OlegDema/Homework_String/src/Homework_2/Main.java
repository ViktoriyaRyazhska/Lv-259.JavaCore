package Homework_2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String text = scanner.nextLine();
		String newText = "";
		String mas[] = {"  ","   ","    ","     ","      "};
		for(int i=mas.length-1;i>=0;i--){
			 newText = text.replaceAll(mas[i], " ");
		}
		
		System.out.println(newText);
		

	}

}
