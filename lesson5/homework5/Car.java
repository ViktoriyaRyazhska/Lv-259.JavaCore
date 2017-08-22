package regina.com;

public class Car {

    String type;
    int yearOfProduction;
    double engineCapacity;

    public Car(String type, int yearOfProduction, double engineCapacity) {
        this.type = type;
        this.yearOfProduction = yearOfProduction;
        this.engineCapacity = engineCapacity;
    }

    public int getYearOfProduction() {
        return yearOfProduction;
    }

    @Override
    public String toString() {
        return yearOfProduction + ", " + type + ", engine capacity:" + engineCapacity;
    }
}
