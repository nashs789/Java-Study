package Course1.time;

import java.time.LocalDateTime;
import java.time.temporal.ChronoField;

public class GetTimeMain {
    public static void main(String[] args) {
        LocalDateTime ldt = LocalDateTime.now();

        System.out.println("ldt.get(ChronoField.YEAR) = " + ldt.get(ChronoField.YEAR) + " " + ldt.getYear());
        System.out.println("ldt.get(ChronoField.MONTH_OF_YEAR) = " + ldt.get(ChronoField.MONTH_OF_YEAR) + " " + ldt.getMonthValue());
        System.out.println("ldt.get(ChronoField.DAY_OF_MONTH) = " + ldt.get(ChronoField.DAY_OF_MONTH) + " " + ldt.getDayOfMonth());
        System.out.println("ldt.get(ChronoField.HOUR_OF_DAY) = " + ldt.get(ChronoField.HOUR_OF_DAY) + " " + ldt.getHour());
        System.out.println("ldt.get(ChronoField.MINUTE_OF_HOUR) = " + ldt.get(ChronoField.MINUTE_OF_HOUR) + " " + ldt.getMinute());
        System.out.println("ldt.get(ChronoField.SECOND_OF_MINUTE) = " + ldt.get(ChronoField.SECOND_OF_MINUTE) + " " + ldt.getSecond());
    }
}
