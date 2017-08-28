/**
 * Created by Bogdan on 29.08.2017.
 */
public class Main {
    public static void main(String[] args) {
        String s = "Hello my name is Bogdan";
        String[] word = s.split(" ");
        String longest = " ";
        for (int i = 0; i < word.length; i++) {
            for (int j =  i; j < word.length; j++) {
                if (word[i].length() >= word[j].length()) {
                    longest = word[i];
                }
            }
        }
        System.out.println(longest);
        System.out.println(longest.length());
        System.out.println(word[word.length-2]);
    }
}
