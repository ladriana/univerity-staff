package ro.scoalainformala;

import ro.scoalainformala.staff.*;

public class Main {
    public static void main(String[] args) {
        Employee[] e = {
                new Manager("Ioan", 3000, "Secretary staff", 2015),
                new Teacher("George", 5000, "Math", 1998),
                new Administrator("Stan", 2500, "Cleaning", 2008)

        };
        for (Employee a : e) {
            System.out.println(" Working hours for the  univerity emplooyees are: " + a.getWorkingHours());
            System.out.println(" The  univerity emplooyees bonuses are: " + a.calculateBonus());

        }

        Employee x = new Manager("Ioan", 2750, "Secretary staff", 2021);
        System.out.println("Is emploee x equals with other? response: " + x.equals(e[0]));

        Payer p = new Manager("Ioan", 3000, "Secretary staff", 2015);
        p.pay(x);

        Lecturer[] lecturers = {
                new Manager("Ioan", 3000, "Secretary staff", 2015),
                new Teacher("George", 5000, "Math", 1998)
        };

        for (Lecturer l : lecturers) {
            l.teach();
        }

        Manager lec = new Manager("Ioan", 3000, "Secretary staff", 2015);
    }
}
