package Course1.time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class LocalDateTimeMain {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        LocalDateTime ofDate = LocalDateTime.of(2021, 1, 1, 12, 0, 0);

        System.out.println("now = " + now);
        System.out.println("ofDate = " + ofDate);

        LocalDate localDate = ofDate.toLocalDate();
        LocalTime localTime = ofDate.toLocalTime();

        System.out.println("localDate = " + localDate);
        System.out.println("localTime = " + localTime);

        LocalDateTime localDateTime = LocalDateTime.of(localDate, localTime);

        System.out.println("localDateTime = " + localDateTime);

        System.out.println(ofDate.isBefore(now));
        System.out.println(ofDate.isAfter(now));
        System.out.println(ofDate.isEqual(now));
    }
}
