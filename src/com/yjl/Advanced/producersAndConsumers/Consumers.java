package com.yjl.Advanced.producersAndConsumers;

/**
 * @author yujiale
 * @Classname Consumers
 * @Description TOO
 * @Date 2021/9/7 下午8:32
 * @Created by yujiale
 * <p>
 * 消费者
 */
public class Consumers extends Thread {
    private Middle middle;

    public Consumers(Middle middle) {
        this.middle = middle;
    }

    @Override
    public void run() {
        while (true) {
            synchronized (middle.getLock()) {
                if (middle.getCount() == 0) {
                    break;
                } else {
                    if (middle.isFlag()) {
                        System.out.println("消费者在消费");
                        middle.setFlag(false);
                        middle.getCount().notifyAll();
                        middle.setCount(middle.getCount() - 1);

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
