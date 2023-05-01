package jqa.academy.Homework3;

public class CarPerson {

    public static void main(String[] args) {

        Car car1 = new Car(2022, 25000.200, false, 50, 50, "Multi-Point Fuel Injection");
        Car car2 = new Car(2021, 50000.900, true, 60, 20, "Direct Injection");

        car1.useFuel(35);
        car2.changeЕngineFuelOperationSystem("Some Other Injection");

        System.out.println(car1.toString());
        System.out.println(car2.toString());
    }
}
