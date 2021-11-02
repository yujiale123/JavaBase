package com.yjl.primary.day06_ApiAndEx.api;

/**
 * @author yujiale
 * @Classname JavaApi
 * @Description TODO
 * @Date 2021/8/22 下午2:37
 * @Created by yujiale
 */
public class JavaApi {
    public static void main(String[] args) {
        systemApi();
    }

    /**
     * math方法（执行基本数字运行）
     * abs：返回参数的绝对值
     * ceil：返回大于或等于参数的最小double值（等于一个整数）
     * floor：返回小于或等于参数的最大double值（等于一个整数）
     * round：按照四舍五入返回最接近参数int的值
     * max：返回最大的值
     * min：返回最小的值
     * pow：返回a的b次冥等值
     * random（）：返回double的正值
     */
    static void mathApi() {

        int abs = Math.abs(-4);
        System.out.println(abs);
        double ceil = Math.ceil(1.87);
        System.out.println(ceil);
        double floor = Math.floor(2.45);
        System.out.println(floor);
        long round = Math.round(9.2);
        System.out.println(round);
        int max = Math.max(1, 4);
        System.out.println(max);
        int min = Math.min(1, 5);
        System.out.println(min);
        double pow = Math.pow(0.2, 0.45);
        System.out.println(pow);
        double random = Math.random();
        System.out.println(random);
    }

    /**
     * systemApi问题
     * <p>
     * public static void exit(int status) :终止当前运行的java虚拟机，非0标识异常终止
     * public static long currentTimeMillis() :返回当前时间（以毫秒为单位）
     */
    static void systemApi() {
        System.out.println("开始");
        long l = System.currentTimeMillis();
        System.out.println(l);
        System.exit(0);
        System.out.println("结束");
    }

    /**
     * Object是类层次结构的根，每个类都可以将Obejct作为超类，都能直接或者简介的继承obejct类
     * <p>
     * public static void equals(String o):判断字符串是否相等
     */
    static void objectApi() {

    }
}
