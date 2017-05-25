package zhenya.workshop_11;

public class Aircraft implements FuelConsuming {

    @Override
    public int calculateFuelConsumption(int km){
        int fuelConsumption = 2600 / 850;
        return fuelConsumption * km;
    }
}
