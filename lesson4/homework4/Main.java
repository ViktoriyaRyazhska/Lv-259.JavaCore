package regina.com;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Dog dog1 = new Dog("Bobik", Breed.LABRADOR, 4);
        Dog dog2 = new Dog("Kuzya", Breed.SPANIEL, 2);
        Dog dog3 = new Dog("Sharik", Breed.BOXER,3);


      checkAgedos(dog1,dog2,dog3);



            if (dog1.equalsName(dog3) || dog1.equalsName(dog2) || dog3.equalsName(dog2) ){
                System.out.println("There are some dogs with the same name.");
            } else System.out.println("There are all dogs with the different name");

        }

    private static void checkAgedos(Dog dog1, Dog dog2, Dog dog3) {

        if (dog1.getAge() > dog2.getAge() && dog1.getAge() > dog2.getAge()) {
            System.out.println(dog1);
        } else if (dog2.getAge() > dog1.getAge() && dog2.getAge() > dog3.getAge()) {
            System.out.println(dog2);
        } else System.out.println(dog3);
    }


    }

