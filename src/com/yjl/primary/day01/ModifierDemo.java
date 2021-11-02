package com.yjl.primary.day01;

/**
 * @author yujiale
 * @Classname ModifierDemo
 * @Description TOO
 * @Date 2021/9/1 下午10:54
 * @Created by yujiale
 * 修饰符（final static）
 */
public class ModifierDemo {
    public static void main(String[] args) {

    }

    /**
     * 修饰符
     *     权限修饰符
     *         private
     *             只有在同一个类中才能访问
     *         默认
     *             只能在同一个包才能访问，仅仅比private小
     *         proteced
     *             只能在不同包的子类访问，权限比public小
     *         public
     *             不同包的无关类，权限最大
     *     状态修饰符
     *         final（最终态）
     *             修饰特点
     *                 修饰方法：表明方法是最终方法，不能被重写
     *                 修饰变量：表明变量是常量，不可被再次复制
     *                 修饰类：表示类是最终类，不能被继承
     *             修饰局部变量
     *                 变量是基本类型，final修饰值的是基本类型的数据值不能改变
     *                 变量是引用类型，final修饰的引用类型的地址不能改变，但是地址内面的内容是可以改变的
     *         static（静态）
     *             修饰特点
     *                 被类的所有对象共享
     *                     这也是我们判断是否使用静态关键字的条件
     *                 可以通过类名调用当然，
     *                     也可以通过对象名调用推荐使用类名调用
     *                 推荐使用类名调用
     *             访问特点
     *                 非静态的成员方法
     *                     能访问静态的成员变量
     *                     能访问非静态的成员变量
     *                     能访问静态的成员方法
     *                     能访问非静态的成员方法
     *                 静态的成员方法
     *                     能访问静态的成员变量
     *                     能访问静态的成员方法
     *                 静态成员方法只能访问静态成员，非静态成员方法可以访问静态或者非静态的成员方法和变量
     */
    public static  void ModifierTest01(){
        final int age =20;
    }
}
