package zhenya.workshop_11.Task2;

import java.util.Random;

public interface RandomBooleanGenerator {

    Random random = new Random();

    default boolean generateRandomBoolean() {
        return random.nextBoolean();
    }
}
