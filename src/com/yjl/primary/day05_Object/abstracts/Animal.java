package com.yjl.primary.day05_Object.abstracts;

/**
 * @author yujiale
 * @Classname Animal
 * @Description TOO
 * @Date 2021/9/2 下午4:25
 * @Created by yujiale
 */
public abstract class Animal {
    private int age = 20;
    private String name;


    public Animal() {
    }

    public Animal(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public abstract void eat();

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

    @Override
    public String toString() {
        return "Animal{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
