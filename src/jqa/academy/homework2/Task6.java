package jqa.academy.homework2;

import java.util.Arrays;

public class Task6 {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4};
        int[] arr2 = {1, 2, 3, 4};

        if (Arrays.equals(arr1, arr2)) {
            System.out.println("The two arrays are equal");
        } else {
            System.out.println("The two arrays are NOT equal");
        }
    }
}
