package zhenya.workshop_7;

public class RandomCatsGenerator extends RandomValuesGenerator {

    @Override
    public void generateRandomStuff(int objectsAmount) {
        RandomIntegersGenerator randomIntegersGenerator = new RandomIntegersGenerator();
        RandomStringsGenerator randomStringsGenerator = new RandomStringsGenerator();

        Cat randomCat = new Cat("", 0);

        for (int i = 1; i <= objectsAmount; i++) {
            randomCat.setAge(randomIntegersGenerator.generateInt());
            randomCat.setName(randomStringsGenerator.generateString(10));

            System.out.println("Random cat #" + i + ": " +
                               "\n name: " + randomCat.getName() +
                               "\n age: " + randomCat.getAge());
        }
    }
}
