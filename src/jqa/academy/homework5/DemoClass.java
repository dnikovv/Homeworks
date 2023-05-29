package jqa.academy.homework5;

import java.util.ArrayList;

public class DemoClass {
    public static void main(String[] args) {

        ArrayList<Person> people = new ArrayList();

        people.add(0, new Person("Peter", 10, true));
        people.add(1, new Person("Mimi", 19, false));
        people.add(2, new Person("Beti", 51, false));
        people.add(3, new Person("Ivan", 21, true));
        people.add(4, new Person("Ivi", 32, false));
        people.add(5, new Person("Petko", 41, true));
        people.add(6, new Person("Maria", 21, false));
        people.add(7, new Person("Gosho", 28, true));
        people.add(8, new Person("Gabi", 14, false));
        people.add(9, new Person("Stoqn", 30, true));

        Person person1 = new Person("Name1", 24, true);
        Person person2 = new Person("Name2", 31, false);

        Student student1 = new Student("StudentName", 15, true, 6.0);
        Student student2 = new Student("StudentName2", 13, false, 4.5);

        Employee employee1 = new Employee("Employee1", 33, true, 200);
        Employee employee2 = new Employee("Employee2", 23, true, 100);

        people.add(10, person1);
        people.add(11, person2);
        people.add(12, student1);
        people.add(13, student2);
        people.add(14, employee1);
        people.add(15, employee2);

        for (Person person : people) {
            if (person instanceof Student) {
                ((Student) person).showStudentInfo();
            } else if (person instanceof Employee) {
                ((Employee) person).showEmployeeInfo();
            } else {
                person.showPersonInfo();
            }
        }
        for (Person person : people) {
            if (person instanceof Employee) {
                Employee employee = (Employee) person;
                double overtimeAmount = employee.calculateOvertime(2.0);
                System.out.println(employee.getName() + " is owed " + overtimeAmount + " for 2 hours overtime");
            }
        }
    }
}
