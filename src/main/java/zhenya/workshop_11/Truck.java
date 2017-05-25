package zhenya.workshop_11;

public class Truck implements FuelConsuming {

    @Override
    public int calculateFuelConsumption(int km){
        int fuelConsumption = 25;
        return fuelConsumption * km / 100;
    }
}
