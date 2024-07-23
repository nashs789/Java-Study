package Course1.time;

import java.time.LocalDate;

public class LocalDateMain {
    public static void main(String[] args) {
        LocalDate nowDate = LocalDate.now();
        LocalDate ofDate = LocalDate.of(2021, 11, 21);

        System.out.println("nowDate = " + nowDate);
        System.out.println("ofDate = " + ofDate);
        System.out.println("ofDate = " + ofDate.plusDays(10));
    }
}
