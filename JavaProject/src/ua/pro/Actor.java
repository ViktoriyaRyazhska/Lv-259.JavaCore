package ua.pro;

public class Actor {

	private String firstName;
	private String secondName;
	
	public Actor() {
		
	}

	public Actor(String firstName, String secondName) {
		this.firstName = firstName;
		this.secondName = secondName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getSecondName() {
		return secondName;
	}

	public void setSecondName(String secondName) {
		this.secondName = secondName;
	}

	@Override
	public String toString() {
		return "Actor [firstName=" + firstName + ", secondName=" + secondName + "]";
	}
		
}
