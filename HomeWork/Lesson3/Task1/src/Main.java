import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.Year;

/**
     * Created by Bogdan on 15.08.2017.
     */
    public class Main {
        public static void main(String[] args) throws IOException{
            BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
            Person [] p=new Person[5];
            for(int i=0;i<p.length;i++){
                System.out.println("Please enter the name of "+(i+1)+" Person");
                p[i]=new Person();
                p[i].setName(reader.readLine());
                System.out.println("Now enter the birth of birthday of "+(i+1)+"Person");
                p[i].setBirthYear(Integer.parseInt(reader.readLine()));
            }
            for (int i=0;i<p.length;i++){
                System.out.println("Person #"+(i+1));
                System.out.println(p[i].getPerson());
            }


        }
    }
