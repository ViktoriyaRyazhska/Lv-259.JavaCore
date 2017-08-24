package regina.com;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) throws IOException {
        // write your code here


        // Pattern p = Pattern.compile("^[a-z0-9_-]{3,15}$");          
        //Matcher m = p.matcher(userNameString);          
        // return m.matches();  

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        String enterSentence = bf.readLine();
        Pattern p = Pattern.compile("\\$(\\d*)(\\.\\d{2})?");
        Matcher m = p.matcher(enterSentence);

        while (m.find()) {
            System.out.println(enterSentence.substring(m.start(), m.end()));
        }
    }
}



/* Implement a pattern for US currency: the first symbol "$", then any number of digits, dot and two digits
after the dot. Enter the text from the console that contains several occurrences of US currency.
Display all occurrences on the screen.
*/