package jqa.academy.homework1;

public class Task7 {
    public static void main(String[] args) {

        for (int x = 1; x <= 100; x++) {
            if (x > 53 && x < 74) {
                continue;
            }
            System.out.println(x);
        }
    }
}