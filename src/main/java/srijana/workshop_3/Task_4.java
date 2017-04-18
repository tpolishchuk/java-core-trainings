
// Write a code, which helps you with the conjugation of German regular verbs



package srijana.workshop_3;

import java.io.IOException;

/**
 * Created by carmudi on 09/04/2017.
 */
public class Task_4 {

    public static void main(String[] args) {
        conjugateRegularVerb("schreiben");

        conjugateRegularVerb("schwimmen");

    }





    private  static void   conjugateRegularVerb(String verb){

        int len =  verb.length();

        String[] person = {"ich","du","er/sie/es","ihr","wir","Sie"};

        String[] suffix = {"e","st","t", "t", "en","en"};

        try {
            for (int i=0; i<6; i++){
                System.out.println(person[i]+ " " + verb.substring(0, len-2) + suffix[i] );
            }
        }
        catch(Exception ex) {
            System.out.println("ERROR" + ex);
            System.out.println();
        }






    }

}
