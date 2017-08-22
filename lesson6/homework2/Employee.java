package regina.com;

public abstract class Employee {

    protected String employeeId;
    protected String name;


    public Employee(String employeeId, String name) {
        this.employeeId = employeeId;
        this.name = name;
    }

}