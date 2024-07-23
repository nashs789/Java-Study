package Course1.time;

import java.time.LocalDate;
import java.time.Period;

public class periodMain {
    public static void main(String[] args) {
        Period period = Period.ofDays(10);
        System.out.println("period = " + period);

        LocalDate localDate = LocalDate.of(2020, 1, 1);
        LocalDate plus = localDate.plus(period);

        System.out.println("plus = " + plus);

        LocalDate srtDate = LocalDate.of(2020, 1, 1);
        LocalDate endDate = LocalDate.of(2020, 3, 15);
        Period between = Period.between(srtDate, endDate);

        System.out.println("between = " + between.getMonths() + " " + between.getDays());
    }
}
