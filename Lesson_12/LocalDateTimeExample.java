import java.time.*;
import java.time.temporal.TemporalAmount;

import static java.lang.System.out;
import static  java.time.Month.*;
import static java.time.temporal.ChronoUnit.DAYS;
import static java.time.temporal.ChronoUnit.MINUTES;


public class LocalDateTimeExample {
    public static void main(String[] args) throws InterruptedException {

//        LocalDateTime meeting, flight, courseStart, courseEnd;
//        meeting = LocalDateTime.of(2014, MARCH, 21, 13, 30);
//        out.println("Meeting is on: " + meeting);
//        LocalDate flightDate = LocalDate.of(2014, MARCH, 31);
//        LocalTime flightTime = LocalTime.of(21, 45);
//        flight = LocalDateTime.of(flightDate, flightTime);
//        out.println("Flight leaves: " + flight);
//        courseStart = LocalDateTime.of(2014, MARCH, 24, 9, 00);
//        courseEnd = courseStart.plusDays(4).plusHours(8);
//        out.println("Course starts: " + courseStart);
//        out.println("Course ends: " + courseEnd);
//        long courseHrs = (courseEnd.getHour() - courseStart.getHour()) *
//                (courseStart.until(courseEnd, DAYS) + 1);
//        out.println("Course is: " + courseHrs + " hours long.");


//        Time Zones
//        ZoneId USEast = ZoneId.of("America/New_York");
//        LocalDate date = LocalDate.of(2014, MARCH, 23);
//        LocalTime time = LocalTime.of(9, 30);
//        LocalDateTime dateTime = LocalDateTime.of(date, time);
//        ZonedDateTime heycourseStart = ZonedDateTime.of(date, time, USEast);
//        ZonedDateTime hereNow = ZonedDateTime.now(USEast).truncatedTo(MINUTES);
//        out.println("Here now: " + hereNow);
//        String courseStart = "";
//        out.println("Course start: " + heycourseStart);
//        ZonedDateTime newCourseStart = heycourseStart.plusDays(2).minusMinutes(30);
//        out.println("New Course Start: " + newCourseStart);

//        instant
//        Instant now = Instant.now();
//        Thread.sleep(0,1); // long milliseconds, int nanoseconds
//        Instant later = Instant.now();
//        out.println("now is before later? " + now.isBefore(later));
//        out.println("Now: " + now);
//        out.println("Later: " + later);

//        period
//        Period oneDay = Period.ofDays(1);
//        out.println("Period of one day: " + oneDay);
//        LocalDateTime beforeDST = LocalDateTime.of(2014, MARCH, 8, 12, 00);
//        ZonedDateTime newYorkTime =
//                ZonedDateTime.of(beforeDST, ZoneId.of("America/New_York"));
//        out.println("Before: " + newYorkTime);
//        TemporalAmount oneDayYear = null;
//        out.println("After: " + newYorkTime.plus(oneDayYear));

//        Duration
//        Duration one24hourDay = Duration.ofDays(1);
//        System.out.println("Duration of one day: " + one24hourDay);
//        beforeDST = LocalDateTime.of(2014, MARCH, 8, 12, 00);
//        newYorkTime = ZonedDateTime.of(beforeDST, ZoneId.of("America/New_York"));
//        System.out.println("Before: " + newYorkTime);
//        System.out.println("After: " + newYorkTime.plus(one24hourDay));

//        Calculating between days
//        LocalDate christmas = LocalDate.of(2014, DECEMBER, 25);
//        LocalDate today = LocalDate.now();
//        long days = DAYS.between(today, christmas);
//        System.out.println("There are " + days + " shopping days til Christmas");


    }
}
