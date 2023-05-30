package jqa.academy.homework6;

public class Bird extends Animal{

    public Bird(String breedType, int age){
        super(breedType, age);
    }

    public void fly(){
        System.out.println("The bird is flying");
    }

    public void sing(String bird){
        System.out.println("The bird is singing loud");
    }

    public void sing(String bird, String bird2){
        System.out.println("The birds are singing louder");
    }

    @Override
    public void play() {
        System.out.println("Birds are chasing each other, doing loops, dive and perform intricate maneuvers for fun");
    }

    @Override
    public void makeSomeNoise() {
        System.out.println("Bird calls are short, simple vocalizations used for communication within a species");
    }
}
