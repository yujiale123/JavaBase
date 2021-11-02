package com.yjl.primary.day06_ApiAndEx.dataSource;

import java.util.Scanner;

/**
 * @author yujiale
 * @Classname JavaApi
 * @Description TODO
 * @Date 2021/8/21 下午9:48
 * @Created by yujiale
 */
public class StringDemo {

    public static void main(String[] args) {
        StringBufferApiTest();
    }

    /**
     * String构造方法：
     * 如果构造方法为空，则创建一个空白字符串对抗，不含有任何内容
     * 如果构造方法里面有值，根据字节数组的内容，来创建字符串对象
     * 建议直接使用String s4 ="abc"；
     */
    static void StringDemo01() {
        String s1 = new String();
        System.out.println(s1);
        char[] chs = {'a', 'b', 'c'};
        String s2 = new String(chs);
        System.out.println(s2);
        byte[] bys = {97, 98, 99};
        String s3 = new String(bys);
        System.out.println(s3);
        String s4 = "abc123";
        System.out.println(s4);
        String substring = s4.substring(0, 3);
        System.out.println(substring);
    }

    /**
     * 已知用户名和密码，请用程序实现模拟用户登录。总共给三次机会，登录之后，给出相应的提示
     */
    static void StringTest01() {
        //已知用户名和命名直接通过两个String字符串
        String username = "admin";
        String password = "123456";
        //循环实现多次输入，记载次数，并在登陆成功后break结束循环
        for (int i = 0; i < 3; i++) {
            Scanner scanner = new Scanner(System.in);
            String user = scanner.nextLine();
            String pass = scanner.nextLine();
            if (username.equals(user) && password.equals(pass)) {
                System.out.println("登陆成功");
                break;
            } else {
                if ((2 - i) == 0) {
                    System.out.println("你的账户被锁定");
                }
                System.out.println("登陆失败，你还有" + (2 - i) + "次机会");
            }
        }
    }

    /**
     * 键盘录入一个字符串，使用程序遍历当前字符串
     */
    static void StringTest02() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入字符串");
        String s = scanner.nextLine();

