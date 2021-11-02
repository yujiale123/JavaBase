package com.yjl.primary.day05_Object.Interfaces;

/**
 * @author yujiale
 * @Classname Cat
 * @Description TOO
 * @Date 2021/9/2 下午4:54
 * @Created by yujiale
 */
public class Cat extends Animal implements Jumping {


    public Cat() {
    }

    public Cat(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("猫吃鱼");
    }

    @Override
    public void jump() {
        System.out.println("猫跳");
    }
}
