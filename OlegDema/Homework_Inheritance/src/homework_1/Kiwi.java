package homework_1;

public class Kiwi extends NonflyingBird {
	private String name;
	private int age;
	
	public Kiwi(String name, int age,String feathers,int leyEggs) {
		super(feathers, leyEggs);
		this.name = name;
		this.age = age;
	}

	public Kiwi() {
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
