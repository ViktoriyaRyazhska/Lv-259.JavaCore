import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Bogdan on 17.08.2017.
 */
public class Application {
    public static void main(String[] args) throws IOException {
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter 1 number");
        int max=Integer.parseInt(reader.readLine());
        int min=max;
        for (int i=2;i<4;i++){
            System.out.println("Enter "+i+" number");
            int x=Integer.parseInt(reader.readLine());
            if(x>max){
                max=x;
            }else if (x<min){
                min=x;
            }
        }
        System.out.println("min = "+ min);
        System.out.println("max = "+ max);
    }

}
