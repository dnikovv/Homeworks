package jqa.academy.homework5;

public class Student extends Person{

    private double score;

    Student(String name, int age, boolean isMan,double score) {
        super(name, age, isMan);
        this.score = score;
        if(score < 2 || score > 6){
            System.out.println("Invalid number");
        }
    }

    public void showStudentInfo() {
        super.showPersonInfo();
        System.out.println("Score: " + score + "\n----------------");
    }

}
