package Course1.time.test;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class TestBetween {
    public static void main(String[] args) {
        LocalDate srtDate = LocalDate.of(2024, 1, 1);
        LocalDate endDate = LocalDate.of(2024, 11, 21);

        Period between = Period.between(srtDate, endDate);

        System.out.println(between.getYears());

        long days = ChronoUnit.DAYS.between(srtDate, endDate);
        System.out.println(days);
    }
}
