import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Bogdan on 22.08.2017.
 */
public class Main
{
    public static void main(String[] args) throws IOException {
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        Employe[]employes=new Employe[4];
        for (int i=0;i<employes.length;i++){
            System.out.println("Enter name of worker");
            if(i<2){
             employes[i]=new SalariedEmployee(reader.readLine(),(i+i*128+1));
         }else{
                employes[i]=new ContractEmployee(reader.readLine(),(i+i*256+1));
            }
        }
        for (Employe e:employes){
            System.out.println(e.outinf());
        }
    }
}

