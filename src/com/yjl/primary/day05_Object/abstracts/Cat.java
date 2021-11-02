package com.yjl.primary.day05_Object.abstracts;

/**
 * @author yujiale
 * @Classname Cat
 * @Description TOO
 * @Date 2021/9/2 下午4:42
 * @Created by yujiale
 */
public class Cat extends Animal {
    public Cat() {
    }

    public Cat(int age, String name) {
        super(age, name);
    }

    @Override
    public void eat() {
        System.out.println("猫吃鱼");
    }
}
