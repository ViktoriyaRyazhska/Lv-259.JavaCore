import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Bogdan on 17.08.2017.
 */
public class Application {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 1; i < 4; i++) {
            System.out.println("Enter " + i + " number");
            float x = Float.parseFloat(reader.readLine());
            if((-5<x)&&(x<5)){
                if (3==i){
                    System.out.println("They all belong to the range [-5,5]");
                }
            }else{
                System.out.println("They all dont belong to the range [-5,5]");
                break;
            }

        }
    }
}

