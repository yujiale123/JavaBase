package com.yjl.Advanced.blockQueue;

import java.util.concurrent.ArrayBlockingQueue;

/**
 * @author yujiale
 * @Classname Producers
 * @Description TOO
 * @Date 2021/9/7 下午9:34
 * @Created by yujiale
 */
public class Producers extends Thread {
    private ArrayBlockingQueue<String> list;

    public Producers(ArrayBlockingQueue<String> arrayBlockingQueue) {
        this.list = arrayBlockingQueue;
    }

    @Override
    public void run() {
        while (true) {
            try {
                list.put("汉堡包");
                System.out.println("生产者放了一条数据");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
