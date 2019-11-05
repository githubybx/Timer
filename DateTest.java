package com.example.demo;

import sun.util.resources.LocaleData;

import java.time.LocalDateTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;

public class DateTest {
    public static void main(String[] args) {
        //获取当前时间
        LocalDateTime now = LocalDateTime.now();
        LocalDateTime of = LocalDateTime.of(2019, Month.OCTOBER,20,22,48);
        System.out.println(of + " " + now);
        System.out.println(of.format(DateTimeFormatter.ofPattern("yyyy_MM_dd HH:mm:SS")));
        LocalDateTime with = of.with(TemporalAdjusters.lastDayOfMonth());
        String format = with.format(DateTimeFormatter.ofPattern("yyyy_MM_dd HH:mm:ss"));
        System.out.println(format);
        boolean leapYear = with.toLocalDate().isLeapYear();
        System.out.println(leapYear);
        LocalDateTime localDateTime = with.minusDays(32);
        System.out.println(localDateTime);
        System.out.println(localDateTime.format(DateTimeFormatter.ofPattern("yyyy_MM_dd")));
        LocalDateTime now1 = LocalDateTime.now();
        LocalDateTime with1 = now1.with(TemporalAdjusters.lastDayOfMonth());
        System.out.println(with1);
    }
}
