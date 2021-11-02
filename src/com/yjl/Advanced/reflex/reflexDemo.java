package com.yjl.Advanced.reflex;

import java.io.IOException;
import java.lang.annotation.ElementType;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @author yujiale
 * @Classname reflexDemo
 * @Description TOO
 * @Date 2021/9/8 下午9:30
 * @Created by yujiale
 */
public class reflexDemo {
    public static void main(String[] args) throws IOException, ClassNotFoundException, NoSuchMethodException,
            IllegalAccessException, InvocationTargetException, InstantiationException, NoSuchFieldException {

        ReflexTest08();
    }

    /**
     * 反射获取class对象
     * @throws ClassNotFoundException
     */
    public static void ReflexTest01() throws ClassNotFoundException {
        //1.Class类中静态方法forName（"全类名"）
        Class<?> aClass = Class.forName("basic.reflex.Student");
        System.out.println(aClass);

        //2。通过class属性来获取
        Class<Student> studentClass = Student.class;
        System.out.println(studentClass);

        //3.利用对象的getClass方法来获得对象
        Student student = new Student();
        Class<? extends Student> aClass1 = student.getClass();
        System.out.println(aClass1);
        //4。通过类型来获取对象通过类名.Type
        Class<Integer> type = Integer.TYPE;
        System.out.println(type);
        //5.对象.getSuperclass()
        Class<?> superclass = aClass1.getSuperclass();
        System.out.println(superclass);

    }


    /**
     * 反射获取构造方法
     *     Constructor<?>[] getConstructors()：返回所有公共构造方法对象的数组
     *     Constructor<?>[] getDeclaredConstructors()：返回所有构造方法对象的数组
     *     Constructor<T> getConstructor(Class<?>... parameterTypes)：返回单个公共构造方法对象
     *     Constructor<T> getDeclaredConstructor(Class<?>... parameterTypes)：返回单个构造方法对象
     * @throws NoSuchMethodException
     * @throws IllegalAccessException
     * @throws InvocationTargetException
     * @throws InstantiationException
     * @throws ClassNotFoundException
     */
    public static void ReflexTest02() throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException, ClassNotFoundException {
        Class<Student> studentClass = Student.class;
        //getConstructors是返回所有的公共构造方法对象的数组
        System.out.println("getConstructors用法");
        Constructor<?>[] constructors = studentClass.getConstructors();
        for (Constructor constructor:constructors){
            System.out.println(constructor);
        }
        //getDeclaredConstructors是返回所有的私有和公共的方法对象的数组
        System.out.println("getDeclaredConstructors用法");
        Constructor<?>[] declaredConstructors = studentClass.getDeclaredConstructors();
        for (Constructor c :declaredConstructors){
            System.out.println(declaredConstructors);
        }
        System.out.println("getConstructor单个用法");
        //小括号中一定要跟构造方法的行参保持一致
        //getConstructor是返回单个公共构造方法对象
        Constructor<Student> constructor = studentClass.getConstructor();
        System.out.println(constructor);
        System.out.println("getDeclaredConstructor单个用法");
        //getDeclaredConstructor返回单个构造方法对象
        Constructor<Student> declaredConstructor = studentClass.getDeclaredConstructor();
        System.out.println(declaredConstructor);
    }


    /**
     * 反射获取构造方法并使用Constructor类中用于创建对象的方法
     * T newInstance(Object... initargs)：根据指定的构造方法创建对象
     * @throws ClassNotFoundException
     * @throws IllegalAccessException
     * @throws InvocationTargetException
     * @throws InstantiationException
     * @throws NoSuchMethodException
     */
    public static void ReflexTest03() throws ClassNotFoundException, IllegalAccessException, InvocationTargetException, InstantiationException, NoSuchMethodException {
        Class<?> aClass = Class.forName("basic.reflex.Student");
        /**
         * 简写模式
         */
        Student s = (Student) aClass.newInstance();
        System.out.println(s);
        /**
         * 正常模式
         */
        Constructor<?> constructor = aClass.getConstructor(Integer.class, String.class);
        Student student = (Student) constructor.newInstance( 12,"zhangsna");
        System.out.println(student);
    }


