package com.yjl.Advanced.dataStructure;

/**
 * @author yujiale
 * @Classname BubbleSorting
 * @Description TOO
 * @Date 2021/9/5 下午2:12
 * @Created by yujiale
 */
public class BubbleSorting {
    public static void main(String[] args) {
        BubbleSortingTest01();
    }

    /**
     * 使用双循环来进行排序。外部循环控制所有的回合，内部循环代表每一轮的冒泡处理，先进行元素比较，再进行元素交换
     */
    public static void BubbleSortingTest01() {
        int[] arr = {1, 2, 4, 3, 6, 0};
        //外层循环控制的就是次数，比数组的长度少一次
        for (int i = 0; i < arr.length; i++) {
            /**
             * 内存循环就是实际循环比较
             * -1 目的是为了让数组不越界
             * -i 每一轮循环结束之后，就少比较一个数字
             */
            for (int j = 0; j < arr.length - 1-i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[i];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        for (Integer i :arr){
            System.out.println(i);
        }
    }
}
