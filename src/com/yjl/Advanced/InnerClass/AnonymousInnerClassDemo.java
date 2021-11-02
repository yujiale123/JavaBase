package com.yjl.Advanced.InnerClass;

/**
 * @author yujiale
 * @Classname AnonymousInnerClassDemo
 * @Description TOO
 * @Date 2021/9/5 上午9:18
 * @Created by yujiale
 */
public class AnonymousInnerClassDemo {
    public static void main(String[] args) {

        goSwimming(new Swimming() {
            @Override
            public void swim() {
                System.out.println("我们游泳吧");
            }
        });

        goSwimming(()->{
            System.out.println("我们游泳吧");
        });
    }

    /**
     * 使用接口的方法
     * @param swimming
     */
    public static void goSwimming(Swimming swimming) {
        swimming.swim();
    }

    interface Swimming {
        void swim();
    }
}
