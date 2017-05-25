package zhenya.workshop_11;

import java.util.Random;

public interface RandomDoubleGenerator {

    default double generateRandomDouble(double limit) {
        Random r = new Random();
        return r.nextDouble() * limit;
    }
}
