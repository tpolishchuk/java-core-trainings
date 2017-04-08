package zhenya.workshop_7;

public class Executor {

    public static void main(String[] args) {
        RandomIntegersGenerator randomIntegersGenerator = new RandomIntegersGenerator();
        randomIntegersGenerator.generateRandomStuff(5);

        System.out.println("\n");
        RandomStringsGenerator randomStringsGenerator = new RandomStringsGenerator();
        randomStringsGenerator.generateRandomStuff(5);

        System.out.println("\n");
        RandomCatsGenerator randomCatsGenerator = new RandomCatsGenerator();
        randomCatsGenerator.generateRandomStuff(2);

        System.out.println("\n");
        RandomHamsterGenerator randomHamsterGenerator = new RandomHamsterGenerator();
        randomHamsterGenerator.generateRandomStuff(1);
    }
}
