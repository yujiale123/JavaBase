package com.yjl.primary.day07_Collection;

import java.util.ArrayList;
import java.util.HashSet;

/**
 * @author yujiale
 * @Classname SetDemo
 * @Description TODO
 * @Date 2021/8/24 下午6:42
 * @Created by yujiale
 */
public class SetDemo {
    public static void main(String[] args) {
        SetTest01();
    }

    /**
     * Set集合特点：
     * 元素不可重复
     * 只允许只有一个空值
     * 没有带索引的方法，所以不能使用for循环遍历
     * <p>
     * 存储字符串并遍历
     */
    static void SetTest01() {
        HashSet<Object> set = new HashSet<>();
        set.add("123");
        set.add("11");
        set.add("1234");
        set.add("123");
        System.out.println(set);
        for (Object i : set) {
            System.out.println(i);
        }
    }

    /**
     * 哈希值hashCode
     *  hashCode是JDK根据对象的地址或者字符串或者数字算出来的int数字
     *      Object中有一个方法可以获取对象的hashCode
     *          public int hashCode():返回对象的hashCode
     *
     *      对象的hashCode的特点
     *          同一个对象多次调用hashCode返回返回的哈希值是相同的
     *          默认情况下，不同对象的哈希值是不同的，如果重写hashCode方法可以实现让不同对象的哈希值相同
     */
    static void SetTest02(){
        ArrayList<Object> list = new ArrayList<>();
        list.add("123");
        System.out.println(list.hashCode());
        list.add("123123");
        System.out.println(list.hashCode());
    }


}
