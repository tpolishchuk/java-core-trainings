package zhenya.workshop_7;

import org.apache.commons.lang.RandomStringUtils;

public class RandomStringsGenerator extends RandomValuesGenerator {

    protected static String generateString(int count) {
        return RandomStringUtils.randomAlphabetic(count);
    }

    @Override
    public void generateRandomStuff(int objectsAmount) {
        String randomString;
        for (int i = 1; i <= objectsAmount; i++) {
            randomString = generateString(10);
            System.out.println("Random string #" + i + ": " + randomString);
        }
    }
}
