package com.yjl.primary.day01;

/**
 * 变量:变量主要是有变量类型,变量名和变量值;
 * 数据类型 变量名 = 数据值；
 * public         int       n =      1  ;
 * 变量的命名规则
 * 1.满足标识符命名规则
 * 2.符合驼峰法命名规范
 * 3.尽量简单，做到见名知意
 * 4.变量名的长度没有限制
 * 5.不能使用java保留字作为变量名
 * 6.尽量不使用未初始化的变量
 *
 * 变量概念是指：在程序中，其值可能发生改变
 */
public class Variable {
    private int n = 1;
    private int nameLength = 12;

    public static void main(String[] args) {
        /**
         * 常量的输出
         */
        // 输出一个整数
        System.out.println(10);
        // 输出一个小数
        System.out.println(5.5);
        System.out.println('a'); // 输出一个字符
        System.out.println(true); // 输出boolean值true
        System.out.println("欢迎来到java"); // 输出字符串
        /**
         * 变量的输出
         */
        // 声明变量并赋值
        int age = 18;
        System.out.println(age);
        double money;
        money = 55.5;
        System.out.println(money);
        int a = 10, b = 20; // 定义int类型的变量a和b，中间使用逗号隔开
        System.out.println(a);
        System.out.println(b);

        int c, d; // 声明int类型的变量c和d，中间使用逗号隔开
        c = 30;
        d = 40;
        System.out.println(c);
        System.out.println(d);
    }
}
