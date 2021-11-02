package com.yjl.Advanced.Multithreading;

/**
 * @author yujiale
 * @Classname TicketDemo
 * @Description TOO
 * @Date 2021/9/7 上午7:06
 * @Created by yujiale
 */
public class TicketDemo {


    public static void main(String[] args) {
        TicketTest02 ticketTest02 = new TicketTest02();
        Thread thread1 = new Thread(ticketTest02);
        Thread thread2 = new Thread(ticketTest02);
        Thread thread3 = new Thread(ticketTest02);
        thread1.setName("窗口一");
        thread2.setName("窗口二");
        thread3.setName("窗口三");
        thread1.start();
        thread2.start();
        thread3.start();

    }

    public static class TicketTest01 implements Runnable {
        private static int ticket = 100;
        private Object obj = new Object();

        @Override
        public void run() {
            while (true) {
                synchronized (obj) {
                    if (ticket <= 0) {
                        break;
                    } else {
                        try {
                            Thread.sleep(100);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        ticket--;
                        System.out.println(Thread.currentThread().getName() + "在买票，还剩下" + ticket + "张票");
                    }
                }
            }
        }
    }

    public static class TicketTest02 extends Thread {
        private static int ticketCount = 100;
        private static Object obj = new Object();

        @Override
        public void run() {
            while (true){
                synchronized (obj) {
                    if (ticketCount <= 0) {
                        break;
                    } else {
                        try {
                            Thread.sleep(100);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        ticketCount--;
                        System.out.println(Thread.currentThread().getName() + "在买票，还剩下" + ticketCount + "张票");
                    }
                }
            }
        }
    }
}
