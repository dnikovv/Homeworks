package jqa.academy.homework5;

public class Person {

    private String name;
    private int age;
    private boolean isMan;

    Person(String name, int age, boolean isMan){
        this.name = name;
        setAge(age);
        this.isMan = isMan;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age >= 0) {
            this.age = age;
        } else {
            System.out.println("Invalid age. Age cannot be negative.");
        }
    }


    public void showPersonInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Gender: " + (isMan ? "Male" : "Female"));
    }
}
