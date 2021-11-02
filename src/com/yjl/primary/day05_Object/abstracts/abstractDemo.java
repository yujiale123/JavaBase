package com.yjl.primary.day05_Object.abstracts;

/**
 * @author yujiale
 * @Classname abstractDemo
 * @Description TOO
 * @Date 2021/9/2 下午4:24
 * @Created by yujiale
 *
 * 一个没有方法体的方法被称为抽象方法，而类中如果有抽象方法，那么一定是抽象类
 */
public class abstractDemo {
    public static void main(String[] args) {
        abstractTest03();
    }

    /**
     * 抽象类的特点
     * 抽象类和抽象方法都必须使用 abstract 关键字修饰
     * public abstract class 类名 {}
     * public abstract void eat();
     * 抽象类不一定有抽象方法，有抽象方法一定有抽象方法
     * 抽象类不能实例化
     * 参照多态的方式，通过子类对象实例化，这叫抽象类多态
     * 抽象类的子类
     * 要么重写抽象类中的所有抽象方法
     * 要么是抽象类
     */
    public static void abstractTest01() {
        Animal animal = new Animal() {
            @Override
            public void eat() {

            }
        };
    }

    /**
     * 抽象类的成员特点
     * 成员变量也可以是常量，也可以变量
     * 构造方法
     * 有构造方法，但是不能实例花
     * 构造方法的作用是什么呢？用于子类访问父类数据的初始化
     * 成员方法
     * 可以有抽象方法：限定子类必须完成某些动作
     * 也可以有非抽象方法：提高代码复用性
     */
    public static void abstractTest02() {
        Animal animal = new Animal() {
            @Override
            public void eat() {
                System.out.println("吃东西");
            }
        };
        animal.eat();
    }

    /**
     * 猫和够的接口类编写
     */
    public static void abstractTest03() {
        Animal a = new Cat();
        a.setName("加菲");
        a.setAge(18);
        System.out.println(a.toString());
        a = new Dog(123, "卡宾");
        System.out.println(a.toString());
    }

}
