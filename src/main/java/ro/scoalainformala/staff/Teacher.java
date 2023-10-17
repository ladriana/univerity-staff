package ro.scoalainformala.staff;

import java.time.LocalDate;

public class Teacher extends Employee implements Lecturer {
    private String class1;

    public Teacher(String name, int salary, String class1, int year) {
        super(name, salary, year, "8:00-16:00");
        this.class1 = class1;
    }

    public String getClass1() {
        return class1;
    }

    @Override
    public double calculateBonus() {
       return getSalary() * 0.1;
    }

    @Override
    public void teach() {
        // TODO Implement it better.
        System.out.println("I'm teaching Java.");
    }

    @Override
    public String test(LocalDate date) {
        // TODO Implement me.
        return "Exam subjects from teacher.";
    }
}
