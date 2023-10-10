package ro.scoalainformala.staff;

public class Management extends Employees{

    private String position;
    public Management(String name, int salary, String position) {
        super(name, salary);
        this.position = position;
    }

    public String workingHours() {
        return "8:00-16:00";
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this){
            return true;
        }
        if(obj == null){
            return false;
        }
        if (obj instanceof Management){
            Management other = (Management)obj;
            return this.getName().equals(other.getName()) && this.getSalary() == other.getSalary() ;
        }
        return false;
    }
}
