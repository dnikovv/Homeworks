package jqa.academy.homework6;

public abstract class Animal implements IAnimal {
    private String breedType;
    private int age;

    public Animal(String breedType, int age) {
        this.breedType = breedType;
        this.age = age;
    }

    public String getBreedType() {
        return breedType;
    }

    public void setBreedType(String breedType) {
        this.breedType = breedType;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public abstract void play();

}
