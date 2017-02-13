package serhat.workshop_3;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by serhatgemici on 13/02/2017.
 */
public class Task4 {

    public static void main(String[] args) {
        extractDigitsFromText("I'm 40-year-old. I have 5 cats and one fish.");
        extractDigitsFromText("Lorem Ipsum");
        extractDigitsFromText("this is 34.6");
    }

    private static void extractDigitsFromText(String text) {
        List wordList = new ArrayList();
        Pattern pattern = Pattern.compile("\\d+(\\.\\d+)?");
        Matcher matcher = pattern.matcher(text);

        while (matcher.find()) {

            wordList.add(matcher.group());

        }

        if (wordList.isEmpty()) {
            System.out.println("Text:");
            System.out.println(text);
            System.out.println("No digits were found");
            System.out.println("");

        } else {
            System.out.println("Text:");
            System.out.println(text);
            System.out.println("Digits found: " + wordList);
            System.out.println("");
        }
    }
}
