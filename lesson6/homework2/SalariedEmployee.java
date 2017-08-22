package regina.com;

public class SalariedEmployee extends Employee implements Calculate{

   private String socialSecuityNumber;
   private double hourlyRate;
   private double numberOfHoursWorked;

    public SalariedEmployee(String employeeId, String name, String socialSecuityNumber,double hourlyRate, double numberOfHoursWorked) {
        super(employeeId, name);
        this.socialSecuityNumber = socialSecuityNumber;
        this.hourlyRate = hourlyRate;
        this.numberOfHoursWorked = numberOfHoursWorked;
    }


    @Override
    public double calculatePay() {
        return hourlyRate * numberOfHoursWorked;
    }

    @Override
    public String toString() {
        return "ID: " + employeeId +", " + name;
    }
}
