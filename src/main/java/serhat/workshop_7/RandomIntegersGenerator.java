package serhat.workshop_7;

import java.util.Random;

/**
 * Created by serhatgemici on 06.04.17.
 */
public class RandomIntegersGenerator extends RandomValuesGenerator {

    @Override
    protected void generateRandomStuff(int objectsAmount) {
        Random randomIntGenerator = new Random();
        for (int i = 1; i <= objectsAmount; ++i) {
            int randomInt = randomIntGenerator.nextInt(100);
            System.out.println(randomInt);
        }
        System.out.println("****\n");
    }
}
