package com.yjl.primary.day07_Collection;

import java.util.Comparator;
import java.util.TreeSet;

/**
 * @author yujiale
 * @Classname TreeSet
 * @Description TOO
 * @Date 2021/9/3 下午2:53
 * @Created by yujiale
 */
public class TreeSetDemo {
    public static void main(String[] args) {
        TreeSetTest03();
    }

    /**
     * 特点
     * 元素有序，这里的顺序不是指存储和取出的顺序，而是按照一定的规则进行排序，具体排序方式取决于构造方法
     * TreeSet()：根据其元素的自然排序进行排序
     * TreeSet(Comparator comparator) ：根据指定的比较器进行排序
     * 没有带索引的方法，所以不能使用普通for循环遍历
     * 由于是Set集合，所以不包含重复元素的集合
     */
    static void TreeSetTest01() {
        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.add(10);
        treeSet.add(50);
        treeSet.add(30);
        treeSet.add(20);
        treeSet.add(60);
        treeSet.add(70);
        treeSet.add(70);
        for (Integer i : treeSet) {
            System.out.println(i);
        }
    }

    /**
     * Comparable（自然排序）
     * 用TreeSet集合存储自定义对象，无参构造方法使用的是自然排序对元素进行排序的
     * 自然排序，就是让元素所属的类实现Comparable接口，重写compareTo(T o)方法重
     * 写方法时，一定要注意排序规则必须按照要求的主要条件和次要条件来写
     * 学生排序日志
     */
    static void TreeSetTest02() {
        class Student implements Comparable<Student> {
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
            public int compareTo(Student o) {
                //按照年龄从小打到排序  主要条件
                int i = this.age - o.age;
                //年龄相同时，比较名字是否相等，不相同则添加  次要条件
                int i1 = i == 0 ? this.name.compareTo(o.name) : i;
                return i1;
            }
        }
        TreeSet<Student> treeSet = new TreeSet<>();
        Student student = new Student("张三", 12);
        Student student1 = new Student("李四", 20);
        Student student2 = new Student("王武", 34);
        Student student5 = new Student("123", 34);
        Student student3 = new Student("赵六", 11);
        Student student4 = new Student("钱七", 18);
        treeSet.add(student);
        treeSet.add(student1);
        treeSet.add(student2);
        treeSet.add(student3);
        treeSet.add(student4);
        treeSet.add(student5);
        for (Student s : treeSet) {
            System.out.println(s.toString());
        }
    }

    /**
     * Comparator(比较器排序）
     * 用TreeSet集合存储自定义对象，带参构造方法使用的是比较器排序对元素进行排序的
     * 比较器排序，就是让集合构造方法接收Comparator的实现类对象，重写compare(T o1,T o2)方法
     * 重写方法时，一定要注意排序规则必须按照要求的主要条件和次要条件来写
     */
    static void TreeSetTest03() {
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
        }
        TreeSet<Student> students = new TreeSet<>(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                //o1表示现在要存入的那个元素
                //o2表示已经存入到集合中的元素
                //主要条件
                int i = o1.getAge() - o2.getAge();
                //次要条件
                i = i == 0 ? o1.getName().compareTo(o2.getName()) : i;
                return i;
            }
        });

        Student student1 = new Student("张三", 12);
        Student student2 = new Student("张三1", 12);
        Student student3 = new Student("张三2", 12);
        Student student4 = new Student("张三3", 12);
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        System.out.println(students);

    }
}
