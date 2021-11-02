package com.yjl.Advanced.annotation;

/**
 * @author yujiale
 * @Classname ZI
 * @Description TOO
 * @Date 2021/9/9 下午8:18
 * @Created by yujiale
 */
public class ZI extends  Fu{
    @Override
    public void show() {
        System.out.println("子类");
    }

    //过时的一个方法
    @Deprecated
    public void method() {
        System.out.println("过时的方法");
    }

    @SuppressWarnings(value = "all")
    public void function(){
        int a = 10;
        int b = 20;

    }

}
