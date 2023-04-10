package jqa.academy.homework1;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean repeat = true;

        do {
            System.out.println("Please enter the first number");
            int firstNum = scanner.nextInt();
            System.out.println("Please enter the second number");
            int secondNum = scanner.nextInt();
            System.out.println("Please enter the third number");
            int thirdNum = scanner.nextInt();

            // Get the minimum and maximum values of the two numbers
            int lowerBound = Math.min(firstNum, secondNum);
            int upperBound = Math.max(firstNum, secondNum);

            if (thirdNum >= lowerBound && thirdNum <= upperBound) {
                System.out.println("The first number is " + firstNum + ", " + " the second number is " +
                        secondNum + " and " + thirdNum + " is in between");
            } else {
                System.out.println("The first number is " + firstNum + ", " + " the second number is " +
                        secondNum + " and " + thirdNum + " is NOT in between");
            }

            System.out.println("Do you want to try again? (y/n)");
            String response = scanner.next();
            if (!response.equalsIgnoreCase("y")) {
                repeat = false;
            }
        } while (repeat);

        scanner.close();

    }
}
