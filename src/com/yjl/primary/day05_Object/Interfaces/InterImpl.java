package com.yjl.primary.day05_Object.Interfaces;

/**
 * @author yujiale
 * @Classname InterImpl
 * @Description TOO
 * @Date 2021/9/2 下午5:27
 * @Created by yujiale
 */
public class InterImpl extends Object implements Inter {
    public InterImpl() {
        super();
    }

    @Override
    public void show1() {
        System.out.println("show1");
    }

    @Override
    public void show() {
        System.out.println("show");
    }
}
