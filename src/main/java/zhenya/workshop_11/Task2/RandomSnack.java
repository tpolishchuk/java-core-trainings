package zhenya.workshop_11.Task2;

public class RandomSnack implements RandomDoubleGenerator, RandomStringGenerator {
    private double price;
    private String name;

    public RandomSnack() {
        this.price = generateRandomDouble(102);
        this.name = generateRandomString(9);
    }

    private double getPrice() {
        return price;
    }

    private String getName() {
        return name;
    }

    @Override
    public String toString() {
        String name = Character.toUpperCase(getName().charAt(0)) + getName().substring(1);
        String price = String.format("%.2f", getPrice());

        return "This is an awesome " + name + " and it costs only " + price + "€";
    }
}
