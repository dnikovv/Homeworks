package jqa.academy.homework1;

import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter an integer number");
        int firstNum = scanner.nextInt();

        System.out.println("Please enter a double number");
        double secondNum = scanner.nextDouble();

        System.out.println("Please enter int number");
        int thirdNum = scanner.nextInt();

        System.out.println("Please enter a double number");
        double fourthNum = scanner.nextDouble();

        String result = swapIntAndDouble(firstNum, secondNum, thirdNum, fourthNum);
        System.out.println(result);
    }

    //Create separate method for swapping the numbers
    public static String swapIntAndDouble(int firstNum, double secondNum, int thirdNum, double fourthNum) {
        int tempIntNum = firstNum;
        firstNum = (int) secondNum;
        secondNum = tempIntNum;

        int secondTempIntNum = thirdNum;
        thirdNum = (int) fourthNum;
        fourthNum = secondTempIntNum;

        return "The new values are " + firstNum + ", " + secondNum + ", " + thirdNum + ", " + fourthNum;
    }
}
