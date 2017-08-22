/**
 * Created by Bogdan on 22.08.2017.
 */
public class SalariedEmployee extends Employe implements Salary {
    private long socialSecurityNumber;
    private  double hourlyRate=5.5;
    private int numberOfHoursWorked=170;
    public SalariedEmployee(String name, int id){
        setName(name);
        setId(id);
        socialSecurityNumber=getName().length()+id+31;
    }
    @Override
    public double calculatePay() {
        return hourlyRate*numberOfHoursWorked;
    }

    public long getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    public void setSocialSecurityNumber(long socialSecurityNumber) {
        this.socialSecurityNumber = socialSecurityNumber;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    public int getNumberOfHoursWorked() {
        return numberOfHoursWorked;
    }

    public void setNumberOfHoursWorked(int numberOfHoursWorked) {
        this.numberOfHoursWorked = numberOfHoursWorked;
    }
    public String outinf(){
        String s=String.format("Employe id - %d%nName - %s%nSocial Security Number - %d%n Payed - %f%n",getId(),getName(),socialSecurityNumber,calculatePay());
        return s;
    }
}
