/**
 * Created by Bogdan on 22.08.2017.
 */
public class Car {
    private double capacity;
    private int year;
    public Car (){

    }
    public Car(int year,double capacity){
        this.year=year;
        this.capacity=capacity;
    }

    public double getCapacity() {
        return capacity;
    }

    public void setCapacity(double capacity) {
        this.capacity = capacity;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
