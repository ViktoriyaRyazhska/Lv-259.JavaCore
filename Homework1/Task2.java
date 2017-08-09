import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Task2 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String name,address;
        System.out.println("What's your name?");
        System.out.print("Your answer: ");
        name=br.readLine();
        System.out.println("Where're you live, "+name+"?");
        System.out.print("Your answer: ");
        address=br.readLine();
        System.out.println(name+" lives in "+address+".");
        
    }
}
