package zhenya.workshop_7;

import org.apache.commons.lang.RandomStringUtils;

public class RandomCatsGenerator extends RandomValuesGenerator {

    @Override
    public void generateRandomStuff(int objectsAmount) {
        for (int i = 1; i <= objectsAmount; i++) {
            System.out.println("Cat{name='" + RandomStringUtils.randomAlphabetic(10) +
                               "', age='" + (int) (Math.random() * 15 + 1) + "'}");
        }
    }
}
