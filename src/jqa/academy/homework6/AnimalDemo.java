package jqa.academy.homework6;

public class AnimalDemo {
    public static void main(String[] args) {

        Bird bird = new Bird("Owl",20);
        Cat cat = new Cat("Persian cat", 3);
        Dog dog = new Dog("Rottweiler",4);

        bird.play();
        bird.makeSomeNoise();
        bird.fly();
        bird.sing("Owl");
        System.out.println();

        cat.play();
        cat.makeSomeNoise();
        cat.climb();
        System.out.println();

        dog.play();
        dog.makeSomeNoise();
        dog.bringStick();

    }
}
