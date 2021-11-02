package com.yjl.primary.day07_Collection;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author yujiale
 * @Classname ArrayListDemoStudentManager
 * @Description TODO
 * @Date 2021/8/22 上午11:32
 * @Created by yujiale
 */
public class ArrayListDemoStudentManager {

    public static class Student {
        private String sid;
        private String name;
        private String age;
        private String address;

        public Student() {

        }

        public Student(String sid, String name, String age, String address) {
            this.sid = sid;
            this.name = name;
            this.age = age;
            this.address = address;
        }

        public String getSid() {
            return sid;
        }

        public void setSid(String sid) {
            this.sid = sid;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getAge() {
            return age;
        }

        public void setAge(String age) {
            this.age = age;
        }

        public String getAddress() {
            return address;
        }

        public void setAddress(String address) {
            this.address = address;
        }
    }

    public static void main(String[] args) {
        ArrayList<Student> studentArrayList = new ArrayList<>();
        while (true) {

            System.out.println("-----欢迎来到学生管理系统-----");
            System.out.println("1。添加学生");
            System.out.println("2。删除学生");
            System.out.println("3。修改学生");
            System.out.println("4。查询所有学生");
            System.out.println("5。退出");
            System.out.println("请输入你的选择");
            Scanner scanner = new Scanner(System.in);
            String s = scanner.nextLine();
            switch (s) {
                case "1":
                    addStudent(studentArrayList);
                    break;
                case "2":
                    deleteStudent(studentArrayList);
                    break;
                case "3":
                    updateStudent(studentArrayList);
                    break;
                case "4":
                    findAllStudents(studentArrayList);
                    break;
                case "5":
                    System.out.println("谢谢使用");
                    //java虚拟机的退出
                    System.exit(0);
            }

        }

    }

    static void addStudent(ArrayList<Student> array) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入学号");
        String sid = scanner.nextLine();
        for (int i = 0; i < array.size(); i++) {
            if (array.get(i).getSid().equals(sid)) {
                System.out.println("学号已存在,请重新输入学号");
                sid = scanner.nextLine();
            }
        }
        System.out.println("请输入姓名");
        String name = scanner.nextLine();
        System.out.println("请输入年龄");
        String age = scanner.nextLine();
        System.out.println("请输入地址");
        String address = scanner.nextLine();
        Student student = new Student();
        student.setSid(sid);
        student.setName(name);
        student.setAge(age);
        student.setAddress(address);

        array.add(student);
        System.out.println("添加成功");
    }

    static void findAllStudents(ArrayList<Student> array) {
        if (array.size() == 0) {
            System.out.println("当前系统没有学生，请先添加");
            return;
        }
        System.out.println("学号\t\t\t\t姓名\t\t\t\t年龄\t\t\t\t居住地");
        for (int i = 0; i < array.size(); i++) {
            Student student = array.get(i);
            System.out.println(student.getSid() + "\t" + student.getName() + "\t" + student.getAge() + "岁" + "\t" +
                    student.getAddress());
        }
    }

    static void deleteStudent(ArrayList<Student> array) {
        if (array.size() == 0) {
            System.out.println("当前系统没有学生，请先添加");
            return;
        }
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入需要删除的学生学号");
        String s = scanner.nextLine();
        for (int i = 0; i < array.size(); i++) {
            if (array.get(i).getSid().equals(s)) {
                array.remove(i);
                System.out.println("删除成功");
            } else {
                System.out.println("输入的学生不存在");
            }
        }
    }

    static void updateStudent(ArrayList<Student> array) {
        if (array.size() == 0) {
            System.out.println("当前系统没有学生，请先添加");
            return;
        }
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入需要修改的学生学号");
        String s = scanner.nextLine();
        for (int i = 0; i < array.size(); i++) {
            if (array.get(i).getSid().equals(s)) {
                System.out.println("请输入学号");
                String sid = scanner.nextLine();
                System.out.println("请输入姓名");
                String name = scanner.nextLine();
                System.out.println("请输入年龄");
                String age = scanner.nextLine();
                System.out.println("请输入地址");
                String address = scanner.nextLine();
                Student student = new Student();
                student.setSid(sid);
                student.setName(name);
                student.setAge(age);
                student.setAddress(address);
                array.remove(i);
                array.add(i, student);
                System.out.println("修改成功");
            } else {
                System.out.println("输入的学生不存在");
            }
        }
    }
}
