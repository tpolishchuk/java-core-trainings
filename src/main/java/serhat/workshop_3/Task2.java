package serhat.workshop_3;

/**
 * Created by serhatgemici on 07/02/2017.
 */
public class Task2 {

    private static void printTheLongestWord(String sentence) {
        sentence.trim();
        String initialLongestWord = "";
        char partial;
        String realLongestWord = "";

        for (int i = 0; i < sentence.length(); i++) {

            if ((sentence.charAt(i) != ' ') && (sentence.charAt(i) != '!') && (sentence.charAt(i) != '.') && (sentence.charAt(i) != ',') && (sentence.charAt(i) != '\'')) {

                partial = sentence.charAt(i);
                initialLongestWord = initialLongestWord + partial;

            } else if (sentence.charAt(i) == ' ' || sentence.charAt(i) == '!') {

                if ((initialLongestWord.length() > realLongestWord.length()) || (initialLongestWord.length() == realLongestWord.length())) {

                    realLongestWord = initialLongestWord;

                }

                initialLongestWord = "";

            }
        }

        System.out.println("In the sentence:");
        System.out.println("\"" + sentence + "\"");
        if(sentence.length()==0){

            System.out.println("The longest cannot be calculated, because there is no sentence");
            System.out.println("");

        }
        else {

            System.out.println("The longest word is " + "\"" + realLongestWord + "\"");
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        printTheLongestWord("Buy yellow banana!");
        printTheLongestWord("");
        printTheLongestWord("I don't need a hair stylist, my pillow gives me a new hairstyle every morning.");
        printTheLongestWord("The quick brown fox jumps over the lazy dog");
        printTheLongestWord("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.");
    }
}
