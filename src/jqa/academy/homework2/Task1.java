package jqa.academy.homework2;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number");
        int num1 = sc.nextInt();

        System.out.println("Enter second number");
        int num2 = sc.nextInt();

        System.out.println("The addition of the two numbers is " + addition(num1, num2));
        System.out.println("The mean of the two numbers is " + numbersMean(num1, num2));

    }

    public static int addition(int num1, int num2) {
        int result = num1 + num2;
        return result;
    }

    //Task2
    public static int numbersMean(int num1, int num2) {
        int mean = (num1 + num2)/2;
        return mean;
    }
}
