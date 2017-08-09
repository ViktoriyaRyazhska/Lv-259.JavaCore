package com.company;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Homework2 {

    public static void main(String[] args)throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("What is your name?");
        String name = reader.readLine();
        System.out.println("Where are you live, " + name + "?");
        String address = reader.readLine();
    }
}
