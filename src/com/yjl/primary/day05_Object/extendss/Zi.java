package com.yjl.primary.day05_Object.extendss;

/**
 * @author yujiale
 * @Classname Zi
 * @Description TOO
 * @Date 2021/9/1 下午9:32
 * @Created by yujiale
 */
public class Zi extends Fu {

    public  int height = 175;
    public  int age = 20;

    public Zi(){
        System.out.println("Zi类的无参构造方法");
    }
    public Zi(int age){
        System.out.println("Zi类的有参构造方法");
    }
    @Override
    public void show(){
        System.out.println("子类的show方法被调用");
    }

    public void method() {
        System.out.println("子类的method方法被调用");
    }
    public void show1() {
        int age = 30;
        //访问方法内的成员变量
        System.out.println(age);
        //访问类中的成员变量age
        System.out.println(this.age);
        //访问父类的成员变量
        System.out.println(super.age);
    }
}
