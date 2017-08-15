package Homework;

public class Dog {
	private String name;
	private int age;
	
	public enum breeds {breed1, breed2, breed3, breed4}
	breeds breed;
		
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
	public breeds getBreed() {
		return breed;
	}
	public void setBreed(breeds breed) {
		this.breed = breed;
	}
	
	public Dog (){
	}
	public Dog (String n, int a, breeds b){
		name =n;
		age= a; 
		breed= b;
	}

}
