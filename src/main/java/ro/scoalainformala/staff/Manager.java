package ro.scoalainformala.staff;

import java.time.LocalDate;
import java.util.Objects;

public class Manager extends Employee implements Payer, Lecturer {

    private String position;


    public Manager(String name, int salary, String position, int year) {
        super(name, salary, year, "9:00-12:00");
        this.position = position;
    }

    @Override
    public double calculateBonus() {
        if (LocalDate.now().getYear() - getEmploymentYear() <= 3) {
            return getSalary() * 0.05;
        } else {
            return getSalary() * 0.15;
        }
    }

    @Override
    public void pay(Employee e) {
        e.setAccount(e.getAccount() + e.calculateBonus());
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (obj instanceof Manager) {
            Manager other = (Manager) obj;
            return this.getName().equals(other.getName()) && this.getSalary() == other.getSalary();
        }
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getEmploymentYear());
    }

    @Override
    public void teach() {
        System.out.println("I'm teaching something useful.");
    }

    @Override
    public String test(LocalDate date) {
        return "Subjects";
    }
}
