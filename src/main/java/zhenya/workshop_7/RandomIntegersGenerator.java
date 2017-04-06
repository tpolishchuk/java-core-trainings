package zhenya.workshop_7;

public class RandomIntegersGenerator extends RandomValuesGenerator {

    protected static int generateInt() {
        return (int) (Math.random() * 100 + 1);
    }

    @Override
    public void generateRandomStuff(int objectsAmount){
        int randomNumber;
        for (int i=1; i<=objectsAmount; i++){
            randomNumber = generateInt();
            System.out.println("Random number #" + i + ": " + randomNumber);
        }
    }
}
