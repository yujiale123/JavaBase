package com.yjl.primary.day04_Array;

/**
 * @author yujiale
 * @Classname ArraysDemo
 * @Description TODO
 * @Date 2021/8/22 下午3:02
 * @Created by yujiale
 * <p>
 * 数组是一次性声明大量的用于存储数据的变量，并且存储的数据类型都是同一类型
 * 数组注意事项：
 *     索引越界
 *         访问了数组中不存在的索引对应的元素，造成索引越界问题
 *     空指针异常
 *         访问的数组已经不再指向堆内存的数据，造成空指针异常
 *     null异常
 *         空值，引用数据类型的默认值，表示不指向任何有效对象
 */
public class ArraysDemo {


    public static void main(String[] args) {
        ArrayTest02();
    }


    /**
     * 数组初始化以及如何访问数组
     * 数组静态初始化格式
     * 数组类型[] 数组名 = new 数据类型[]{数据1，数据2，数据3}
     * <p>
     * 数组动态初始化格式
     * 数据类型[] 数组名=new 数组类型[数组长度]
     * 注意事项：数组初始化一定创建无法改变数组长度，若如果频繁改变数组长度，则使用arrayList方法
     */
    static void ArrayTest01() {
        int[] array1 = new int[]{1, 2, 3, 4};
        System.out.println(array1);
        int[] array2 = new int[10];
        System.out.println();
    }

    /**
     * 数组的常用方法
     * 遍历
     * 长度；length
     * 拷贝：copyOf
     * 排序：sort
     * 读取：toString
     * 二分搜索方法：binarySearch（type[] a，int start,int end,type e）
     * 设置为同一个值：find（type[] a，type e）
     * 比较两个数组是否完全相等：equals
     */
    static void ArrayTest02() {
        int[] arr = new int[]{1,2,3,4,5,6,7};
        for (Integer integer : arr){
            System.out.println(integer);
        }
        System.out.println(arr.length);
        System.out.println(arr.toString());
    }


    /**
     * 冒泡排序
     */
    static void bubbleSort() {
        int[] arr = {22, 24, 56, 12, 35, 67};
        System.out.println("排序前：" + arrayToString(arr));
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }

        }
        System.out.println("排序后：" + arrayToString(arr));
    }

    static String arrayToString(int[] arr) {
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
}
