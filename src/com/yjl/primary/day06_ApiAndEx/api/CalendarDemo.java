package com.yjl.primary.day06_ApiAndEx.api;

import java.util.Calendar;
import java.util.Scanner;

/**
 * @author yujiale
 * @Classname CalendarDemo
 * @Description TODO
 * @Date 2021/8/22 下午10:11
 * @Created by yujiale
 */
public class CalendarDemo {
    public static void main(String[] args) {
        CalendarTest02();
    }

    /**
     * 获取对象getInstance();
     */
    static void CalendarTest01() {
        Calendar instance = Calendar.getInstance();
        System.out.println(instance);
        int year = instance.get(Calendar.YEAR);
        int month = instance.get(Calendar.MONTH) + 1;
        int day = instance.get(Calendar.DATE);
        System.out.println(year);
        System.out.println(month);
        System.out.println(day);

        instance.add(Calendar.YEAR, +4);
        int year1 = instance.get(Calendar.YEAR);
        int month1 = instance.get(Calendar.MONTH) + 1;
        int day1 = instance.get(Calendar.DATE);
        System.out.println(year1);
        System.out.println(month1);
        System.out.println(day1);

    }

    /**
     * 获取任意一年的二月有多少天
     */
    static void CalendarTest02() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入年份");
        int year = scanner.nextInt();
        Calendar instance = Calendar.getInstance();
        //设置这一年的为2月1号
        instance.set(year, 2, 1);
        instance.add(Calendar.DATE, -1);
        int date = instance.get(Calendar.DATE);
        System.out.println(year + "年的2月份有" + date + "天");
    }


}
