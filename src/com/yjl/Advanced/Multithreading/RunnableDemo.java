package com.yjl.Advanced.Multithreading;

/**
 * @author yujiale
 * @Classname RunnableDemo
 * @Description TOO
 * @Date 2021/9/6 下午9:13
 * @Created by yujiale
 */
public class RunnableDemo {
    public static void main(String[] args) {
        RunnableTest01 runnableTest01 = new RunnableTest01();
        Thread thread = new Thread(runnableTest01);
        thread.start();
    }

    public static class RunnableTest01 implements Runnable{

        @Override
        public void run() {
            for (int i = 0; i < 100; i++) {
                System.out.println("线程开启了，第二种方法实现："+i);
            }
        }
    }
}
