package com.yjl.primary.day05_Object.Interfaces;

/**
 * @author yujiale
 * @Classname Dog
 * @Description TOO
 * @Date 2021/9/2 下午5:24
 * @Created by yujiale
 */
public  class Dog extends Animal implements Jumping {

    public Dog() {
    }

    public Dog(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("狗吃骨头");
    }

    @Override
    public void jump() {
        System.out.println("狗跳");
    }
}
