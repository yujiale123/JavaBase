package com.yjl.primary.day06_ApiAndEx.abnormal;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author yujiale
 * @Classname ThrowableDemo
 * @Description TODO
 * @Date 2021/8/22 下午10:47
 * @Created by yujiale
 * <p>
 * throwable相关的成员方法
 * getMessage（）：返回此throwable的详细消息字符串
 * toString（）；返回此可抛出的简短描述
 * printStackTrace（）：把异常的错误信息输出在控制台中
 *
 *  throws和throw的区别
 *   throws：
 *        用在方法声明后，跟的是异常类名
 *        表示抛出异常，由该方法的调用者来处理
 *        表示出现异常的一种可能性，并不一定会发生这些异常
 *   throw：
 *        用在方法体内，跟的是异常对象的名
 *        表示抛出异常，由方法体内的语句处理
 *        执行throw一定抛出异常
 */
public class ThrowableDemo {
    public static void main(String[] args) {
        ThrowableTest01();
    }

    static void ThrowableTest01() {
        try {
            int[] arr = {1, 2, 3};
            System.out.println(arr[4]);
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
            System.out.println(e.toString());

        }
    }

    /**
     * 编译时异常和运行时异常
     * 所有的RuntimeException类及其子类的实例都是运行时异常，其他的都是编译时异常
     * 运行时异常：无需显示处理，处理方法于编译时异常方法想通过
     * 编译时异常：必须显示处理，否则程序会发生错误无法编译运行
     */
    static void ThrowableTest02() throws ParseException {
        //编译时异常
        String s = "2048-08-09";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date parse = simpleDateFormat.parse(s);
        System.out.println(parse);
        //运行时异常
        int[] arr = {1, 2, 3};
        System.out.println(arr[4]);
    }
}
