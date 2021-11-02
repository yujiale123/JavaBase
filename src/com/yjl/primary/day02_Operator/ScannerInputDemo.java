package com.yjl.primary.day02_Operator;

import java.util.Scanner;

/**
 * @author yujiale
 * @Classname ScannerInoutDemo
 * @Description 键盘输入demo
 * @Date 2021/8/26 下午10:23
 * @Created by yujiale
 * @auther  yujiale
 */
public class ScannerInputDemo {
    public static void main(String[] args) {
        ScannerInputTest01();
    }

    /**
     * 键盘输入
     */
    static void ScannerInputTest01(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输出整数");
        int i = scanner.nextInt();
        System.out.println(i);
        System.out.println("请输入浮点型数字");
        double v = scanner.nextDouble();
        System.out.println(v);
        System.out.println("请输入字符串");
        String s = scanner.nextLine();
        System.out.println(s);
    }
}
