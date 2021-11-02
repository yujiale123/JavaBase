package com.yjl.primary.day06_ApiAndEx.dataSource;

import java.util.Arrays;

/**
 * @author yujiale
 * @Classname IntegerDemo
 * @Description TODO
 * @Date 2021/8/22 下午9:07
 * @Created by yujiale
 */
public class IntegerDemo {

    public static void main(String[] args) {
        IntegerConversionInt();
    }

    /**
     * int和Integer相互转换
     */
    public static void IntegerTest01() {
        //int  转换为Integer
        int num = 100;
        String s1 = "" + num;
        System.out.println(s1);
        //方式2
        String s2 = String.valueOf(num);
        System.out.println(s2);
        //String 转换为int
        String s = "100";
        //方式一
        Integer integer = Integer.valueOf(s);
        int i = integer.intValue();
        System.out.println(i);
        //方式二
        int i1 = Integer.parseInt(s);
        System.out.println(i1);
    }

    /**
     * 字符串中数据排序
     * 例如：  "96 27 46 29 50" 输出："27 29 46 50 96"
     * 1。定义一个字符串
     * 2。把字符串中的数字存储到int数组中
     * 如何得到字符串中每一个数字的数据
     * split（String regex）；
     * 存储到int数组中的方法
     * parseInt（）；
     * 3。对int数组进行排序
     * 4。把排序后的数组元素进行string拼接
     * 5。输出
     */
    public static void IntegerTest02() {
        String s = "96 27 47 29 50";
        String[] split = s.split(" ");
        int[] arr = new int[split.length];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(split[i]);
        }
        //对数组进行排序
        Arrays.sort(arr);
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                sb.append(arr[i]);
            } else {
                sb.append(arr[i]).append(" ");
            }
        }
        sb.append("]");
        String s1 = sb.toString();
        System.out.println(s1);
    }

    /**
     * 自动装箱和自动拆箱
     * 自动装箱：把基本数据类型转换为对应的包装类型  int --》 Integer
     * 自动拆箱：把包装类型转换为对应的基本数据类型  Integer --》 int
     */
    static void IntegerConversionInt() {
        //装箱
        int num = 100;
        Integer integer = Integer.valueOf(num);
        System.out.println(integer);
        //拆箱
        integer += 100;
        System.out.println(integer);
    }
}
