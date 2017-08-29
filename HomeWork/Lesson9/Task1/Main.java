/**
 * Created by Bogdan on 29.08.2017.
 */
public class Main {
    public static void main(String[] args) {
    double a1=2.7;
    double a2=7.9;
    System.out.println(diving(a1,a2));
    }
    public static double diving(double a1,double a2){
        double rez=0;
        try {rez=a1/a2;}
        catch (Exception e){e.printStackTrace();}
        return rez;
    }
}
