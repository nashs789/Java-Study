package Course1.time;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class FormattingMain1 {
    public static void main(String[] args) {
        // 포맷팅: 날짜 -> 문자
        LocalDate date = LocalDate.of(2024,12,31);

        System.out.println(date);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy년 MM월 dd일");

        String format = date.format(formatter);

        System.out.println(format);
        String inp = "2030년 01월 01일";
        LocalDate parse = LocalDate.parse(inp, formatter);

        System.out.println(parse);
    }
}
