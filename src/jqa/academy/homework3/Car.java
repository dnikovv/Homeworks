package jqa.academy.homework3;

public class Car {
    int year;
    double price;
    boolean isSportCar;
    int fuelTankCapacity;
    int freeFuel;
    String engineFuelOperationSystem;

    public Car(int year, double price, boolean isSportCar, int fuelTankCapacity, int freeFuel, String engineFuelOperationSystem) {
        this.year = year;
        this.price = price;
        this.isSportCar = isSportCar;
        this.fuelTankCapacity = fuelTankCapacity;
        this.freeFuel = freeFuel;
        this.engineFuelOperationSystem = engineFuelOperationSystem;
    }

    void changeЕngineFuelOperationSystem(String newЕngineFuelOperationSystem) {
        engineFuelOperationSystem = newЕngineFuelOperationSystem;
    }

    void useFuel(int fuel) {
        if (fuel > freeFuel) {
            System.out.println("Not enough Fuel");
        } else {
            freeFuel -= fuel;
        }
    }

    @Override
    public String toString() {
        return "Year: " + year + "\nPrice: " + price + "\nIs sport car: " + isSportCar
                + "\nFuel tank capacity: " + fuelTankCapacity + "\nFree fuel: " + freeFuel
                + "\nEngine fuel operation system: " + engineFuelOperationSystem;
    }

}
