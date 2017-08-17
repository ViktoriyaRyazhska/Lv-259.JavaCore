import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Date;

/**
 * Created by Bogdan on 17.08.2017.
 */
public class Application {
    public static void main(String[] args) throws IOException {
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        Dog[]dogs=new Dog[3];
        int old=0;
        for (int i=0;i<dogs.length;i++){
            System.out.println("Enter the name of "+(i+1)+" dog");
            dogs[i]=new Dog(reader.readLine());
            System.out.println("Please enter age of the dog");
            dogs[i].setAge(Integer.parseInt(reader.readLine()));
            if(dogs[old].getAge()<dogs[i].getAge()){
                old=i;
            }
            System.out.println("what breed of your dog");
            System.out.println("1-AKITA , 2-AnatolianShepherdDog , 3-Beagle");
            int x=Integer.parseInt(reader.readLine());
            switch (x){
                case 1:dogs[i].setBreed(Breed.AKITA);break;
                case 2:dogs[i].setBreed(Breed.AnatolianShepherdDog);break;
                case 3:dogs[i].setBreed(Breed.Beagle);break;
            }
        }
        boolean name=false;
        for (int i=0;i<dogs.length;i++){
            for(int n=1;n<dogs.length;n++){
                if(dogs[i].getName().equalsIgnoreCase(dogs[n].getName())){
                    name=true;
                }
            }
        }
        if(name){
            System.out.println("There are dogs with the same names");
        }else {
            System.out.println("There arent dogs with the same names");
        }

        System.out.println("The oldest dog is - "+dogs[old].getName());
        for(Dog d:dogs){
            System.out.println(d.outInf());
        }

    }
}
