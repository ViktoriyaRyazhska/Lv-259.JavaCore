package homework;

public class Dog {
	private String name;
	private Breed breed;
	private int age;
	public Dog(String name, String breed, int age) {
		super();
		this.name = name;
		this.breed = enumToBreed(breed);
		this.age = age;
	}
	public Dog() {
		super();
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public Breed getBreed() {
		return breed;
	}
	public void setBreed(Breed breed) {
		this.breed = breed;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Dog [name=" + name + ", breed=" + breed + ", age=" + age + "]";
	}
	
	public Breed enumToBreed(String breed){
		switch (breed.toLowerCase()) {
		case "boxer": return Breed.BOXER;
		case "akita": return Breed.AKITA;
		case "azawakh": return Breed.AZAWAKH;
		case "beagle": return Breed.BEAGLE;
		default:
			break;
		}
		return null;
	}

}
