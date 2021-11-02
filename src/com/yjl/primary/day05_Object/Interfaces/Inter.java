package com.yjl.primary.day05_Object.Interfaces;

/**
 * @author yujiale
 * @Classname Inter
 * @Description TOO
 * @Date 2021/9/2 下午5:26
 * @Created by yujiale
 */
public interface Inter {
    public int num = 10;
    public final int num1 = 20;
    /**
     * 默认变量格式
     */
    public static final int NUM3 = 30;

    /**
     * 接口方法标准格式
     */
    public  abstract void show1();
    void show();
}
