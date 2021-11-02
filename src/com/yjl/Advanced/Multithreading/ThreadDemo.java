package com.yjl.Advanced.Multithreading;

/**
 * @author yujiale
 * @Classname ThreadDemo
 * @Description TOO
 * @Date 2021/9/6 下午8:57
 * @Created by yujiale
 * 使用thread实现多线程
 */
public class ThreadDemo {
    public static void main(String[] args) {
        String name = Thread.currentThread().getName();
        System.out.println(name);
        ThreadTest01 threadTest01 = new ThreadTest01();
      //  threadTest01.start();
        ThreadTest01 threadTest011 = new ThreadTest01();


       // threadTest01.run();
        System.out.println("========");
        //threadTest011.run();
        System.out.println("=======");
       // threadTest011.start();
        ThreadTest02 threadTest02 = new ThreadTest02();
        threadTest02.start();
    }

    /**
     * 常见用法
     */
   public static class ThreadTest01 extends Thread{
       @Override
       public void run() {
           for (int i = 0; i < 100; i++) {
               System.out.println("线程开启了"+i);
           }
       }
   }

   public static class ThreadTest02  extends  Thread{
       @Override
       public void run() {
           for (int i = 0; i < 100; i++) {
               System.out.println(getName()+"@@@@"+i);

           }
       }
   }

}
