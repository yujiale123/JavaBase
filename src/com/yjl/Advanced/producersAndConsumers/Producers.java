package com.yjl.Advanced.producersAndConsumers;

/**
 * @author yujiale
 * @Classname producers
 * @Description TOO
 * @Date 2021/9/7 下午8:30
 * @Created by yujiale
 * 生产者
 */
public class Producers extends Thread {
    private Middle middle;

    public Producers(Middle middle) {
        this.middle = middle;
    }

    @Override
    public void run() {

        while (true) {
            synchronized (middle.getLock()) {
                if (middle.getCount() == 0) {
                    break;
                } else {
                    if (!middle.isFlag()) {
                        System.out.println("生产者正在生产消息");
                        middle.setFlag(true);
                        middle.getLock().notifyAll();
                    } else {
                        try {
                            middle.getLock().wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        }
    }
}
