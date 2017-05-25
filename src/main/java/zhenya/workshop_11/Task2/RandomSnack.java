package zhenya.workshop_11;

public class RandomSnack implements RandomDoubleGenerator, RandomStringGenerator {
    private double price;
    private String name;

    public RandomSnack() {
        this.price = generateRandomDouble(50000);
        this.name = generateRandomString(10);
    }

    private int getAge() {
        return age;
    }

    private String getName() {
        return name;
    }

    @Override
    public String toString(){
        String name = Character.toUpperCase(getName().charAt(0)) + getName().substring(1);

        return  "My name is " + name + " and I'm " + getAge() + "-year-old.";
    }
}
