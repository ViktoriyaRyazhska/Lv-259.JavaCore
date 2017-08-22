package regina.com;

public class ContractEmployee extends Employee implements Calculate {

    private String federalTaxIdmember;
    private double fixedMontlyPayment;

    public ContractEmployee(String employeeId, String name, String federalTaxIdmember, double fixedMontlyPayment) {
        super(employeeId, name);
        this.federalTaxIdmember = federalTaxIdmember;
        this.fixedMontlyPayment = fixedMontlyPayment;
    }

    @Override
    public double calculatePay() {
        return fixedMontlyPayment;
    }

    @Override
    public String toString() {
        return "ID: " + employeeId + ", " + name;
    }
}

