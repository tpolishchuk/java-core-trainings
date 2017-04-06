package zhenya.workshop_7;

public class Main {

    public static void main(String[] args) {
        RandomIntegersGenerator randomIntegersGenerator = new RandomIntegersGenerator();
        RandomStringsGenerator randomStringsGenerator = new RandomStringsGenerator();
        RandomCatsGenerator randomCatsGenerator = new RandomCatsGenerator();

        System.out.println("\n Integers");
        randomIntegersGenerator.generateRandomStuff(5);
        System.out.println("\n Strings");
        randomStringsGenerator.generateRandomStuff(4);
        System.out.println("\n Cats");
        randomCatsGenerator.generateRandomStuff(2);
    }
}
