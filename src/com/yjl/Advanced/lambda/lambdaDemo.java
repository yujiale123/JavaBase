package com.yjl.Advanced.lambda;

import java.util.Random;

/**
 * @author yujiale
 * @Classname lambdaDemo
 * @Description TOO
 * @Date 2021/9/5 上午10:03
 * @Created by yujiale
 */
public class lambdaDemo {
    public static void main(String[] args) {
        useRandomNumHandler(new RandomNumHandler() {
            @Override
            public int getNumber() {
                System.out.println("匿名内部类");
                Random random = new Random();
                int num = random.nextInt(10) + 1;
                return num;
            }
        });
        useRandomNumHandler(() ->{
            System.out.println("Lambda表达式");
            Random random = new Random();
            int num = random.nextInt(10) + 1;
            return num;
        });

        useCalculator((int a,int b)->{
            System.out.println("lambda表达式");
            return a+b;
        });

        useInter((double x,double y)->{
            System.out.println("lambda的省略模式");
            return  x+y;
        });
    }

    /**
     * 首先存在一个接口（randomNumHandler）无参数有返回值
     * 2。在该测试类中存在一个抽象方法（getNumber）
     * 3。测试方法
     *
     * @param randomNumHandler
     */
    public static void useRandomNumHandler(RandomNumHandler randomNumHandler) {
        int number = randomNumHandler.getNumber();
        System.out.println(number);
    }

    interface RandomNumHandler {
        int getNumber();
    }

    /**
     * 1。首先存在一个接口（Calcutor）
     * 2。在该接口中存在一个抽象方法（clac），该方法有参数也有返回值
     */
    public static void useCalculator(Calculator calculator){
        int calc = calculator.calc(10, 20);
        System.out.println(calc);
    }

    interface  Calculator{
        int calc(int x,int y);
    }

    /**
     * lambda的省略模式
     */
    public static void  useInter(Inter i ){
        double method = i.method(12.8, 12.9);
        System.out.println(method);
    }

    interface  Inter{
        double method(double a,double b);
    }
}
