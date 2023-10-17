package ro.scoalainformala.staff;

public abstract class Employee {
    private String name;
    private int salary;
    private int employmentYear;
    private String workingHours;
    private double account;

    public Employee(String name, int salary, int employmentYear, String workingHours) {
        this.name = name;
        this.salary = salary;
        this.employmentYear = employmentYear;
        this.workingHours = workingHours;
    }

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }

    public int getEmploymentYear() {
        return employmentYear;
    }

    public String getWorkingHours() {
        return workingHours;
    }

    public double getAccount() {
        return account;
    }

    public void setAccount(double account) {
        this.account = account;
    }

    public abstract double calculateBonus();
}
