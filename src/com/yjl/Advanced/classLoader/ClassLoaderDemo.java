package com.yjl.Advanced.classLoader;

/**
 * @author yujiale
 * @Classname ClassLoaderDemo
 * @Description TOO
 * @Date 2021/9/8 上午8:17
 * @Created by yujiale
 */
public class ClassLoaderDemo {
    public static void main(String[] args) {


    }

    public static void ClassLoaderTest01(){
        //获取系统类加载器
        ClassLoader systemClassLoader = ClassLoader.getSystemClassLoader();
        //获取系统类加载器的父加载器--平台加载器
        ClassLoader parent = systemClassLoader.getParent();
        //获取平台加载器的父加载器--启动类加载器
        ClassLoader parentParent = parent.getParent();
    }
}
