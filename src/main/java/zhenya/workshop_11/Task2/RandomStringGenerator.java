package zhenya.workshop_11.Task2;

import org.apache.commons.lang.RandomStringUtils;

public interface RandomStringGenerator {

    default String generateRandomString(int length) {
        return RandomStringUtils.randomAlphabetic(length).toLowerCase();
    }
}
