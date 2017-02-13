package serhat.workshop_3;

/**
 * Created by serhatgemici on 13/02/2017.
 */
public class Task6 {

    private static void conjugateRegularVerb(String verb) {
        verb.trim();
        int length = verb.length();
        String subString = verb.substring(0, length - 2);
        System.out.println("Verb: " + verb);
        System.out.println("ich " + subString + "e");
        System.out.println("du " + subString + "st");
        System.out.println("er/sie/es " + subString + "t");
        System.out.println("wir " + verb);
        System.out.println("ihr " + subString + "t");
        System.out.println("sie/Sie " + verb);
        System.out.println("");
        System.out.println("");

    }

    public static void main(String[] args) {
        conjugateRegularVerb("schreiben");
        conjugateRegularVerb("schwimmen");
    }
}
