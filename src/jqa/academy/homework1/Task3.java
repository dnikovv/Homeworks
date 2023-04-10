package jqa.academy.homework1;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the first number");
        int firstNum = scanner.nextInt();

        System.out.println("Please enter the second number");
        int secondNum = scanner.nextInt();

        System.out.println("Please enter the third number");
        int thirdNum = scanner.nextInt();

        System.out.println("The numbers are: " + firstNum + " " + secondNum + " " + thirdNum);

        int oldValueOfFirstNum = firstNum;
        firstNum = secondNum;
        secondNum = thirdNum;
        thirdNum = oldValueOfFirstNum;

        System.out.println("The new values of the numbers are: " + firstNum + " " + secondNum + " " + thirdNum);
        System.out.println("The sum of the first two numbers minus the third one is: " + ((firstNum + secondNum) - thirdNum));
    }
}
