package com.yjl.primary.day02_Operator;

import java.util.Scanner;

/**
 * 键盘输入
 */
public class ScannerTest {
    public static void main(String[] args) {
        System.out.println("请键盘输入你的名字:");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println("请输入你的年纪");
        int age = scanner.nextInt();
        System.out.println("名字："+name +",年龄："+age);

    }
}