    /**
     * 反射获取私有的构造方法并创建对象
     * @throws NoSuchMethodException
     * @throws IllegalAccessException
     * @throws InvocationTargetException
     * @throws InstantiationException
     */
    public static void ReflexTest04() throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Class<Student> studentClass = Student.class;
        Constructor<Student> declaredConstructor = studentClass.getDeclaredConstructor(String.class);
        //被人private修饰的成员，不能直接使用，
        //如果用反射强行获取并使用，需要临时取消访问检查 setAccessible是否临时取消访问检查
        declaredConstructor.setAccessible(true);
        Student student = declaredConstructor.newInstance("张三");
        System.out.println(student);
    }

    /**
     * 反射获取成员变量
     *     Field[] getFields()：返回所有公共成员变量对象的数组
     *     Field[] getDeclaredFields()：返回所有成员变量对象的数组
     *     Field getField(String name)：返回单个公共成员变量对象
     *     Field getDeclaredField(String name)：返回单个成员变量对象
     * @throws NoSuchFieldException
     */
    public static void ReflexTest05() throws NoSuchFieldException {
        Class<Student> studentClass = Student.class;
        System.out.println("返回所有公共成员变量对象的数组");
        Field[] fields = studentClass.getFields();
        for (Field f :fields){
            System.out.println(f);
        }

        System.out.println("返回所有成员变量对象的数组");
        Field[] declaredFields = studentClass.getDeclaredFields();
        for (Field f :declaredFields){
            System.out.println(f);
        }
        System.out.println("返回单个公共成员变量对象");
        Field field = studentClass.getField("address");
        System.out.println(field);
        System.out.println("返回单个成员变量对象");
        Field declaredField = studentClass.getDeclaredField("address");
        System.out.println(declaredField);
    }

    /**
     * 反射获取成员变量并使用
     *     void set：给指定对象的成员变量赋值
     *         1.先获取单个成员变量
     *         2.创建对应的对象
     *         3.给指定对象进行赋值
     *     Obejct get：返回指定对象的fidle的值
     *         具体步骤一致
     * @throws NoSuchFieldException
     * @throws IllegalAccessException
     * @throws InstantiationException
     */
    public static void ReflexTest06() throws NoSuchFieldException, IllegalAccessException, InstantiationException {
        Class<Student> studentClass = Student.class;
        //2。获取address这个field的对象
        Field address = studentClass.getField("address");
        //3。利用set方法进行赋值
        //3。1创建一个Student对象
        Student student = studentClass.newInstance();
        //3。2有了对象才可以给指定对象进行赋值
        address.set(student,"湖北");
        System.out.println(student);
        Field name = studentClass.getDeclaredField("name");
        name.setAccessible(true);
        Object o = name.get(student);
        System.out.println(o);
    }

    /**
     * 获取反射的扩展方法：所有类型的class
     *
     */
    public static void ReflexTest07(){
        //类 class java.lang.Object
        Class c1 = Object.class;
        //接口 interface java.lang.Comparable
        Class c2 = Comparable.class;
        //一维数组 class java.lang.String;
        Class c3 = String[].class;
        //二维数组 class [I]
        Class c4 = int[][].class;
        //注解 interface java.lang.Override
        Class c5 = Override.class;
        //枚举 class java.lang.annotation.ElementType
        Class c6 = ElementType.class;
        //基本数据类型 class java.lang.annotation.ElementType
        Class c7 = Integer.class;
        //void void
        Class c8 = void.class;
        //Class class java.lang.Class
        Class c9 = Class.class;

        //Alt + 左键：全选后复制粘贴
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
        System.out.println(c4);
        System.out.println(c5);
        System.out.println(c6);
        System.out.println(c7);
        System.out.println(c8);
        System.out.println(c9);

        //只要元素类型与唯独一样，就是同一个Class
        int[] a = new int[10];
        int[] b = new int[100];
        System.out.println(a.getClass().hashCode());
        System.out.println(b.getClass().hashCode());
    }

    /**
     * 比较两种方法的区别
     * 普通方法和反射调用方法
     */
    public static void ReflexTest08() throws NoSuchMethodException {
        test01();
        test02();
        test3();
    }

    public static void test01(){

        Student student = new Student();

        //获取当前系统时间
        long startTime = System.currentTimeMillis();
        for (int i=0; i<2000000000; i++){
            student.getName();
        }
        long endTime = System.currentTimeMillis();
        System.out.println("普通方式调用所需时间："+(endTime-startTime)+"ms");
    }

    public static void test02() throws NoSuchMethodException {
        Student student = new Student();
        Class c = student.getClass();

        Method getName = c.getDeclaredMethod("getName",null);
        //获取当前系统时间
        long startTime = System.currentTimeMillis();
        for (int i=0; i<2000000000; i++){
            getName.getName();
        }
        long endTime = System.currentTimeMillis();
        System.out.println("普通方式调用所需时间："+(endTime-startTime)+"ms");
    }

    public static void test3() throws NoSuchMethodException {
        Student student = new Student();
        Class c = student.getClass();
        Method getName = c.getDeclaredMethod("getName",null);
        //获取当前系统时间
        long startTime = System.currentTimeMillis();
        getName.setAccessible(true);//关闭安全检测
        for (int i=0; i<2000000000; i++){
            getName.getName();
        }
        long endTime = System.currentTimeMillis();
        System.out.println("普通方式调用所需时间："+(endTime-startTime)+"ms");
    }
}
