import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;

/**
 * Created by Bogdan on 17.08.2017.
 */
public class Application
{
    public static void main(String[] args) throws IOException {
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        Car []cars=new Car[4];
        int[]years=new int[4];
        for(int i=0;i<cars.length;i++){
            System.out.println("Enter year of "+(i+1)+" car");
            years[i]=Integer.parseInt(reader.readLine());
        }
        for(int i=0;i<cars.length-1;i++){
            for(int k=i+1;k<cars.length;k++){
                if(years[i]>years[k]){
                    int x=years[i];
                    years[i]=years[k];
                    years[k]=x;
                }
            }
        }
        for(int i=0;i<cars.length;i++){
            cars[i]=new Car(years[i],(i+1.5));
            System.out.println((i+1)+" - Car");
            System.out.println("Year - "+cars[i].getYear());
            System.out.println("Capacity - "+cars[i].getCapacity());
            System.out.println();
        }
    }
}
