package com.yjl.primary.day05_Object.Interfaces;

/**
 * @author yujiale
 * @Classname animal
 * @Description TOO
 * @Date 2021/9/2 下午5:44
 * @Created by yujiale
 */
public abstract class Animal {
    private String name;
    private int age;
    public void eat(){
        System.out.println("动物吃东西");
    }

    public Animal() {
    }

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
