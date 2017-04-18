package srijana.workshop_3;

/**
 * Created by carmudi on 02/04/2017.
 */



/* Write a method, which determines the longest word in given sentence.
        If the sentence has two longest words with the same length, just print the last one.
        Do not calculate whitespaces, apostrophes, commas, dashes and dots as a word.
*/

public class Task_2 {


        //Task_2 obj = new Task_2();
        public static void main(String[] args) {
            printTheLongestWord("Buy yellow banana!");
            printTheLongestWord("");
            printTheLongestWord("I don't need a hair stylist, my pillow gives me a new hairstyle every morning.");
            printTheLongestWord("The quick brown fox jumps over the lazy dog");
            printTheLongestWord("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.");
        }




    private static void printTheLongestWord(String sentence) {

        String longestWord = "";

        String[] words = sentence.split(" ");

        for (int i = 0; i < words.length; i++) {

            int itemlen = words[i].length();


            if (itemlen >= longestWord.length())
                longestWord = words[i];


        }

        System.out.print("The longest word in given sentence is: " + longestWord);


    }


}
