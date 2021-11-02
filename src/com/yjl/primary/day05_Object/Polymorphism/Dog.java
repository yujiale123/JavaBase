package com.yjl.primary.day05_Object.Polymorphism;

/**
 * @author yujiale
 * @Classname Dog
 * @Description TOO
 * @Date 2021/9/2 上午7:29
 * @Created by yujiale
 */
public class  Dog  extends Animal{

    public Dog() {
    }

    public Dog(int age, String name) {
        super(age, name);
    }

    @Override
    public void eat() {
        System.out.println("狗吃骨头");
    }
}
