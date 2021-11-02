package com.yjl.primary.day01;

/**
 * 常量
 * 常量被final指示变量，并且常量名使用大写，定义在所有的方法外面。
 * 常量是指被final修饰，并且只能赋值一次，赋值之后就不能被修改
 * @author yujiale
 *
 * 修饰符
 */
public class Constant {
    public  static final  double PER_INCH=2.54;

    public static void main(String[] args) {
        double pageWidth = 8.5;
        double pageHeight = 11;
        System.out.println(pageHeight*PER_INCH);
        System.out.println(pageWidth*PER_INCH);
    }
}
