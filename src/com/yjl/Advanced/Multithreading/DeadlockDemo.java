package com.yjl.Advanced.Multithreading;

/**
 * @author yujiale
 * @Classname DeadlockDemo
 * @Description TOO
 * @Date 2021/9/7 上午7:54
 * @Created by yujiale
 */
public class DeadlockDemo {
    public static void main(String[] args) {
        Object obj1=  new Object();
        Object obj2=  new Object();
        new Thread(()->{
            synchronized ((obj1)){
                synchronized ((obj2)){
                    System.out.println("a同学正在走路");
                }
            }
        }).start();

        new  Thread(()->{
            synchronized (obj2){
                synchronized ((obj1)){
                    System.out.println("b同学正在走路");
                }
            }
        });
    }


}
