package regina.com;

public class Dog {
    private String name;
    private Breed breed;
    private int age;

    public Dog(String name, Breed breed, int age) {
        this.name = name;
        this.breed = breed;
        this.age = age;
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

    public boolean equalsName(Dog dog){
        if (this.name == dog.name) {
            return true;
        } else return false;
    }

    @Override
    public String toString() {
        return name + ", " + getBreed().getBreed();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Dog dog = (Dog) o;

        if (age != dog.age) return false;
        if (name != null ? !name.equals(dog.name) : dog.name != null) return false;
        return breed == dog.breed;
    }

    @Override
    public int hashCode() {
        return breed.hashCode();
    }
}



