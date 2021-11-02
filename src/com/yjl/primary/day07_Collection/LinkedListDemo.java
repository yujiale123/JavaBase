package com.yjl.primary.day07_Collection;

import java.util.LinkedList;

/**
 * @author yujiale
 * @Classname LinkedListDemo
 * @Description TODO
 * @Date 2021/8/24 下午6:28
 * @Created by yujiale
 */
public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedListTest01();
    }

    /**
     * LinkedList常用方法：
     *   public void addFirst​(E e)：在链表开头插入指定的元素
     *   public void addLast​(E e)：将指定元素追加到此列表的末尾
     *   public E getFirst​()：获取链表的第一个元素
     *   public E getLast​()：获取链表的最后一个元素
     *   public E removeFirst​()：移除链表第一个元素
     *   public E removeLast​()：移除链表最后一个元素
     */
    static void LinkedListTest01(){

        LinkedList<Object> linkedList = new LinkedList<>();
        linkedList.add("12312");
        linkedList.add("154342312");
        linkedList.add("123434312");
        linkedList.addFirst("张三");
        linkedList.addLast("李四");
        System.out.println(linkedList);
        System.out.println(linkedList.getFirst());
        System.out.println(linkedList.getLast());
        linkedList.removeFirst();
        System.out.println(linkedList);
        linkedList.removeLast();
        System.out.println(linkedList);




    }
}
