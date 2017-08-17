import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Bogdan on 17.08.2017.
 */
public class Application {
    public static void main(String[] args) throws IOException {
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        int err=Integer.parseInt(reader.readLine());
        ClientErrors clientErrors = null;
        switch (err){
            case 400:clientErrors=ClientErrors.BADREQUEST;break;
            case 401:clientErrors=ClientErrors.UNAUTHORIZED;break;
            case 402:clientErrors=ClientErrors.PAYMENTREQUIRED;break;
            case 403:clientErrors=ClientErrors.FORBIDDEN;break;
            case 404:clientErrors=ClientErrors.NOTFOUND;break;
            default:
                System.out.println("There isn't any error by this number");
                break;
        }
        if(clientErrors!=null){
            System.out.println("Error - "+clientErrors);
        }


    }
}
