package ro.scoalainformala;
import ro.scoalainformala.staff.*;

public class Main{
    public static void main(String[] args) {
        Employees[] e = {
                new Management("Ioan", 3000, "Secretary staff"),
                new Teachers("George", 5000, "Math"),
                new Administrative("Stan", 2500, "Cleaning")

        };
        for(Employees a : e) {
            System.out.println(" Working hours for the  univerity emplooyees are: " + a.workingHours());
        }

        Employees x = new Management("Ioan", 2750, "Secretary staff");
        System.out.println("Is emploee x equals with other? response: " + x.equals(e[0]));
    }
}
