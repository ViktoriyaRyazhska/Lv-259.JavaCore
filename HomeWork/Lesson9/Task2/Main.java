import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Bogdan on 29.08.2017.
 */
public class Main {
    public static void main(String[] args) {
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        int q=0;
        do {
            try {
                int []arr=enter();
                for (int i:arr)System.out.print(" "+i);
                q = 1;
            } catch (IOException e){e.printStackTrace();}
             catch (Exception e){ e.printStackTrace();}
        }while (q!=1);
    }
    public static int[] enter() throws Exception {
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        int[]arr=new int[10];
        for (int i=0;i<arr.length;i++){
            if(i>0){
                System.out.println("Enter number bigger than - " +arr[i-1] + " but not bigger than - "+(100-arr.length+i));
                int x=Integer.parseInt(reader.readLine());
                if(x<=arr[i-1]||x>=(101-arr.length+i)){
                    throw new Exception("The number is incorrect");
                }else arr[i]=x;
            }else{
                System.out.println("Enter the number bigger than 1 but not bigger than 90");
                int x=Integer.parseInt(reader.readLine());
                if(x<=1||x>=91){throw new Exception("The number is incorrect");}
                else arr[i]=x;
            }
        }
        return arr;
    }
}
