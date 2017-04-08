package zhenya.workshop_7;

public class RandomIntegersGenerator extends RandomValuesGenerator {

    @Override
    public void generateRandomStuff(int objectsAmount){
        for (int i=1; i<=objectsAmount; i++){
            System.out.println("Random number #" + i + ": " + (int) (Math.random() * 100 + 1));
        }
    }
}
