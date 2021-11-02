package com.yjl.primary.day05_Object.Polymorphism;

/**
 * @author yujiale
 * @Classname PolymorphismDemo
 * @Description TOO
 * @Date 2021/9/2 上午7:15
 * @Created by yujiale
 */
public class PolymorphismDemo {
    public static void main(String[] args) {
        polymorphismTest04();
    }

    /**
     * 多态中成员访问特点
     * 成员变量：编译看左边，执行看左边
     * 成员方法：编译看左边，执行看右边
     * 区别：
     * 成员方法有重写，而成员变量没有
     */
    public static void polymorphismTest01() {
        Animal a = new Cat();
        a.eat();
        System.out.println(a.age);
    }

    /**
     * 多态好处和坏处
     * 好处
     * 提高来程序的扩展性
     * 定义方法时候，使用父类型作为参数，将来在使用时，使用具体的子类行参与操作
     * 坏处
     * 不能使用子类的特有功能
     */
    public static void polymorphismTest02() {
        Cat cat = new Cat();
        UseAnimal useAnimal = new UseAnimal();
        useAnimal.UseAnimal(cat);

        Dog dog = new Dog();
        useAnimal.UseAnimal(dog);
    }

    /**
     * 多态的转型
     * 向上转型
     * 从子到父
     * 父类引用指向子类对象
     * 向下转型
     * 从父到字
     * 父类引用转为子类对象
     */
    public static void polymorphismTest03() {
        //向上转型
        Animal a = new Cat();
        a.eat();

        // Cat cat = new Cat();
        // cat.playGame();
        // cat.eat();

        //向下转型
        Cat c = (Cat) a;
        c.playGame();

        a = new Dog();
        a.eat();
    }

    /**
     * 测试类
     */
    public static void polymorphismTest04() {
        Animal animal = new Cat();
        animal.setAge(123);
        animal.setName("加菲");
        System.out.println(animal.toString());
        animal.eat();
        animal = new Cat(5, "卡宾");
        System.out.println(animal.toString());
        animal.eat();
        animal = new Dog();
        animal.eat();

    }

}
