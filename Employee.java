package Homework2;

public abstract class Employee {
	
	public String employeeld;
	public int ID;
	public String name;
	
	
	public double getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Employee (){};
	public Employee (String n, int Id){
		this.name = n;
		this.ID = Id;}

}
