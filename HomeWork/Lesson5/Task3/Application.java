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
        int [] arr=new int[10];
        int x=0;
        int second=0;
        int pos=0;
        for (int i=0;i<arr.length;i++){
            System.out.println("Enter "+(i+1)+" number");
            arr[i]=Integer.parseInt(reader.readLine());
            if (arr[i]>0){
                x++;
                if(x==2){
                    second=i;
                }
            }

        }
        for(int i=1;i<arr.length;i++){
           if(arr[pos]>arr[i]){
               pos=i;
           }
        }
        System.out.println("Second positive number is - "+arr[second]+" position - "+ (second+1));
        System.out.println("The lower number is - "+ arr[pos]+" position "+ (pos+1));

    }
}
