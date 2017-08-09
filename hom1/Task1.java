package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task1 {
    public static void main(String[] args)throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Please enter variable a:");

        String enterA = reader.readLine();
        int a = Integer.parseInt(enterA);

        System.out.println("Please enter variable b:");
        String enterB = reader.readLine();
        int b = Integer.parseInt(enterB);

        System.out.println("Results:");
        int c = a + b;
        int d = a - b;
        int e = a * b;
        double f = (double)a / b;

        System.out.println(" a + b = " + c);
        System.out.println(" a - b = " + d);
        System.out.println(" a * b = " + e);
        System.out.println(" a / b = " + f);

    }
}
