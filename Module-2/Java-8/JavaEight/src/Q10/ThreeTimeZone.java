package Q10;

import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ThreeTimeZone {

    static void main(String[] args) {
        ZonedDateTime india =ZonedDateTime.now(ZoneId.of("Asia/Kolkata"));
        ZonedDateTime us =ZonedDateTime.now(ZoneId.of("America/New_York"));
        ZonedDateTime australia =ZonedDateTime.now(ZoneId.of("Australia/Sydney"));

        System.out.println("Date and time for India ");
        System.out.println(india);
        System.out.println();
        System.out.println("Date and time for USA");
        System.out.println(us);
        System.out.println();
        System.out.println("Date and time for Australia");
        System.out.println(australia);




    }
}
