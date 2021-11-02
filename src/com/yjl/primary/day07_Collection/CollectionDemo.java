package com.yjl.primary.day07_Collection;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author yujiale
 * @Classname CollectionDemo
 * @Description TODO
 * @Date 2021/8/23 上午8:41
 * @Created by yujiale
 *
 * Collection概述：
 *      是单例集合的顶层接口，他表示一组对象。
 *      JDK不提供此接口的任何直接实现，它提供更具体的字接口（如Set和List）
 *
 *      Iterator：迭代器，集合的专用遍历方式
 *          Iterator<E> iterator()：返回此集合中元素的迭代器，通过集合的iterator()方法得到
 *          迭代器是通过集合的iterator()方法得到的，所以我们说它是依赖于集合而存在的
 *
 *         Iterator中的常用方法
 *         E next()：返回迭代中的下一个元素
 *         boolean hasNext()：如果迭代具有更多元素，则返回 true
 */
public class CollectionDemo {
    public static void main(String[] args) {
        CollectionTest04();
    }

    /**
     * Collection是单列集合，包括List和Set集合
     * Map是双列集合
     * List包含ArrayList、LinkedList
     * Set包含HashSet、TreeSet
     * Map是HashMap
     */
    static void CollectionTest01() {

        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("123");
        arrayList.add("44");
        arrayList.add("15");
        arrayList.add("515");
        arrayList.add("1515");
        System.out.println(arrayList);
    }

    /**
     * add():添加元素
     * remove：从集合中移除指定的元素
     * clear：清空集合的元素
     * contains：判断集合中是否存在指定元素
     * isEmpty：判断集合是否为空
     * int size：获取集合的长度（个数）
     */
    static void CollectionTest02() {
        ArrayList<Object> arrayList = new ArrayList<>();
        arrayList.add("111");
        arrayList.add("112");
        arrayList.add("113");
        arrayList.add("114");
        arrayList.add("115");
        System.out.println(arrayList);
        arrayList.remove(3);
        System.out.println(arrayList);
        boolean contains = arrayList.contains(111);
        System.out.println(contains);
        boolean empty = arrayList.isEmpty();
        System.out.println(empty);
        System.out.println(arrayList.size());
        arrayList.clear();
        System.out.println(arrayList);
    }

    /**
     * 集合的遍历
     * iterator迭代器
     */
    static void CollectionTest03(){
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("111");
        arrayList.add("112");
        arrayList.add("113");
        arrayList.add("114");
        arrayList.add("115");
        Iterator<String> iterator = arrayList.iterator();
        System.out.println(iterator.next());
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
   static void CollectionTest04(){
        class Student{
            private String user;
            private Integer age;
            public  Student(){

            }

            public Student(String user, Integer age) {
                this.user = user;
                this.age = age;
            }

            public String getUser() {
                return user;
            }

            public void setUser(String user) {
                this.user = user;
            }

            public Integer getAge() {
                return age;
            }

            public void setAge(Integer age) {
                this.age = age;
            }

            @Override
            public String toString() {
                return "Student{" +
                        "user='" + user + '\'' +
                        ", age=" + age +
                        '}';
            }
        }
       ArrayList<Student> studentArrayList = new ArrayList<>();
       Student student = new Student();
       student.setUser("张三");
       student.setAge(14);
       studentArrayList.add(student);
       student.setUser("张三");
       student.setAge(15);
       studentArrayList.add(student);
       student.setUser("张三");
       student.setAge(16);
       studentArrayList.add(student);
       Iterator<Student> iterator = studentArrayList.iterator();
       while (iterator.hasNext()){
           System.out.println(iterator.next().toString());
       }
   }
}
