package zhenya.workshop_3;

public class Task6 {
    private static  void conjugateRegularVerb(String verb){
        String verb_root =  verb.substring(0, verb.length() - 2);
        System.out.println("ich " + verb_root + "e");
        System.out.println("du " + verb_root + "st");
        System.out.println("er/sie/es " + verb_root + "t");
        System.out.println("wir " + verb);
        System.out.println("ihr " + verb_root + "t");
        System.out.println("sie/Sie " + verb);
        System.out.println("\n");

    }

    public static void main(String[] args) {
        conjugateRegularVerb("schreiben");
        conjugateRegularVerb("schwimmen");
        conjugateRegularVerb("gehen");

    }
}
