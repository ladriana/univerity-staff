package ro.scoalainformala.staff;

import java.time.LocalDate;

public class Administrator extends Employee implements Payer {
    private String field;

    public Administrator(String name, int salary, String field, int year) {
        super(name, salary, year, "7:00-15:00");
        this.field = field;
    }

    public String getField() {
        return field;
    }

    @Override
    public double calculateBonus() {
        return LocalDate.now().getYear() - getEmploymentYear() <= 5 ? getSalary() * 0.1 : getSalary() * 0.2;
    }

    @Override
    public void pay(Employee e) {
        e.setAccount(e.getAccount() + e.getSalary());
    }
}
