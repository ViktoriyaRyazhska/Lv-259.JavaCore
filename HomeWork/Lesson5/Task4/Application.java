import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Bogdan on 17.08.2017.
 */
public class Application
{
    public static void main(String[] args) throws IOException {
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        int sum=0;
        boolean x=true;

        do{
            System.out.println("Enter the number");
            int y=Integer.parseInt(reader.readLine());
            if(y>0){
                sum+=y;
            }else{
                x=false;
            }

        }while (x);
        System.out.println(sum);
    }
}
