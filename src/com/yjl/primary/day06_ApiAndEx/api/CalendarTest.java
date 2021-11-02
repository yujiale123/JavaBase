package com.yjl.primary.day06_ApiAndEx.api;

import java.time.DayOfWeek;
import java.time.LocalDate;

/**
 * 根据localDate类写当前月的日历
 * 逻辑
 */
public class CalendarTest {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        int month = date.getMonthValue();
        int today = date.getDayOfMonth();
        date = date.minusDays(today - 1);
        DayOfWeek weekDay = date.getDayOfWeek();
        int value = weekDay.getValue();

        System.out.print("Mon Tue Web Thu Fri Sat Sun");
        for (int i = 1; i < value; i++) {
            System.out.print("   ");
            while (date.getMonthValue() == month) {
                System.out.print(date.getDayOfMonth());
                if (date.getDayOfMonth() == today) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
                date = date.plusDays(1);
                if (date.getDayOfWeek().getValue() == 1) {
                    System.out.println();
                } else {
                    System.out.println();
                }

            }
        }

    }
}

