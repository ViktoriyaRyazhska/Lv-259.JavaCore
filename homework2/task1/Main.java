package task1;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Employer employer1 = new Employer("Smit", 10);
        employer1.setHours(10);

        Employer employer2 = new Employer("Djon", 12, 14);

        Employer employer3 = new Employer();
        employer3.setName("Anna");
        employer3.setHours(8);
        employer3.setRate(15);

        System.out.println("Our employers:");

        System.out.print(employer1);
        System.out.print(" Salary: ");
        System.out.print(employer1.salary());
        System.out.print(", Bonuses: ");
        System.out.println(employer1.bonuses());

        System.out.print(employer2);
        System.out.print(" Salary: ");
        System.out.print(employer2.salary());
        System.out.print(", Bonuses: ");
        System.out.println(employer2.bonuses());

        System.out.print(employer3);
        System.out.print(" Salary: ");
        System.out.print(employer3.salary());
        System.out.print(", Bonuses: ");
        System.out.println(employer3.bonuses());

        System.out.println("Total hours of all employers: " + Employer.totalSum + " hours");
    }
}
