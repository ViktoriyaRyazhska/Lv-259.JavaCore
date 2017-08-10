package com.company;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Homework3 {

       public static void main(String[] args) throws IOException {

           int callCount = 3;
           String messageEnterCost = "Please enter the cost of your call per minutes (units): ";
           String messageEnterDuration = "Please enter the duration of your call(min): ";
           int cost = 0;
           int count = 0;
           int costAIIcalls=0;

           BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

           for (int i = 0; i < callCount; i++){

               System.out.println(messageEnterCost);

               String enterCostCountry1 = reader.readLine();
               int c = Integer.parseInt(enterCostCountry1);

               System.out.println(messageEnterDuration);

               String enterTime = reader.readLine();
               int time = Integer.parseInt(enterTime);

               cost = c * time;
               count ++;
               costAIIcalls = costAIIcalls + cost;

               System.out.println("Your " + count + " call will cost: " + cost);
           }
           System.out.println("All your calls will cost: " + costAIIcalls);
    }
}
