package com.yjl.Advanced.reflex;

/**
 * @author yujiale
 * @Classname Student
 * @Description TOO
 * @Date 2021/9/8 下午9:35
 * @Created by yujiale
 */
public class Student {
    private Integer age;
    private String name;
    public String address;

    private Student(String name){
        System.out.println("name的值为"+name);
        System.out.println("private。。。Student。。。有参构造方法");
    }

    public Student() {
        System.out.println("public。。。Student。。。无参构造方法");
    }

    public Student(Integer age, String name) {
        this.age = age;
        this.name = name;
        System.out.println("name的值为"+name+"，age的值为"+age);
        System.out.println("public。。。Student。。。有参构造方法");
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private void study(){
        System.out.println("学生在读书");
    }

    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
