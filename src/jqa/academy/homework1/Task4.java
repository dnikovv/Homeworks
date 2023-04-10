package jqa.academy.homework1;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter amount");
        double moneyAmount = scanner.nextDouble();

        System.out.println("Is it working day? Please enter true or false");
        boolean isWorkingDay = scanner.nextBoolean();

        if (isWorkingDay) {
            System.out.println("I will go to work");
        } else if (!isWorkingDay && moneyAmount > 10) {
            System.out.println("I will go to the cinema");
        } else if (!isWorkingDay && moneyAmount < 4) {
            System.out.println("Will stay at home watching TV");
        } else if (!isWorkingDay && moneyAmount < 10) {
            System.out.println("Will go for ice cream");
        }
    }
}
