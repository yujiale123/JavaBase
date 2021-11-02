package com.yjl.primary.day03_IfAndFor;

import java.util.Random;
import java.util.Scanner;

/**
 * @author yujiale
 * @Classname RandomDemo
 * @Description TOO
 * @Date 2021/8/28 上午9:05
 * @Created by yujiale
 * 随机数Demo
 */
public class RandomDemo {
    public static void main(String[] args) {
        RandomTest01();
    }

    /**
     * 猜数字
     * 优先生成1-100的随机数，并输入数字判断是否输入正确，如果不正确进行提示
     */
    static void RandomTest01() {
        //要完成猜数字的游戏，首先需要有一个要猜的数字，使用随机数生成该数字，范围1到100
        Random r = new Random();
        int number = r.nextInt(100) + 1;

        while (true) {
            //使用程序实现猜数字，每次均要输入猜测的数字值，需要使用键盘录入实现
            Scanner sc = new Scanner(System.in);

            System.out.println("请输入你要猜的数字：");
            int guessNumber = sc.nextInt();

            //比较输入的数字和系统产生的数据，需要使用分支语句。这里使用if..else..if..格式，根据不同情况进行猜测结果显示
            if (guessNumber > number) {
                System.out.println("你猜的数字" + guessNumber + "大了");
            } else if (guessNumber < number) {
                System.out.println("你猜的数字" + guessNumber + "小了");
            } else {
                System.out.println("恭喜你猜中了");
                break;
            }
        }
    }
}
