package Course1.time.test;

import java.time.LocalDate;

public class TestLoopPlus {
    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2024,01,01);

        for(int i = 0; i < 5; i++) {
            System.out.println(date);

            date = date.plusWeeks(2);
        }
    }
}
