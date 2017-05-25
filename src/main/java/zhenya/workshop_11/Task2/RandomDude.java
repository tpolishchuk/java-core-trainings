package zhenya.workshop_11.Task2;

public class RandomDude implements RandomIntegerGenerator, RandomStringGenerator {
    private int age;
    private String name;

    public RandomDude() {
        this.age = generateRandomInteger(50);
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