        for (int i = 0; i < s.length(); i++) {
            System.out.println(s.charAt(i));
        }
    }

    /**
     * 键盘输入一个字符串，统计该字符串中大写字符、小写字符、数字字符出现的次数
     */
    static void StringTest03() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入字符串");
        String line = scanner.nextLine();
        Integer big = 0;
        Integer small = 0;
        Integer num = 0;
        for (int i = 0; i < line.length(); i++) {
            char ch = line.charAt(i);
            if (ch >= 'A' && ch <= 'Z') {
                big++;
            } else if ((ch >= 'a' && ch <= 'z')) {
                small++;
            } else if (ch >= '0' && ch <= '9') {
                num++;
            } else {
                System.out.println("无效字符");
            }
        }
        System.out.println(big);
        System.out.println(small);
        System.out.println(num);
    }

    /**
     * 拼接字符串
     * 例如：int[] arr ={1,2,3}  执行后编成[1,2,3]
     */
    static void StringTest04() {
        int[] ints = {1, 2, 3};
        String s = ArrayToString(ints);
        System.out.println(s);
    }

    /**
     * 按照指定格式进行拼接
     *
     * @param arr
     * @return
     */
    static String ArrayToString(int[] arr) {
        String s = "";
        s += "[";
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                s += arr[i];
            } else {
                s += arr[i];
                s += ",";
            }
        }
        s += "]";
        return s;
    }

    /**
     * 字符串反转
     */
    static void StringTest05() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入字符串");
        String s = scanner.nextLine();
        String s1 = arrayToReverse(s);
        System.out.println(s1);
    }

    /**
     * 字符串反转方法
     *
     * @param s
     * @return
     */
    static String arrayToReverse(String s) {
        String ss = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            ss += s.charAt(i);
        }
        return ss;
    }

    /**
     * StringBuilder构造方法
     * 如果构造方法为空，则创建一个空白可变的字符串对抗，不含有任何内容
     * 如果构造方法里面有值，根据字节数组的内容，来创建可变字符串对象
     */
    static void StringBuilderDemo01() {
        /**
         * StringBuilder构造方法的案例
         */
        StringBuilder stringBuilder = new StringBuilder();
        System.out.println(stringBuilder);
        StringBuilder hello = new StringBuilder("hello");
        System.out.println(hello);
    }

    /**
     * stringBuilder添加和反转
     * append(任意类型）：添加数据，并返回对象本身
     * reverse（）：返回相反的字符序列
     */
    static void StringBuilderDemo02() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("hello")
                .append(",")
                .append("hello");
        System.out.println(stringBuilder);
        StringBuilder reverse = stringBuilder.reverse();
        System.out.println(reverse);
    }

    /**
     * stringBuilder转换为string
     * toString（）
     * string转换为stringBuilder
     * 构造方法
     * public StringBuilder（String s）
     */
    static void StringBuilderString() {
        StringBuilder stringBuilder = new StringBuilder("sss");
        String s = stringBuilder.toString();
        System.out.println(s);
        String hello = new String("hello");
        StringBuilder stringBuilder1 = new StringBuilder(hello);
        System.out.println(stringBuilder1);
    }

    /**
     * 拼接字符串
     * 将int[] arr = {1,2,3} 转换为【1，2，3】
     */
    static void StringBuilderTest01() {
        int[] arr = {1, 2, 3};
        String s = StringBuilderArray(arr);
        System.out.println(s);
    }

    static String StringBuilderArray(int[] arr) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("[");
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                stringBuilder.append(arr[i]);
            } else {
                stringBuilder.append(arr[i]);
                stringBuilder.append(",");
            }

        }
        stringBuilder.append("]");
        String s = stringBuilder.toString();
        return s;
    }

    /**
     * 字符串反转
     */
    static void StringBuilderReverse() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入字符串");
        String s = scanner.nextLine();
        String s1 = ReverseTest01(s);
        System.out.println(s1);
    }

    /**
     * stringBuilder的反转
     * @param s
     * @return
     */
    static String ReverseTest01(String s) {
        StringBuilder stringBuilder = new StringBuilder(s);
        StringBuilder reverse = stringBuilder.reverse();
        String s1 = reverse.toString();
        return s1;
    }

    /**
     * String常用api使用
     * String常用APi
     *     charAt（int index）：传入字符串下标并返回对应下标的内容
     *     length（）：获取字符串的长度
     *     indexOf（）：返回指定字符在字符串中第一次出现处的索引，如果此字符串中没有这样的字符，则返回 -1。
     *     substring（int startIndex，int endIndex）：截取字符串的长度并获得截取后的一个字串，startIndex是包含的，endIndex是不包含的
     *     trim（）：返回一个新的字符串，这个字符串将删除原始字符串头部和尾部的空格
     *     equalsIgnoreCase（）：检测字符串是否相等，并且忽略大小写
     *     equals（）：检测字符串是否相等，不忽略大小写
     */
    static void StringApiTest() {
        String string = "hello world";
        System.out.println(string.length());
        for (int i = 0; i < string.length(); i++) {
            System.out.println(string.charAt(i));
        }
        System.out.println(string.indexOf(1));
        System.out.println(string.substring(1, 5));
        System.out.println(string.trim());
        String string1 = "123123";
        if (string.equals(string1)) {
            System.out.println("string和string1相等");
        }
        String string2 = "hello World";
        if (string.equals(string2)) {
            System.out.println("string和string1相等");
        }
        if (string.equalsIgnoreCase(string2)) {
            System.out.println("string和string2相等");
        }
    }

    /**
     * stringBuilder常用api测试
     * StringBuilder
     *     length（）：获取字符串的长度
     *     append（）：在字符串添加元素
     *     setCharAt（）：将指定位置的元素替换
     *     insert（）：在指定位置插入元素
     *     delete（）：删除从0到1的元素
     *     toString（）：返回当前字符串的所有内容
     */
    static void StringBuilderApiTest() {
        StringBuilder stringBuilder = new StringBuilder("hello");
        int length = stringBuilder.length();
        System.out.println(length);
        stringBuilder.append("w");
        stringBuilder.append("o");
        stringBuilder.append("r");
        System.out.println(stringBuilder);
        stringBuilder.setCharAt(1,'J');
        System.out.println(stringBuilder.toString());
        stringBuilder.insert(5,"Java");
        System.out.println(stringBuilder);
        stringBuilder.delete(0,4);
        System.out.println(stringBuilder);
    }

    /**
     * StringBuffer常用api测试
     * StrungBuffer
     *     append（）：在字符串添加元素
     *     reverse（）：反转字符串
     *     delete（）：从start开始到end删除元素
     *     insert（）：从指定位置插入元素
     *     replace（）：替换指定的字符串
     *     capacity（）：获取当前容量
     */
    static void StringBufferApiTest(){
        StringBuffer stringBuffer = new StringBuffer("wuHan");
        int length = stringBuffer.length();
        System.out.println(length);
        stringBuffer.append("hello");
        stringBuffer.append("!");
        System.out.println(stringBuffer);
        stringBuffer.setCharAt(1,'1');
        System.out.println(stringBuffer);
        stringBuffer.insert(1,"2");
        System.out.println(stringBuffer);
        StringBuffer reverse = stringBuffer.reverse();
        System.out.println(reverse);
        stringBuffer.delete(1,4);
        System.out.println(stringBuffer);
        StringBuffer replace = stringBuffer.replace(1,3,"heo");
        System.out.println(replace);
        System.out.println(stringBuffer.capacity());
    }


}
