package org.example.Lesson8;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Lesson8_2 {
    public static void main(String[] args) {
//        Math math = new Math();
//        int sum = math.add(10, 5);
//
//        Math math1 = new Math();
//        int sum1 = math1.add(10, 5);

        int sum1 = Math.add(10, 5);

//        System.out.println(sum);
        System.out.println(sum1);
        System.out.println(Math.pi);

        System.out.println(java.lang.Math.abs(-100));

        LocalDate dateNow = LocalDate.now();
        System.out.println(dateNow);

        LocalDate date = LocalDate.of(2025, 3, 1);
        System.out.println(date);

        LocalDate dateParsed = LocalDate.parse("2020-05-05");
        System.out.println(dateParsed);

        dateParsed = dateParsed.plusDays(40);
        System.out.println(dateParsed);
        System.out.println(dateParsed.minusDays(5));
        System.out.println(dateParsed.getDayOfWeek());

        LocalTime time = LocalTime.now();
        System.out.println(time);

        LocalTime timeParsed = LocalTime.parse("09:25:07");
        System.out.println(timeParsed);

        timeParsed = timeParsed.minusMinutes(35);
        System.out.println(timeParsed);

        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println(dateTime);

        LocalDateTime dateTimeOf = LocalDateTime.of(2022, 10, 2, 12, 10);
        System.out.println(dateTimeOf);

        LocalDateTime dateTimeParsed = LocalDateTime.of(dateParsed, timeParsed);
        System.out.println(dateTimeParsed);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yy");
        String dateString = formatter.format(dateTimeParsed);
        System.out.println(dateString);

    }
}
