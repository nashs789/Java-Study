package Course1.time;

import java.time.LocalTime;

public class LocalTimeMain {
    public static void main(String[] args) {
        LocalTime localTime = LocalTime.now();
        LocalTime ofTime = LocalTime.of(12, 1, 1);

        System.out.println("localTime = " + localTime);
        System.out.println("ofTime = " + ofTime);
        System.out.println("ofTime = " + ofTime.plusHours(3));
    }
}
