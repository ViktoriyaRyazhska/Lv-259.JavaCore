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
        int []arr=new int[10];
        int first=0;
        int secon=0;
        boolean positive=true;
        for (int i=0;i<arr.length;i++){
            System.out.println("Enter the number");
            arr[i]=Integer.parseInt(reader.readLine());
            if (i<5){
                first+=arr[i];
            }else{
                secon+=arr[i];
            }
            if(arr[i]<0&&i<5){
                positive=false;
            }
        }
        if(positive){
            System.out.println("Sum of first 5 elements = "+first);

        }else {
            System.out.println("Sum of seconds elements =" +secon);
        }

    }
}
