package jqa.academy.homework4;

public class ComputerPrices {

    public static void main(String[] args) {

        Computer comp1 = new Computer(2001,900.50,"Windows");
        Computer comp2 = new Computer(2008,900.50,"MacOS");

        int result = comp1.comparePrice(comp2);
        System.out.println("Comparison result:" + " " + result);
    }

}
