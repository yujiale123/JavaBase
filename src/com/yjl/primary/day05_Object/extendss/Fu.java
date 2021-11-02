package com.yjl.primary.day05_Object.extendss;

/**
 * @author yujiale
 * @Classname Fu
 * @Description TOO
 * @Date 2021/9/1 下午9:31
 * @Created by yujiale
 */
public class Fu {

    public void show(){
        System.out.println("父类的show方法被调用");
    }

    public  int age=40;


    public Fu(){
        System.out.println("fu类的无参构造方法");
    }
    public Fu(int age){
        System.out.println("fu类的有参构造方法");
    }


}
