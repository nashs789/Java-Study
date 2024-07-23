package Course1.time;

import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class ChronoMain {
    public static void main(String[] args) {
        ChronoUnit[] values = ChronoUnit.values();

        for(ChronoUnit value : values) {
            System.out.println(value);
        }

        System.out.println("ChronoUnit.HOURS = " + ChronoUnit.HOURS);
        System.out.println("HOUR " + ChronoUnit.HOURS.getDuration().getSeconds());

        LocalTime lt1 = LocalTime.of(1, 10, 0);
        LocalTime lt2 = LocalTime.of(1, 20, 0);

        long between = ChronoUnit.SECONDS.between(lt1, lt2);
        System.out.println(between);

        long between1 = ChronoUnit.MINUTES.between(lt1, lt2);
        System.out.println("between1 = " + between1);
    }
}
