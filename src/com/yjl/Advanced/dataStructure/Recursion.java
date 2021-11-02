package com.yjl.Advanced.dataStructure;

/**
 * @author yujiale
 * @Classname Recursion
 * @Description TOO
 * @Date 2021/9/5 下午2:23
 * @Created by yujiale
 * 10.递归
 *     概念
 *         自己调用自己，有传递也有返回，注意数值界限
 *     满足的递归的条件
 *         一个问题的解可以分成几个小问题的解
 *         这个问题分解之后的子问题，除了数据规模不同，求解思路完全一样
 *         存在递归终止条件
 *     实现递归的关键两点
 *         1.找到终止条件
 *         2.写出递归共识
 */
public class Recursion {
    public static void main(String[] args) {
        RecursionTest01();
    }

    /**
     * 递归
     * <p>
     * 求1-100之间的和
     */
    public static void RecursionTest01() {
        Integer sum = getSum(100);
        System.out.println(sum);
        Integer jc = getJc(5);
        System.out.println(jc);
    }


    private static Integer getSum(int i) {
        if (i == 1) {
            return 1;
        } else {
            return i + getSum(i - 1);
        }
    }

    private static Integer getJc(int i) {
        //1.一定要找到终止条件
        //2。写出递归公式
        if (i == 1) {
            return 1;
        } else {
            return i * getJc(i - 1);
        }
    }
}
