package Course1.time;

import java.time.Duration;
import java.time.LocalTime;

public class DurationMain {
    public static void main(String[] args) {
        Duration duration = Duration.ofMinutes(30);
        System.out.println("duration = " + duration);

        LocalTime localTime = LocalTime.of(1, 0);
        System.out.println(localTime);

        LocalTime plus = localTime.plus(duration);
        System.out.println("plus = " + plus);

        LocalTime srt = LocalTime.of(0, 0);
        LocalTime end = LocalTime.of(10, 30);
        Duration between = Duration.between(srt, end);

        System.out.println(between.getSeconds());
        System.out.println(between.toHours());
        System.out.println(between.toMinutes());
        System.out.println(between.toMinutesPart());
        System.out.println(between.toSeconds());
    }
}
