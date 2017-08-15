package task2;


public class Person {

    final static int currentYear = 2017;

    private String name;
    private int birthYear;


    public Person() {
    }

    public Person(String name, int birthYear) {
        this.name = name;
        this.birthYear = birthYear;
    }

    public int calculateAge() {
        return currentYear - birthYear;
    }


    public void changeName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person " + name + ", birthYear:" + birthYear + ", age: " + this.calculateAge();
    }

    public void printPerson() {
        System.out.println(this);
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

}