package jqa.academy.homework2;

import java.util.Arrays;

public class Task5 {
    public static void main(String[] args) {
        int[] arr1 = {10,12,1,8,4};
        int[] arr2 = new int[arr1.length];

        for(int i = 0; i < arr1.length; i++){
            arr2[i] = arr1[i];
        }
        for(int j = 0; j <arr2.length; j++){
            System.out.print(arr2[j] + " ");
        }
        //or using ToString
        System.out.println(Arrays.toString(arr2));
    }
}
