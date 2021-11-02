package com.yjl.primary.day07_Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

/**
 * @author yujiale
 * @Classname ListDemo
 * @Description TODO
 * @Date 2021/8/23 下午9:42
 * @Created by yujiale
 *
 * List集合常用子类：ArrayList，LinkedList
 * ArrayList：底层数据结构是数组，查询快，增删慢
 * LinkedList：底层数据结构是双向链表，查询慢，增删快
 */
public class ListDemo {

    public static void main(String[] args) {
        ListTest05();
    }

    /**
     * List的特点：
     * 有序：存储和取出的元素顺序一直
     * 可重复：存储的元素可以重复
     */
    static void ListTest01() {


        ArrayList<String> list = new ArrayList<>();
        list.add("123");
        list.add("1234");
        list.add("12345");
        list.add("123");
        System.out.println(list);
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    /**
     * list特有方法
     * add（int index,E element):在集合的指定位置插入指定元素
     * remove(int index):删除指定索引出的元素，返回被删除的元素
     * set（int index,E element)：修改指定索引出的元素，返回被删除的元素
     * get  ：返回指定索引处的元素
     */
    static void ListTest02() {
        ArrayList<Object> list = new ArrayList<>();
        list.add(0, 132);
        list.add(1, 123);
        list.add(2, 213);
        System.out.println(list);
        list.remove(0);
        System.out.println(list);
        list.set(1, 111);
        System.out.println(list);
        System.out.println(list.get(0));
    }

    static void ListTest03() {
        class Student {
            private String user;
            private Integer age;

            public Student() {

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
        Student s1 = new Student("zhangsan", 123);
        Student s2 = new Student("zhangsan1", 1123);
        Student s3 = new Student("zhangsan1", 1213);
        studentArrayList.add(s1);
        studentArrayList.add(s2);
        studentArrayList.add(s3);
        //迭代器进行遍历
        // Iterator<Student> iterator = studentArrayList.iterator();
        // while (iterator.hasNext()) {
        //     System.out.println(iterator.next().toString());
        // }
        //for循环进行操作
        for (int i = 0; i < studentArrayList.size(); i++) {
            Student student = studentArrayList.get(i);
            System.out.println(student.toString());
        }
    }

    /**
     * ListIterator(列表迭代器）
     * 常用方法：
     * E next()：返回迭代中的下一个元素
     * boolean hasNext()：如果迭代具有更多元素，则返回 true
     * add（E e）：将指定元素插入列表
     * hasPrevious（）：如果以逆向遍历列表，列表迭代器前面有元素，则返回true，否则为false
     * nextIndex（）：返回列表中ListIterator所需位置后面元素的索引
     * previous（）：返回列表中ListIterator指向位置前面的元素
     * previousIndex（）：返回列表中ListIterator所需位置前面元素的索引
     */
    static void ListTest04() {
        ArrayList<Object> list = new ArrayList<>();
        list.add("123");
        list.add("14");
        list.add("15");
        list.add("12513");
        list.add("1211513");
        list.add("12663");
        list.add("12113");
        System.out.println(list);
        ListIterator<Object> listIterator = list.listIterator();
        System.out.println("从前往后输出：");
        while (listIterator.hasNext()) {
            System.out.println("next:" + listIterator.next());

        }
        //返回最后一位元素的后一位元素索引
        System.out.println(listIterator.nextIndex());
        System.out.println("从后往前输出");
        listIterator.add("12312312312");
        while (listIterator.hasPrevious()) {
            System.out.println("previous:" + listIterator.previous());

        }
        //返回最前面的前一位元素索引
        System.out.println(listIterator.previousIndex());
    }


    /**
     * 增强for循环
     * <p>
     * for（int i : list){
     * System.out.println(i);
     * }
     */
    static void ListTest05() {
        ArrayList<Object> list = new ArrayList<>();
        list.add("123");
        list.add("1231234");
        list.add("123124");
        list.add("441241");
        System.out.println(list);
        for (Object i : list) {
            System.out.println(i);
        }
    }
}
