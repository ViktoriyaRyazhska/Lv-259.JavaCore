/**
 * Created by Bogdan on 22.08.2017.
 */
public class ContractEmployee extends Employe implements Salary {
    private long federalTaxIdmember;
    private double fixedMonthlyPayment=4000.25;
    public ContractEmployee(String name,int id){
        setId(id);
        setName(name);
        federalTaxIdmember=getName().length()+id+68;
    }
    @Override
    public double calculatePay() {
        return fixedMonthlyPayment;
    }

    public long getFederalTaxIdmember() {
        return federalTaxIdmember;
    }

    public void setFederalTaxIdmember(long federalTaxIdmember) {
        this.federalTaxIdmember = federalTaxIdmember;
    }

    public double getFixedMonthlyPayment() {
        return fixedMonthlyPayment;
    }

    public void setFixedMonthlyPayment(double fixedMonthlyPayment) {
        this.fixedMonthlyPayment = fixedMonthlyPayment;
    }
    public String outinf(){
        String s=String.format("Employe id - %d%nName - %s%nFederal Tax Id Member  - %d%n Payed - %f%n",getId(),getName(),federalTaxIdmember,calculatePay());
        return s;
    }
}
