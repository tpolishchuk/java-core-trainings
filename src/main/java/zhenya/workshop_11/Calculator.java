package zhenya.workshop_11;

public class Calculator {
    public static void main(String[] args) {
        Car someCar = new Car();
        System.out.println("Fuel consumption for car: " + someCar.calculateFuelConsumption(200));

        Motorcycle someMotorcycle = new Motorcycle();
        System.out.println("Fuel consumption for motorcycle: " + someMotorcycle.calculateFuelConsumption(200));

        Truck someTruck = new Truck();
        System.out.println("Fuel consumption for truck: " + someTruck.calculateFuelConsumption(200));

        Aircraft someAircraft = new Aircraft();
        System.out.println("Fuel consumption for aircraft: " + someAircraft.calculateFuelConsumption(200));
    }
}
