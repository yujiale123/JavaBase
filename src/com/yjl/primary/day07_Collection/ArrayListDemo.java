package com.yjl.primary.day07_Collection;

import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Scanner;

/**
 * @author yujiale
 * @Classname ArrayListDemo
 * @Description TODO
 * @Date 2021/8/22 上午10:41
 * @Created by yujiale
 */
public class ArrayListDemo {

    public static void main(String[] args) {
        arrayListTest03();
    }

    /**
     * arrayList构造方法
     * public ArrayList（）
     * arraylist的添加方法
     * public boolean add（E e）：将指定元素添加到末尾集合
     * public void add（int index，E e）：将指定元素插入到指定位置
     */
    static void arrayListDemo01() {
        ArrayList<String> strings = new ArrayList<>();
        strings.add("hello");
        strings.add("java");
        strings.add("C++");
        System.out.println(strings);
        strings.add(1, "py");
        System.out.println(strings);
    }

    /**
     * 遍历string，并使用add（），remove（）、set（）、size（）方法
     */
    static void arrayListTest01() {
        ArrayList<String> strings = new ArrayList<>();
        strings.add("java");
        strings.add("c++");
        strings.add("c语言");
        strings.add("py");
        strings.add("pys");
        for (int i = 0; i < strings.size(); i++) {
            System.out.println(strings.get(i));
        }
        strings.remove("java");
        strings.remove("py");
        strings.remove(1);
        System.out.println(strings);
        strings.set(0, "py");
        strings.set(1, "java");
        System.out.println(strings);
        System.out.println(strings.size());
    }

    /**
     * 创建学生对象并遍历学生对象
     */
    static void arrayListTest02() {
        class Student {
            private String userName;
            private Integer age;

            public Student() {
            }

            public Student(String userName, Integer age) {
                this.userName = userName;
                this.age = age;
            }


            public String getUserName() {
                return userName;
            }

            public void setUserName(String userName) {
                this.userName = userName;
            }

            public Integer getAge() {
                return age;
            }

            public void setAge(Integer age) {
                this.age = age;
            }
        }

        ArrayList<Student> students = new ArrayList<>();
        Student s1 = new Student("张三", 16);
        Student s2 = new Student("lisi", 17);
        Student s3 = new Student("wangwu", 18);
        students.add(s1);
        students.add(s2);
        students.add(s3);
        for (int i = 0; i < students.size(); i++) {
            System.out.println(students.get(i).getUserName() + students.get(i).getAge());
        }
    }

    /**
     * 键盘输入学生对象并遍历
     */
    static void arrayListTest03() {
        class Student {
            private String userName;
            private String age;

            public Student() {
            }

            public Student(String userName, String age) {
                this.userName = userName;
                this.age = age;
            }


            public String getUserName() {
                return userName;
            }

            public void setUserName(String userName) {
                this.userName = userName;
            }

            public String getAge() {
                return age;
            }

            public void setAge(String age) {
                this.age = age;
            }
        }

        ArrayList<Student> students = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("请输入学生姓名");
            String user = scanner.nextLine();
            System.out.println("请输入学生年龄");
            String age = scanner.nextLine();
            Student student = new Student();
            student.setUserName(user);
            student.setAge(age);
            students.add(student);
        }
        //普通for循环
        System.out.println(students);
        for (int i = 0; i < students.size(); i++) {
            System.out.println(students.get(i).getUserName()+","+students.get(i).getAge());
        }
        System.out.println("迭代器运行");
        ListIterator<Student> listIterator = students.listIterator();
        while (listIterator.hasNext()){
            System.out.println(listIterator.next());
        }
        System.out.println("增强for循环");
        for(Student s : students){
            System.out.println(s.getUserName()+","+s.getAge());
        }

    }




}
