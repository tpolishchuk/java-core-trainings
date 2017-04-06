package serhat.workshop_7;

import java.util.Random;

/**
 * Created by serhatgemici on 06.04.17.
 */
public class RandomStringsGenerator extends RandomValuesGenerator {

    @Override
    protected void generateRandomStuff(int objectsAmount) {

        for (int i = 1; i <= objectsAmount; ++i) {

            String SALTCHARS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
            StringBuilder salt = new StringBuilder();
            Random rnd = new Random();
            while (salt.length() < 18) {
                int index = (int) (rnd.nextFloat() * SALTCHARS.length());
                salt.append(SALTCHARS.charAt(index));
            }
            String saltStr = salt.toString();
            System.out.println(saltStr);
        }
        System.out.println("****\n");
    }
}