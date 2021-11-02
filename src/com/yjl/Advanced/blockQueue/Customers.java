package com.yjl.Advanced.blockQueue;

import java.util.concurrent.ArrayBlockingQueue;

/**
 * @author yujiale
 * @Classname Customers
 * @Description TOO
 * @Date 2021/9/7 下午9:34
 * @Created by yujiale
 */
public class Customers extends Thread {
    private ArrayBlockingQueue<String> list;
    public Customers(ArrayBlockingQueue<String> arrayBlockingQueue) {
        this.list = arrayBlockingQueue;
    }

    @Override
    public void run() {
        while (true) {
            try {
                String take = list.take();
                System.out.println(take+"消费者不断地消费");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
