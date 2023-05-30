package jqa.academy.homework6;

public class Cat extends Animal{

    public Cat(String breedType, int age) {
        super(breedType, age);
    }

    public void climb(){
        System.out.println("The cat is climbing");
    }

    @Override
    public void play() {
        System.out.println("The cat is playing with the ball");
    }

    @Override
    public void makeSomeNoise() {
        System.out.println("The cat is doing meow");
    }
}
