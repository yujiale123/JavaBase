package com.yjl.primary.day05_Object.Polymorphism;

/**
 * @author yujiale
 * @Classname Animal
 * @Description TOO
 * @Date 2021/9/2 上午7:16
 * @Created by yujiale
 */
public class Animal {

    public int age ;
    public String name;
    public Animal() {
    }

    public Animal(int age, String name) {
        this.age = age;
        this.name = name;
    }


    public void eat(){
        System.out.println("动物吃东西");
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
