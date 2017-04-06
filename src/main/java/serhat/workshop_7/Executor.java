package serhat.workshop_7;

/**
 * Created by serhatgemici on 06.04.17.
 */
public class Executor {

    public static void main(String[] args) {
        RandomIntegersGenerator randomIntegersGenerator = new RandomIntegersGenerator();
        randomIntegersGenerator.generateRandomStuff(5);

        RandomStringsGenerator randomStringsGenerator = new RandomStringsGenerator();
        randomStringsGenerator.generateRandomStuff(5);

        RandomCatsGenerator randomCatsGenerator = new RandomCatsGenerator();
        randomCatsGenerator.generateRandomStuff(2);

        RandomHamstersGenerator randomHamstersGenerator = new RandomHamstersGenerator();
        randomHamstersGenerator.generateRandomStuff(1);

    }
}
