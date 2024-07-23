package Course1.time;

import java.time.LocalDate;
import java.time.temporal.ChronoField;

public class IsSupportedMain2 {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now();

        System.out.println(now.isSupported(ChronoField.SECOND_OF_MINUTE));

//        int i = now.get(ChronoField.SECOND_OF_MINUTE);
//
//        System.out.println(i);
    }
}
