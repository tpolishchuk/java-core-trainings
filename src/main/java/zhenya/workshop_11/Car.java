package zhenya.workshop_11;

public class Car implements FuelConsuming {

    @Override
    public int calculateFuelConsumption(int km) {
        int fuelConsumption = 5;
        return fuelConsumption * km / 100;
    }
}
