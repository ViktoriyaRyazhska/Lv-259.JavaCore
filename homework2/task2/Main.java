package task2;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        // write your code here
       PersonCreator personCreator = new PersonCreator();

       Person person1 = personCreator.createPerson();
       Person person2 = personCreator.createPerson();
       Person person3 = personCreator.createPerson();
       Person person4 = personCreator.createPerson();
       Person person5 = personCreator.createPerson();

       person1.printPerson();
       person2.printPerson();
       person3.printPerson();
       person4.printPerson();
       person5.printPerson();
    }
}
