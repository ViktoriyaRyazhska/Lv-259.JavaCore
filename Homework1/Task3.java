import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Task3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        double c1,c2,c3;
        int t1,t2,t3;
        System.out.println("Enter the information about call in 1st country:");
        System.out.print("Price for the call (units/min) = ");
        c1=Double.parseDouble(br.readLine());
        System.out.print("Time talk continued (min) = ");
        t1=Integer.parseInt(br.readLine());

        System.out.println("Enter the information about call in 2nd country:");
        System.out.print("Price for the call (units/min) = ");
        c2=Double.parseDouble(br.readLine());
        System.out.print("Time talk continued (min) = ");
        t2=Integer.parseInt(br.readLine());

        System.out.println("Enter the information about call in 3rd country:");
        System.out.print("Price for the call (units/min) = ");
        c3=Double.parseDouble(br.readLine());
        System.out.print("Time talk continued (min) = ");
        t3=Integer.parseInt(br.readLine());

        System.out.println("Price for call in 1st country = "+(c1*t1)+" units");
        System.out.println("Price for call in 2nd country = "+(c2*t2)+" units");
        System.out.println("Price for call in 3rd country = "+(c3*t3)+" units");
        System.out.println("Price for calls in all 3 countries = "+((c1*t1)+(c2*t2)+(c3*t3))+" units");

      

    }
}
