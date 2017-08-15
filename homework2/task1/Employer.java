package task1;

public class Employer {

    static int totalSum;

    private String name;
    private int hours;
    private double rate;

    public Employer() {
    }

    public Employer(String name, int rate) {
        this.name = name;
        this.rate = rate;
    }

    public Employer(String name, int hours, int rate) {
        this.name = name;
        this.hours = hours;
        this.rate = rate;
        totalSum = totalSum + hours;
    }


    public double salary() {
        return (double) rate * hours;
    }

    // this method duplicate method setRate by conditional
    public void changeRate(double rate) {
        this.rate = rate;
    }

    public double bonuses() {
        return rate * hours / 10;
    }

    @Override
    public String toString(){
        return "Employer [name = " + name + " rate = " + rate + " hours = " + hours + "]";
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        int hoursDifference = hours - this.hours;
        this.hours = hours;
        totalSum = totalSum + hoursDifference;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }
}
