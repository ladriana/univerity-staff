package ro.scoalainformala.staff;

public class Teachers extends Employees{
    private String class1;
    public Teachers(String name, int salary, String class1) {
        super(name, salary);
        this.class1 = class1;
    }
    public String workingHours() {
        return "8:00-12:00";
    }
}
