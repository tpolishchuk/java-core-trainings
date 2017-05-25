package zhenya.workshop_11.Task2;

public class RandomWeather implements RandomIntegerGenerator, RandomBooleanGenerator {
    private int temperature;
    private boolean isSunny;

    public RandomWeather() {
        this.temperature = generateRandomInteger(50);
        this.isSunny = generateRandomBoolean();
    }

    private int getTemperature() {
        return temperature;
    }

    private boolean isSunny() {
        return isSunny;
    }

    @Override
    public String toString() {
        String message;
        if (isSunny()) {
            message = "Today is +" + getTemperature() + ", the weather is sunny";
        }
        else {
            message = "Today is -" + getTemperature() + ", the weather is cloudy";
        }
        return message;
    }
}
