package kateryna.workshop_3;

/**
 * Created by kate on 06.02.17.
 */
public class Task_2_longest_word {

    private static void printTheLongestWord(String sentence){
        if (sentence.equals("")) {
            System.out.println("In the sentence:\n" + sentence + "\nThe longest cannot be calculated, because there is no sentence\n");
        }
        else {
            String words[] = sentence.split("\\W");
            String longest_word = "";
            for (String word : words) {
                if (word.length() >= longest_word.length()) {
                    longest_word = word;
                }
            }
            System.out.println("In the sentence:\n" + sentence + "\nThe longest word is " + longest_word + "\n");
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
