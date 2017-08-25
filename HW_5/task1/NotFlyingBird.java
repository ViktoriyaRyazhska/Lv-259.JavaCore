package task1;

public class NotFlyingBird extends Bird {

	String name;
	boolean feather = false;
	
	public NotFlyingBird() {
	
	}

	public NotFlyingBird(String name, boolean feather) {
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
		return "NotFlyingBird [name=" + name + ", feather=" + feather + "]";
	}

	@Override
	public void fly() {
		System.out.println("This bird have a feathers, but cannot fly, because this ability was taken away by evolution");
	}
	
	
}
