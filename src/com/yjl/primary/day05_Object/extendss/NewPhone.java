package com.yjl.primary.day05_Object.extendss;

/**
 * @author yujiale
 * @Classname New
 * @Description TOO
 * @Date 2021/9/1 下午10:28
 * @Created by yujiale
 */
public class NewPhone extends Phone {

    @Override
    public void call(String name){
        System.out.println("开启视频功能");
        System.out.println("新手机给"+name+"打电话");
    }
}
