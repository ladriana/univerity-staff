package ro.scoalainformala.staff;

public abstract class Employees {
    private String name;
    private int salary;

    public Employees(String name,int salary) {
        this.name = name;
        this.salary = salary;
    }
    public String getName() {
        return name;
    }
    public int getSalary() {
        return salary;
    }

    public abstract String workingHours();
}
