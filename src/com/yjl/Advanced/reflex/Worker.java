package com.yjl.Advanced.reflex;

/**
 * @author yujiale
 * @Classname Worker
 * @Description TOO
 * @Date 2021/9/8 下午9:34
 * @Created by yujiale
 */
public class Worker {
    private Integer age;
    private String name;

    public Worker() {
    }

    public Worker(Integer age, String name) {
        this.age = age;
        this.name = name;
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

    private void work(){
        System.out.println("工人在工作");
    }
    @Override
    public String toString() {
        return "Worker{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
