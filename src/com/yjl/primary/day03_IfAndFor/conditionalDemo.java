package com.yjl.primary.day03_IfAndFor;

import java.util.Scanner;

/**
 * @author yujiale
 * @Classname conditionalDemo
 * @Description TOO
 * @Date 2021/8/27 上午9:39
 * @Created by yujiale
 */
public class conditionalDemo {
    public static void main(String[] args) {
        conditionalTest04();
    }

    /**
     * if else语句
     *    /**
     *          * 分支结构
     *          *
     *          * if格式：
     *          * if (关系表达式) {
     *          *     语句体;
     *          * }
     *          if else
     *     执行流程
     *         计算关系表达式的值
     *         如果关系表达式的值为true就执行语句体
     *         如果关系表达式的值为false就不执行语句体
     *         继续执行后面的内容
     *          */

    static void conditionalTest01() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入整数判断奇偶");
        int i = scanner.nextInt();
        if (i % 2 == 0) {
            System.out.println("该数字偶数");
        } else {
            System.out.println("该数字是奇数");
        }
    }

    /**
     * 判断成绩是否在那个成绩区间
     */
    static void conditionalTest02(){

        int a = 10;
        int b = 20;
        if (a > b) {
            System.out.println(a);
        } else {
            System.out.println(b);
        }
        int score = 65;
        if (score >= 90 && score <= 100) {
            System.out.println("优秀");
        } else if (score >= 80 && score <= 89) {
            System.out.println("良好");
        } else if (score >= 70 && score <= 79) {
            System.out.println("中等");
        } else if (score >= 60 && score <= 69) {
            System.out.println("及格");
        } else if (score >= 0 && score <= 59) {
            System.out.println("请努力加油");
        } else {
            System.out.println("成绩有误!");
        }
    }

    /**
     * switch case
     *
     /**
     * switch
     * switch (表达式) {
     * 	case 1:
     * 		语句体1;
     * 		break;
     * 	case 2:
     * 		语句体2;
     * 		break;
     * 	...
     * 	default:
     * 		语句体n+1;
     * 		break;
     * }
     *
     switch case
     格式说明：
     表达式：取值可以为整型也可以为String类型
     case后面跟的是和表达式进行比较的值
     break表示中断跳出switch条件语句
     defalut表示所有case中的情况不匹配，就执行defalue里面的语句
     */
    static void conditionalTest03() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入数字判断在那个季节");
        int i = scanner.nextInt();
        switch (i) {
            case 1:
            case 2:
            case 3:
                System.out.println("春天");
                break;
            case 4:
            case 5:
            case 6:
                System.out.println("夏天");
                break;
            case 7:
            case 8:
            case 9:
                System.out.println("秋天");
                break;
            case 10:
            case 11:
            case 12:
                System.out.println("冬天");
                break;
            default:
                System.out.println("不存在");
                break;
        }
    }

    /**
     * 根据输入的星期几来决定做什么
     */
    static void conditionalTest04(){
        // 1. 键盘录入星期数据，使用变量接收
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入");
        int week = sc.nextInt();
        // 2. 多情况判断，采用switch语句实现
        switch (week) {
            // 3. 在不同的case中，输出对应的减肥计划
            case 1:
                System.out.println("跑步");
                break;
            case 2:
                System.out.println("游泳");
                break;
            case 3:
                System.out.println("慢走");
                break;
            case 4:
                System.out.println("动感单车");
                break;
            case 5:
                System.out.println("拳击");
                break;
            case 6:
                System.out.println("爬山");
                break;
            case 7:
                System.out.println("好好吃一顿");
                break;
            default:
                System.out.println("您的输入有误");
                break;
        }
    }

}
