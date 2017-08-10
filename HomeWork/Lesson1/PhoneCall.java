import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Time;

/**
 * Created by Bogdan on 08.08.2017.
 */
public class PhoneCall
{
    public static void main(String[] args) throws IOException {
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        double []c={1,2,3};
       double[]t=new double[3];
       double sum=0;
       for(int i=0;i<t.length;i++){
           System.out.println("Phone call from "+(i+1)+" countrie");
           t[i]=Double.parseDouble(reader.readLine());
       }
       for (int i=0;i<t.length;i++){
           System.out.printf("%d  call cost = %.2f %n",(i+1),(c[i]*t[i]));
           sum+=c[i]*t[i];
       }
        System.out.println("All calls cost " + sum);


    }
}
