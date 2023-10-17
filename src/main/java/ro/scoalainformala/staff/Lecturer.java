package ro.scoalainformala.staff;

import java.time.LocalDate;

public interface Lecturer {

    void teach();

    /**
     *
     * @param date Exam date.
     * @return The test subjects.
     */
    String test(LocalDate date);
}
