package homework_1;

public class Eagle extends FlyingBird {
	private String name;
	private int age;
	
	public Eagle(String name, int age,String feathers,int leyEggs) {
		super(feathers, leyEggs);
		this.name = name;
		this.age = age;
	}

	public Eagle() {
		super();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Eagle [name=" + name + ", age=" + age + "]";
	}
	
	
	
	

}
