package com.yjl.primary.day05_Object.abstracts;

/**
 * @author yujiale
 * @Classname Dog
 * @Description TOO
 * @Date 2021/9/2 下午4:42
 * @Created by yujiale
 */
public class Dog extends Animal {


    @Override
    public void eat() {
        System.out.println("够吃骨头");
    }

    public Dog() {
    }

    public Dog(int age, String name) {
        super(age, name);
    }
}
