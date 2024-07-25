package Course1.time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class FormattingMain2 {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String formattedDate = now.format(formatter);
        System.out.println(formattedDate);

        String dateTimeString = "2024-07-25 23:44:10";
        LocalDateTime parse = LocalDateTime.parse(dateTimeString, formatter);

        System.out.println(parse);
    }
}
