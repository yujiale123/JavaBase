package com.yjl.primary.day06_ApiAndEx.api;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author yujiale
 * @Classname DateDemo
 * @Description TODO
 * @Date 2021/8/22 下午9:46
 * @Created by yujiale
 */
public class DateDemo {
    public static void main(String[] args) throws ParseException {
        DateTest02();
    }

    static void DateTest01() throws ParseException {
        Date date = new Date();
        System.out.println(date);
        long time = date.getTime();
        System.out.println(time);
        //从date到String 格式化日期
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String format = simpleDateFormat.format(date);
        System.out.println(format);
        //从String转换为date
        String stringDate = "2021-08-22 21:53:40";
        SimpleDateFormat simpleDateFormat1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date parse = simpleDateFormat1.parse(stringDate);
        System.out.println(parse);
    }

    /**
     * 定义一个日期工具类，包含两个方法，把日期转换为指定格式的字符串，把字符解析成指定格式的日期
     */
    static void DateTest02() {
        Date date = new Date();
        String date1 = DateTestUtils02(date, "yyyy-MM-dd HH:mm:ss");
        System.out.println(date1);
        Date date2 = DateTestUtils01(date1, "yyyy-MM-dds");
        System.out.println(date2);
    }

    /**
     * 将字符串解析为指定格式的日期
     *
     * @param date
     * @param format
     * @return
     */
    static Date DateTestUtils01(String date, String format) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(format);
        try {
            Date parse = simpleDateFormat.parse(date);
            return parse;
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * 将日期转换为指定格式的字符串
     *
     * @param date
     * @param format
     * @return
     */
    static String DateTestUtils02(Date date, String format) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(format);
        String format1 = simpleDateFormat.format(date);
        return format1;
    }
}
