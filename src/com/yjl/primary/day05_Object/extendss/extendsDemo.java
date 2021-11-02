package com.yjl.primary.day05_Object.extendss;

/**
 * @author yujiale
 * @Classname extendsT
 * @Description TOO
 * @Date 2021/9/1 下午9:24
 * @Created by yujiale
 * 继承是面向对象三大特征之一，可以是子类具有父类的属性方法，还在子类中重新定义、追加属性和方法
 * public class 子类名 extends 父类名{}
 * <p>
 * 好处和坏处
 * 好处
 * 提高来代码的复用性（多个类相同的成员可以当到同一个类中）
 * 提高来代码的维护性（如果方法的代码需要修改，就修改一处）
 * 坏处
 * 继承让类与类之间产生类关系，类的耦合性增强，当父类发生变化时，子类也不得跟着变化，消弱类子类的独立性
 * 什么时候使用继承
 * 继承体现的是is a的关系
 * 假设法：我有两个类A和B，如果他们满足A是B的一种，或者B是A的一种，就说明他们存在继承关系，这个时候就可以考虑使用继承来体现，否则就不能滥用继承举例：苹果和水果，猫和动物，猫和狗
 */
public class extendsDemo {
    public static void main(String[] args) {
        extendsTest05();
    }

    /**
     * 子类的特点：
     * 子类可以有父类的内容
     * 子类还可以有自己特有的内容
     * <p>
     * 继承中变量的访问特点
     * 1.首先在子类的局部范围找
     * 2.子类成员范围找
     * 3.父类成员范围找
     * 4.如果没有就报错
     */
    static void extendsTest01() {
        Fu fu = new Fu();
        fu.show();
        Zi zi = new Zi();
        zi.method();
        zi.show();
    }

    /**
     * super常用方法
     * super和this的特点
     * super
     * 父类对象的引用
     * this
     * 本科对象的引用
     */
    static void superTest01() {
        Zi zi = new Zi();
        zi.show1();
    }

    /**
     * 继承中构造方法的访问特点
     * 子类继承父类，子类初始化之前，优先完成父类的初始化
     * 每一个子类的构造方法第一条默认语句是super（）
     * 通过使用super关键字去显示的调用父类的带参构造方法
     * 如果父类不写无参构造方法，则系统会自动提供无参构造方法
     */
    static void extendsTest02() {
        Zi zi = new Zi();
        Zi zi1 = new Zi(20);
    }

    /**
     * 继承中成员方法的访问特点
     * 首先在子类的成员范围找
     * 父类成员范围找
     */
    static void extendsTest03() {
        Zi zi = new Zi();
        zi.method();
        zi.show();
    }

    /**
     * 方法的重写（覆盖）
     * 概述
     * 子类中出现和父类中一摸一样的方法声明
     * 应用
     * 当子类需要父类的功能，而功能主体是子类特有功能，可以重写父类中的方法，这样既沿袭类父类的功能，也定义来子类的特有内容
     * 注意事项
     * 私有方法不能被重写(父类私有成员子类是不能继承的)
     * 子类方法访问权限不能更低(public > 默认 > 私有)
     */
    static void extendsTest04() {
        Phone phone = new Phone();
        phone.call("林青霞");

        NewPhone newPhone = new NewPhone();
        newPhone.call("123");
    }

    /**
     * 定义学生和教师并抽取公共方法单独调用独有的方法
     */
    static void  extendsTest05(){
        Teacher teacher = new Teacher();
        teacher.setAge(18);
        teacher.setName("另请下");
        System.out.println(teacher.toString());
        teacher.teach();
        Student student = new Student();
        student.study();
    }
}
