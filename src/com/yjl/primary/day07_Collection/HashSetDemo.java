package com.yjl.primary.day07_Collection;

import java.util.HashSet;

/**
 * @author yujiale
 * @Classname HashSetDemo
 * @Description TODO
 * @Date 2021/8/25 下午8:46
 * @Created by yujiale
 */
public class HashSetDemo {
    public static void main(String[] args) {
        HashSetTest02();
    }

    /**
     * hashSet底层数据结构是哈希表，对集合的迭代顺序不做任何保证，（不确保存储和取出顺序一致）
     * 没有带索引的方法，不能使用普通for循环遍历
     * 不包含重复元素
     */
    static void HashSetTest01() {
        HashSet<Object> set = new HashSet<>();

    }

    /**
     * ：创建一个存储学生对象的集合，存储多个学生对象，使用程序实现在控制台遍历该集合
     * 要求：学生对象的成员变量值相同，我们就认为是同一个对象
     */
    static void HashSetTest02() {
        class Student {
            private String name;
            private int age;

            public Student() {
            }

            public Student(String name, int age) {
                this.name = name;
                this.age = age;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public int getAge() {
                return age;
            }

            public void setAge(int age) {
                this.age = age;
            }

            @Override
            public String toString() {
                return "Student{" +
                        "name='" + name + '\'' +
                        ", age=" + age +
                        '}';
            }
            @Override
            public boolean equals(Object o) {
                if (this == o) {
                    return true;
                }
                if (o == null || getClass() != o.getClass()) {
                    return false;
                }

                Student student = (Student) o;

                if (age != student.age) {
                    return false;
                }
                return name != null ? name.equals(student.name) : student.name == null;
            }

            @Override
            public int hashCode() {
                int result = name != null ? name.hashCode() : 0;
                result = 31 * result + age;
                return result;
            }
        }

        Student student = new Student();
        student.setAge(124);
        student.setName("张三");
        HashSet<Student> hashSet = new HashSet<>();
        hashSet.add(student);
        Student student1 = new Student("李四", 123);
        Student student2 = new Student("李四", 123);
        hashSet.add(student1);
        hashSet.add(student2);
        System.out.println(hashSet.size());
        for (Student s : hashSet) {
            System.out.println(s.toString());
        }
    }
}
