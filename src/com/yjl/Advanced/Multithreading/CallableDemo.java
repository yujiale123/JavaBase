package com.yjl.Advanced.Multithreading;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * @author yujiale
 * @Classname CallableDemo
 * @Description TOO
 * @Date 2021/9/6 下午9:21
 * @Created by yujiale
 */
public class CallableDemo   {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        CallableTest01 callableTest01 = new CallableTest01();
        FutureTask<String> stringFutureTask = new FutureTask<String>(callableTest01);
        Thread thread = new Thread(stringFutureTask);
        thread.start();
        String s = stringFutureTask.get();
        System.out.println(s);
    }


    public static class CallableTest01 implements Callable<String>{

        @Override
        public String call() throws Exception {
            for (int i = 0; i <100 ; i++) {
                System.out.println("跟女孩表白"+i);
            }
            return "答应";
        }
    }
}
