package com.yjl.Advanced.producersAndConsumers;

/**
 * @author yujiale
 * @Classname Demo
 * @Description TOO
 * @Date 2021/9/7 下午8:47
 * @Created by yujiale
 */
public class Demo {
    public static void main(String[] args) {
        Middle middle = new Middle();
        Producers producers = new Producers(middle);
        Consumers consumers = new Consumers(middle);
        producers.start();
        consumers.start();
    }
}
