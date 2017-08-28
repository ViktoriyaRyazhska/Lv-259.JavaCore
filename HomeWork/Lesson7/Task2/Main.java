import javax.swing.text.html.HTMLDocument;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * Created by Bogdan on 29.08.2017.
 */
public class Main {
    public static void main(String[] args) {
        Map<String,String> names=new HashMap<>();
        names.put("Ivanov","Orest");
        names.put("Yaciv","Ivan");
        names.put("Hutir","Evgen");
        names.put("Martyno","Orest");
        names.put("Lokiv","Volodymyr");
        names.put("Vituk","Nestor");
        names.put("Oreagol","Mark");
        names.put("Ipores","Adrian");
        names.put("IYahif","Maryan");
        names.put("Alban","Orest");
        System.out.println(names);
        for(String key:names.keySet()){
            if(names.get(key).equals("Orest")){

            }else{
                System.out.printf("  "+key+"=0"+names.get(key)+",");
            }
        }





    }
}
