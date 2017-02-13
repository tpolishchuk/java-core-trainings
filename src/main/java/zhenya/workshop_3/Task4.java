package zhenya.workshop_3;

import java.util.LinkedList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Task4 {

    public static void main(String[] args) {
        extractDigitsFromText("I'm 40-year-old. I have 5 cats and one fish.");
        extractDigitsFromText("Lorem Ipsum");
        extractDigitsFromText("123");
        extractDigitsFromText("");
    }

    private static void extractDigitsFromText(String text) {
        LinkedList<String> numbers = new LinkedList<String>();
        Pattern p = Pattern.compile("\\d+");
        Matcher m = p.matcher(text);
        while (m.find()) {
            numbers.add(m.group());
        }
        if (numbers.isEmpty()) {
            System.out.println("No digits were found");
        } else {
            System.out.println("Digits found: " + numbers);
        }
    }
}
