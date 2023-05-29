package jqa.academy.homework5;

public class Employee extends Person {
    private double daySalary;

    public Employee(String name, int age, boolean isMan, double daySalary) {
        super(name, age, isMan);
        this.daySalary = daySalary;
    }
    public double calculateOvertime(double hours) {
        if (getAge() < 18) {
            return 0.0;
        } else {
            double hourlyRate = daySalary / 8;
            double overtimeRate = hourlyRate * 1.5;
            return hours * overtimeRate;
        }
    }
    public void showEmployeeInfo() {
        super.showPersonInfo();
        System.out.println("Day Salary: $" + daySalary + " \n----------------");
    }
}
