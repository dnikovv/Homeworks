package jqa.academy.homework6;

public class Dog extends Animal{

    public Dog(String breedType, int age) {
        super(breedType, age);
    }

    public void bringStick(){
        System.out.println("The dog is bringing the stick");
    }

    @Override
    public void play() {
        System.out.println("The dog is playing with the kid");

    }

    @Override
    public void makeSomeNoise() {
        System.out.println("The dog is barking");
    }
}
