package main.java;

import java.util.*;
import java.time.*;
import java.text.*;

import main.java.MeetupSchedule;

public class Meetup {

    int month, year;

    public Meetup(int month, int year) {
        this.month = month;
        this.year = year;
    }

    public LocalDate day(DayOfWeek day, MeetupSchedule scheduleInfo) {

        LocalDate expected = LocalDate.of(year, month, 1);
        ;

        try {
            YearMonth yearMonthObject = YearMonth.of(year, month);
            int daysInMonth = yearMonthObject.lengthOfMonth();
            int count = 1;

            switch (scheduleInfo) {
            case FIRST:
                for (int i = 1; i <= daysInMonth; i++) {

                    String input_date = String.format("%d/%d/%d", i, month, year);
                    SimpleDateFormat format1 = new SimpleDateFormat("dd/MM/yyyy");
                    Date dt1 = format1.parse(input_date);
                    DateFormat format2 = new SimpleDateFormat("EEEE");
                    String finalDay = format2.format(dt1);

                    if (finalDay.equalsIgnoreCase(day.name())) {
                        expected = LocalDate.of(year, month, i);

                        return expected;
                    }
                }
                break;
            case SECOND:
                count = 1;
                for (int i = 1; i <= daysInMonth; i++) {

                    String input_date = String.format("%d/%d/%d", i, month, year);
                    SimpleDateFormat format1 = new SimpleDateFormat("dd/MM/yyyy");
                    Date dt1 = format1.parse(input_date);
                    DateFormat format2 = new SimpleDateFormat("EEEE");
                    String finalDay = format2.format(dt1);

                    if (finalDay.equalsIgnoreCase(day.name())) {
                        if (count == 2) {
                            expected = LocalDate.of(year, month, i);

                            return expected;
                        } else {
                            count++;
                        }
                    }
                }
                break;

            case THIRD:

                count = 1;
                for (int i = 1; i <= daysInMonth; i++) {

                    String input_date = String.format("%d/%d/%d", i, month, year);
                    SimpleDateFormat format1 = new SimpleDateFormat("dd/MM/yyyy");
                    Date dt1 = format1.parse(input_date);
                    DateFormat format2 = new SimpleDateFormat("EEEE");
                    String finalDay = format2.format(dt1);

                    if (finalDay.equalsIgnoreCase(day.name())) {
                        if (count == 3) {
                            expected = LocalDate.of(year, month, i);

                            return expected;
                        } else {
                            count++;
                        }
                    }
                }
                break;

            case FOURTH:
                count = 1;
                for (int i = 1; i <= daysInMonth; i++) {

                    String input_date = String.format("%d/%d/%d", i, month, year);
                    SimpleDateFormat format1 = new SimpleDateFormat("dd/MM/yyyy");
                    Date dt1 = format1.parse(input_date);
                    DateFormat format2 = new SimpleDateFormat("EEEE");
                    String finalDay = format2.format(dt1);

                    if (finalDay.equalsIgnoreCase(day.name())) {
                        if (count == 4) {
                            expected = LocalDate.of(year, month, i);

                            return expected;
                        } else {
                            count++;
                        }
                    }
                }
                break;

            case LAST:
                for (int i = daysInMonth; i >= 1; i--) {

                    String input_date = String.format("%d/%d/%d", i, month, year);
                    SimpleDateFormat format1 = new SimpleDateFormat("dd/MM/yyyy");
                    Date dt1 = format1.parse(input_date);
                    DateFormat format2 = new SimpleDateFormat("EEEE");
                    String finalDay = format2.format(dt1);

                    if (finalDay.equalsIgnoreCase(day.name())) {
                        expected = LocalDate.of(year, month, i);

                        return expected;
                    }
                }
                break;

            case TEENTH:
                for (int i = 13; i <= 19; i++) {

                    String input_date = String.format("%d/%d/%d", i, month, year);
                    SimpleDateFormat format1 = new SimpleDateFormat("dd/MM/yyyy");
                    Date dt1 = format1.parse(input_date);
                    DateFormat format2 = new SimpleDateFormat("EEEE");
                    String finalDay = format2.format(dt1);

                    if (finalDay.equalsIgnoreCase(day.name())) {
                        expected = LocalDate.of(year, month, i);

                        return expected;
                    }
                }
                break;
            }

        } catch (Exception e) {

        }

        return expected;
    }
}