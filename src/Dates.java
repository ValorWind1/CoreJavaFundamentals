import java.time.*;
import java.util.Date;

public class Dates {
    public static void main(String[] args) {

        // GLOBAL
        Date date = new Date();
        System.out.println("Date: "+ date);

        LocalDateTime localTime = LocalDateTime.now();
        System.out.println("\nLocal: " +localTime );

        LocalDate localDate = LocalDate.now();
        System.out.println("\nLocal Date: " + localDate);

        // Covert from local time to local date
        localDate = localTime.toLocalDate();

        Month month = localDate.getMonth();

        System.out.println("Current month; "+month);

       int day = localTime.getDayOfMonth();
        System.out.println("Day of Month: "+day);

        int seconds = localTime.getSecond();
        System.out.println("Seconds: "+seconds);

        LocalDate day2 = LocalDate.of(1999,7,23);
        System.out.println(day2);

        LocalDateTime day3 = localTime.withDayOfMonth(10).withYear(2003).withMonth(2).withHour(12);
        System.out.println(day3);


        LocalTime time = LocalTime.of(5,30);
        System.out.println(time);


        // ZONED

        ZonedDateTime zDate = ZonedDateTime.parse("2019-04-01T16:24:11.552+05:30[Asia/Calcutta]");

        System.out.println("zone date : " + zDate);

        // convert between time zones
        ZoneId id = ZoneId.of("Europe/Paris");
        System.out.println("ID for paris : "+ id);

        ZonedDateTime parisTime = zDate.toInstant().atZone(id);
        System.out.println("time in Paris: "+parisTime);

        // add days to the time
        ZonedDateTime zDate2 = zDate.plus(Period.ofDays(10));
        System.out.println("10 Days later : " + zDate2);

        //Get your time zone
        ZoneId currentTimeZone = ZoneId.systemDefault();
        System.out.println("your time zone : "+ currentTimeZone);
    }
}
