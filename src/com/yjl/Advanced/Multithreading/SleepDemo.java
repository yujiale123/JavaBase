package com.yjl.Advanced.Multithreading;

/**
 * @author yujiale
 * @Classname SleepDemo
 * @Description TOO
 * @Date 2021/9/6 下午9:47
 * @Created by yujiale
 */
public class SleepDemo {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("睡觉前");
        Thread.sleep(2000);
        System.out.println("睡觉后");
    }

    public static class Runnable implements java.lang.Runnable{

        @Override
        public void run() {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}
