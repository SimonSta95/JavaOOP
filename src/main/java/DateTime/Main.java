package DateTime;

import java.time.Instant;
import java.time.LocalDate;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Main {
    public static void main(String[] args) {
        ZonedDateTime current = ZonedDateTime.now();
        ZonedDateTime twoWeeks = current.plusWeeks(2);

        System.out.println(current);
        System.out.println(twoWeeks);
        System.out.println(twoWeeks.isBefore(current));
        System.out.println(current.isBefore(twoWeeks));
        System.out.println(current.isAfter(twoWeeks));
        System.out.println(twoWeeks.isAfter(current));

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

        String date1 = "2023-07-15";
        String date2 = "2024-07-16";

        LocalDate startDate = LocalDate.parse(date1, formatter);
        LocalDate endDate = LocalDate.parse(date2, formatter);

        long daysBetween = ChronoUnit.DAYS.between(startDate, endDate);

        System.out.println("Difference in days: " + daysBetween);




    }
}
