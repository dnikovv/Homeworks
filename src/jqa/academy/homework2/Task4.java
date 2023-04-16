package jqa.academy.homework2;

public class Task4 {
    public static void main(String[] args) {
        int[] arr = {100, 2, 3, 6, 7, 9, 10, 11, 12, 13};
        withForLoop(arr);
        withWhileLoop(arr);
    }
    public static void withForLoop(int[] arr) {
        for (int i = 0; i <= arr.length - 1; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void withWhileLoop(int[] arr) {
        int i = 0;
        while (i <= arr.length - 1) {
            System.out.print(arr[i] + " ");
            i++;
        }
    }
}
