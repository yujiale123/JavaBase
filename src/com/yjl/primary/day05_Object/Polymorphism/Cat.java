package com.yjl.primary.day05_Object.Polymorphism;

/**
 * @author yujiale
 * @Classname Cat
 * @Description TOO
 * @Date 2021/9/2 上午7:16
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

    public void playGame(){
        System.out.println("猫捉迷藏");
    }
}
