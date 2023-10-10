package ro.scoalainformala.staff;

public class Administrative extends Employees {
    private String feald;
    public Administrative(String name, int salary, String feald) {
        super(name, salary);
        this.feald = feald;
    }
    public String workingHours() {
        return "8:00-10:00";
    }
}
