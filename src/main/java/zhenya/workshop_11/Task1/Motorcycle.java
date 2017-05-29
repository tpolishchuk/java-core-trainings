package zhenya.workshop_11.Task1;

public class Motorcycle implements FuelConsuming {

    @Override
    public int calculateFuelConsumption(int km) {
        int fuelConsumption = 7;
        return fuelConsumption * km / 100;
    }
}
