package Course1.time;

import java.time.LocalDateTime;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class ChangeTimePlusMain {
    public static void main(String[] args) {
        // ChronoUnit

        LocalDateTime localDateTime = LocalDateTime.of(2018, 1, 1, 13, 30, 59);
        System.out.println("localDateTime = " + localDateTime);

        LocalDateTime plus1 = localDateTime.plus(10, ChronoUnit.YEARS);
        LocalDateTime plus2 = localDateTime.plusYears(10);

        System.out.println("plus1 = " + plus1);
        System.out.println("plus2 = " + plus2);

        Period period = Period.ofYears(10);
        LocalDateTime plus3 = localDateTime.plus(period);

        System.out.println("plus3 = " + plus3);
    }
}
