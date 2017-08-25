package task1;

public class FlyingBird extends Bird {

	String name;
	boolean feather;

	public FlyingBird() {
		
	}

	public FlyingBird(String name, boolean feather) {
		this.name = name;
		this.feather = feather;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isFeather() {
		return feather;
	}

	public void setFeather(boolean feather) {
		this.feather = feather;
	}

	@Override
	public String toString() {
		return "FlyingBird [name=" + name + ", feather=" + feather + "]";
	}

	@Override
	public void fly() {
			System.out.println("This bird can fly, because evolution did not bypass them");
	}
}
