package zhenya.workshop_3;

public class Task2 {

    private static void printTheLongestWord(String sentence){
        if (sentence == ""){
            System.out.println("In the sentence:\n" +
                    "\"\"\n" +
                    "The longest word cannot be calculated, because there is no sentence \n");
        } else {
            String[] words = sentence.replaceAll("[\\p{Punct}&&[^']]", "").split("\\s+");
            String longestWord = words[0];
            for (int i = 1; i< words.length; i++){
                if (longestWord.length() <= words[i].length()){
                    longestWord = words[i];
                    }
                }
                System.out.println("In the sentence:\n" +
                        "\"" + sentence + "\"\n" +
                        "The longest word is \"" + longestWord + "\"\n");
        }

    }

    public static void main(String[] args) {
        printTheLongestWord("Buy yellow banana!");
        printTheLongestWord("");
        printTheLongestWord("I don't need a hair stylist, my pillow gives me a new hairstyle every morning.");
        printTheLongestWord("The quick brown fox jumps over the lazy dog");
        printTheLongestWord("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.");
        printTheLongestWord("don't.");
    }

}


