package com.yjl.Advanced.blockQueue;

import java.util.concurrent.ArrayBlockingQueue;

/**
 * @author yujiale
 * @Classname blockQueueDemo
 * @Description TOO
 * @Date 2021/9/7 下午9:27
 * @Created by yujiale
 */
public class BlockingQueueDemo {

    public static void main(String[] args) throws InterruptedException {
        blockingQueueTest02();
    }

    /**
     * 阻塞队列的基本用法
     */
    public static void blockingQueueTest01() throws InterruptedException {
        ArrayBlockingQueue<String> arrayBlockingQueue = new ArrayBlockingQueue<String>(1);

        //存储元素
        arrayBlockingQueue.put("汉堡包");

        //去元素
        System.out.println(arrayBlockingQueue.take());
        System.out.println(arrayBlockingQueue.take());
        System.out.println("程序结束");

    }

    /**
     * 阻塞队列和生产者消费者组合
     */
    public static void blockingQueueTest02() {
        ArrayBlockingQueue<String> arrayBlockingQueue = new ArrayBlockingQueue<String>(1);

        Customers customers = new Customers(arrayBlockingQueue);
        Producers producers = new Producers(arrayBlockingQueue);
        customers.start();
        producers.start();
    }
}
