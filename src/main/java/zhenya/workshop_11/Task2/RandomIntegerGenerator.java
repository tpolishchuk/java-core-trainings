package zhenya.workshop_11;

import java.util.Random;

public interface RandomIntegerGenerator {

    default int generateRandomInteger(int limit) {
        Random r = new Random();
        return r.nextInt(limit);
    }
}
