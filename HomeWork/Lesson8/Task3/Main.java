import java.text.DecimalFormat;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Bogdan on 29.08.2017.
 */
public class Main
{
    private static final String CURRENCY_SYMBOLS= "\\p{Sc}";
    public static void main(String[] args) {
        Pattern p = Pattern.compile("[" +CURRENCY_SYMBOLS + "][\\d,]+");

        Matcher m = p.matcher("i have only $500 but i must send much more money $13,000 or $800 ");

        while (m.find()) {
            System.out.println(m.group());

        }

    }
}
