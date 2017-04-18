
/* Write a method, which extracts all digits from given string and shows them in console output */



package srijana.workshop_3;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by carmudi on 15/04/2017.
 */
public class Task_6 {


public  static void main(String[] args){

    extractDigitsFromText("I'm 40-year-old. I have 5 cats and one fish.");
    extractDigitsFromText("Lorem Ipsum");
}

    private static void extractDigitsFromText(String text){

        Pattern p = Pattern.compile("\\d+");
        List<String> numbers = new ArrayList<String>();
        Matcher m = p.matcher(text);

        while (m.find()) {
            numbers.add(m.group());
        }

        System.out.println("Text:");
        System.out.println(text);

        if(numbers.isEmpty()){
            System.out.println("No digits were found");
        }
        else {
            System.out.println("Digit found :" + numbers);
        }
    }
}



