package examples;

import org.apache.commons.lang.math.RandomUtils;

/**
 * RandomUtils is placed in org.apache.commons
 * It is included as dependency in pom.xml in root folder
 * Javadoc:
 * https://commons.apache.org/proper/commons-lang/javadocs/api-2.6/org/apache/commons/lang/math/RandomUtils.html
 */
public class RandomUtilsExample {

    public static void main(String[] args) {
        printRandomInteger();
        printRandomIntegerInRange(5);
    }

    private static void printRandomInteger() {
        System.out.println("Random integer: " + RandomUtils.nextInt());
    }

    private static void printRandomIntegerInRange(int range) {
        System.out.println(String.format("Random integer in range from 0 to %d: %d",
                                         range - 1,
                                         RandomUtils.nextInt(range)));
    }
}
