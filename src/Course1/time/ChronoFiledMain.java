package Course1.time;

import java.time.temporal.ChronoField;

public class ChronoFiledMain {
    public static void main(String[] args) {
        ChronoField[] values = ChronoField.values();

        for(ChronoField value : values) {
            System.out.println("value = " + value + " " + value.range());
        }

        System.out.println(ChronoField.MONTH_OF_YEAR.range());
        System.out.println(ChronoField.DAY_OF_MONTH.range());
    }
}
