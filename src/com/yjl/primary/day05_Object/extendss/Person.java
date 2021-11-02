package com.yjl.primary.day05_Object.extendss;

/**
 * @author yujiale
 * @Classname Person
 * @Description TOO
 * @Date 2021/9/1 下午10:41
 * @Created by yujiale
 */
public class Person {
    private String name;
    private int age;

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
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
