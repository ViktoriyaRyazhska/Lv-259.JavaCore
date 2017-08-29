package homework7.task3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task3 {

	public static boolean checkPattern(String str) {
		Pattern pattern = Pattern.compile("\\$(\\d*)(\\.\\d{2})?");
		Matcher matcher = pattern.matcher(str);

		return matcher.matches();

	}

	public static String reEnterStr(String str, BufferedReader reader) throws IOException {
		System.out.print("Wrong format, please reenter the ocurrency : ");
		str = reader.readLine();
		return str;
	}

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter the ocurrency : ");
		String ocurrency = reader.readLine();
		while (!checkPattern(ocurrency)) {

			if (!checkPattern(ocurrency)) {
				ocurrency = reEnterStr(ocurrency, reader);
				continue;
			} else {
				break;
			}

		}
		System.out.println("Ocurrency = " + ocurrency);
	}

}
