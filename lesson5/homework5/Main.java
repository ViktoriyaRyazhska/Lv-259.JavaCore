package regina.com;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        // write your code here
        Car[] car = new Car[4];
        car[0] = new Car("Bus", 2015, 2.8);
        car[1] = new Car("Truck", 2016, 10.5);
        car[2] = new Car("Passenger car", 2014, 1.5);
        car[3] = new Car("Miniven", 2014, 2.5);

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Please enter the year of production car:");

        int carProductionYear = (Integer.parseInt(bf.readLine()));

        for (int i = 0; i < car.length; i++) {
            if (car[i].getYearOfProduction() == carProductionYear) {
                System.out.println(car[i]);
            }
        }
    }
}



