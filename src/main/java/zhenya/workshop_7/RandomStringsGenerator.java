package zhenya.workshop_7;

import org.apache.commons.lang.RandomStringUtils;

public class RandomStringsGenerator extends RandomValuesGenerator {

    @Override
    public void generateRandomStuff(int objectsAmount) {
        for (int i = 1; i <= objectsAmount; i++) {
            System.out.println("Random string #" + i + ": " + RandomStringUtils.randomAlphabetic(10));
        }
    }
}
