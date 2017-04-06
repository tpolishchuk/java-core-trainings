package serhat.workshop_7;

import java.util.Random;

/**
 * Created by serhatgemici on 06.04.17.
 */
public class RandomCatsGenerator extends RandomValuesGenerator {


    @Override
    protected void generateRandomStuff(int objectsAmount) {

        for (int i = 1; i <= objectsAmount; ++i) {

            Random randomAgeGenerator = new Random();
            int catsAge = randomAgeGenerator.nextInt(100);
            String SALTCHARS = "abcdefghijklmnoöprstuüwxvyz";
            StringBuilder salt = new StringBuilder();
            Random rnd = new Random();
            while (salt.length() < 7) {
                int index = (int) (rnd.nextFloat() * SALTCHARS.length());
                salt.append(SALTCHARS.charAt(index));
            }
            String randCatsName = salt.toString();

            Cat cat = new Cat(randCatsName, catsAge);
            cat.toString();
        }
        System.out.println("****\n");
    }
}