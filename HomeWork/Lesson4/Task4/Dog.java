/**
 * Created by Bogdan on 17.08.2017.
 */
public class Dog {
    private String name;
    private int age;
    private Breed breed;
    public Dog(String name){
        this.name=name;
    }
    public Breed getBreed() {
        return breed;
    }
    public void setBreed(Breed breed) {
        this.breed = breed;
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
    public String outInf(){
        return String.format("Dog name - %s;%nAge - %d;%nBreed - %s;%n",name,age,breed);
    }


}

