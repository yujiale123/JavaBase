package com.yjl.primary.day06_ApiAndEx.dataSource;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * 大数值案例
 */
public class BigInterger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入正数");
        int k = scanner.nextInt();
        System.out.println("请输入整数");
        int n = scanner.nextInt();
        BigInteger bigInteger = BigInteger.valueOf(1);
        for (int i = 1; i <= k; k++) {
            bigInteger = bigInteger.multiply(BigInteger.valueOf(n - i + 1).divide(BigInteger.valueOf(i)));
            System.out.println(bigInteger);
        }
    }
}
