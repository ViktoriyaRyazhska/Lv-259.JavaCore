package Тranslator;
import java.util.ArrayList;
public class Dictionary {
		private String word;

		public String getWord() {
			return word;
		}

		public void setWord(String word) {
			this.word = word;
		}

		public String slovnik(String s, int t) {
			ArrayList<String> mass1 = new ArrayList<String>();
			ArrayList<String> mass2 = new ArrayList<String>();
			mass1.add("begin");		mass2.add("початок");
			mass1.add("end");		mass2.add("кінець");
			mass1.add("people");	mass2.add("людина");
			mass1.add("word");		mass2.add("слово");
			mass1.add("if");		mass2.add("якщо");
			mass1.add("you");		mass2.add("ти");
			mass1.add("you");		mass2.add("ви");
			mass1.add("room");		mass2.add("кімната");
			mass1.add("room");		mass2.add("кімнату");
			mass1.add("i");		    mass2.add("я");
			mass1.add("up");		mass2.add("вгору");
			mass1.add("inside");	mass2.add("всередині");
			mass1.add("second");	mass2.add("другий");
			mass1.add("right");		mass2.add("право");
			mass1.add("with");		mass2.add("з");
			mass1.add("hand");		mass2.add("рука");
			mass1.add("across");	mass2.add("через");
			mass1.add("catch");		mass2.add("ловити");
			mass1.add("read");		mass2.add("читати");
			mass1.add("great");		mass2.add("великий");
			mass1.add("do");		mass2.add("робити");
			mass1.add("home");		mass2.add("дім");
			mass1.add("work");		mass2.add("робота");
			mass1.add("hello");		mass2.add("привіт");
			mass1.add("word");		mass2.add("слово");
			mass1.add("hi");		mass2.add("він");
			mass1.add("she");		mass2.add("вона");
			mass1.add("we");		mass2.add("ми");
			mass1.add("go");		mass2.add("іти");
			mass1.add("go");		mass2.add("іду");
			mass1.add("go");		mass2.add("іде");
			mass1.add("window");	mass2.add("вікно");
			mass1.add("phone");		mass2.add("телефон");
			mass1.add("without");	mass2.add("без");
			mass1.add("friend");	mass2.add("друг");
			mass1.add("for");		mass2.add("для");
			mass1.add("week");		mass2.add("тиждень");
			mass1.add("bring");		mass2.add("приносити");
			mass1.add("say");		mass2.add("сказати");
			mass1.add("along");		mass2.add("уздовж");
			mass1.add("about");		mass2.add("про");
			mass1.add("air");		mass2.add("повітря");
			mass1.add("in");		mass2.add("в");
			mass1.add("shop");		mass2.add("магазин");
			
			
			String s1 = s;
			if (t == 1) {
				for (int i = 0; i < mass1.size(); i++) {
					if (s.equalsIgnoreCase(mass1.get(i))) {
						s1 = mass2.get(i);
					}
				}
			} else {
				for (int i = 0; i < mass2.size(); i++) {
					if (s.equalsIgnoreCase(mass2.get(i))) {
						s1 = mass1.get(i);
					}
				}
			};
			return s1;
		}

		public String rezEn(String str) {
			String[] arr = str.split(" ");
			for (int i = 0; i < arr.length; i++) {
				this.word = word + slovnik(arr[i], 1) + " ";
			}
			return word;
		}
		public String rezUa(String str) {
			String[] arr = str.split(" ");
			for (int i = 0; i < arr.length; i++) {
				this.word = word + slovnik(arr[i], 0) + " ";
			}
			return word;
		
	}
	
}
