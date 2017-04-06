package zhenya.workshop_7;

public class RandomValuesGenerator {

    public RandomValuesGenerator() {
        System.out.println(getClass().getSimpleName() + " was created");
    }

    protected void generateRandomStuff(int objectsAmount){
        System.out.println(String.format("Unable to create %d unknown arguments", objectsAmount));
    }
}
