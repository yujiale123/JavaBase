package com.yjl.primary.day05_Object.Interfaces;

/**
 * @author yujiale
 * @Classname InterfaceDemo
 * @Description TOO
 * @Date 2021/9/2 下午4:53
 * @Created by yujiale
 *
 * 接口是一种公共的规范标准，java中更多的是体现在行为的抽象中
 */
public class InterfaceDemo {
    public static void main(String[] args) {
        InterfaceTest03();
    }

    /**
     * 特点
     * 接口必须使用interface修饰
     * public interface 类名{}
     * 类必须使用implements表示
     * public class 类名 implements 接口类{}
     * 接口不能实例化
     * 参照多态的方式，通过实现类对象实例化，这叫接口多态。
     * 多态的形式：具体类多态，抽象类多态，接口多态。
     * 多态的前提：有继承或者实现关系；有方法重写；有父(类/接口)引用指向(子/实现)类对象
     * 接口的子类
     * 要么重写接口中的所有抽象方法
     * 要么是抽象类
     */
    public static void InterfaceTest01() {
        Cat cat = new Cat();
        cat.jump();
        Jumping jumping = new Cat();
        jumping.jump();
    }

    /**
     * 成员特点
     * 成员变量
     * 只能使用常量，因为有默认修饰符
     * public static final
     * 可以通过类名直接访问常量
     * 构造方法
     * 没有，因为接口主要是扩展功能的，而没有具体存在
     * 成员方法
     * 只能是抽象方法
     * 默认修饰符：public abstract
     *
     * 抽象类和类的区别
     *     成员区别
     *         抽象类
     *             变量、常量、有构造方法、有抽象方法、也可以没有抽象方法
     *         接口
     *             常量、抽象方法
     *     关系区别
     *         类与类
     *             继承、单继承、接口
     *         类与接口
     *             失信、单实现、多实现
     *         接口与接口
     *             继承、单继承、多继承
     *     设计理念区别
     *         抽象类
     *             对类抽象，包括属性、行为
     *         接口
     *             对行为抽象，主要是行为
     */
    public static void InterfaceTest02() {
        Inter inter = new InterImpl();
        //inter.num=20;
        System.out.println(Inter.num);

        System.out.println(Inter.num1);
        inter.show();
        inter.show1();
    }

    /**
     * 猫和狗接口版本
     */
    public static void InterfaceTest03() {
        Cat cat = new Cat();
        cat.jump();
        cat.eat();
        Dog dog = new Dog();
        dog.setAge(11);
        dog.setName("ahuang");
        System.out.println(dog.toString());
        dog.jump();
        dog.eat();
        Animal d = new Cat();
        d.setAge(19);
        d.setName("旺仔");
        System.out.println(d.toString());
    }
}
