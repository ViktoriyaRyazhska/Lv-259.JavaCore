package com.company;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import static java.lang.Math.PI;

public class Homework1 {


    public static void main(String[] args)throws Exception {
	// write your code here
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Please enter the radius of flower bed wer:");

        String r = reader.readLine();
        double radius = Double.parseDouble(r);


        double perimeter = 2 * PI * radius;
        double area = PI * radius*radius;

        System.out.println("Perimeter of flower bed equals: " + perimeter);
        System.out.println("Area of flower bed equals: " + area);

    }

}
