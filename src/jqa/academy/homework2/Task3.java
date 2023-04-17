package jqa.academy.homework2;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double[] doubles = new double[5];

        for (int i = 0; i < 5; i++) {
            System.out.println("Enter number " + (i + 1) + ": ");
            doubles[i] = sc.nextDouble();
        }

        System.out.print("The numbers in the array are: ");
        for (int i = 0; i < 5; i++) {
            System.out.print(doubles[i]);
            if (i != 4) { //print ", " until the fourth number
                System.out.print(", ");
            }
        }
    }
}
