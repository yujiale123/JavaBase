package com.yjl.primary.day01;

/**
 * 类型转换
 */
public class TypeConversion {
    public static void main(String[] args) {
        //1.隐式转换
        double nums = 10;
        System.out.println(nums);
        /**
         *   1.整数默认是int类型，byte、short和char类型数据参与运算均会自动转换为int类型。
         *   2.boolean类型不能与其他基本数据类型相互转换。
         */
        byte b1 = 10;
        byte b2 = 20;
        // byte b3 = b1 + b2;
        // 第三行代码会报错，b1和b2会自动转换为int类型，计算结果为int，int赋值给byte需要强制类型转换。
        // 修改为:
        int num = b1 + b2;
        // 或者：
        byte b3 = (byte) (b1 + b2);
        System.out.println(num);
        System.out.println(b3);
        /**
         *  2.强制转换
         *  把一个表示数据范围大的数值或者变量赋值给另一个表示数据范围小的变量。
         *
         * 强制类型转换格式：目标数据类型 变量名 = (目标数据类型)值或者变量;
         */
        double num1 = 5.5;
        int num2 = (int) num1; // 将double类型的num1强制转换为int类型
        System.out.println(num2); // 输出5（小数位直接舍弃）


    }
}
