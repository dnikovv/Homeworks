package jqa.academy.homework4;

public class Computer {
    int year;
    double price;
    String operationSystem;

    Computer(int year, double price, String operationSystem) {
        this.year = year;
        this.price = price;
        this.operationSystem = operationSystem;
    }

    public double getPrice() {
        return price;
    }

    public double setPrice(double price) {
        this.price = price;
        return price;
    }

    int comparePrice(Computer compare) {
        if (this.price > compare.price) {
            return -1;
        } else if (this.price < compare.price) {
            return 1;
        } else {
            return 0;
        }
    }
}
