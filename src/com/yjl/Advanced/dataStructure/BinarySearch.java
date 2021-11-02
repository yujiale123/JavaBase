package com.yjl.Advanced.dataStructure;

/**
 * @author yujiale
 * @Classname BinarySearch
 * @Description TOO
 * @Date 2021/9/5 下午2:00
 * @Created by yujiale
 */
public class BinarySearch {
    public static void main(String[] args) {
        BinarySearchTest01();
    }

    public static void BinarySearchTest01() {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int number = 3;
        Integer index = binarySearchForIndex(arr, number);
        System.out.println(index);
    }

    /**
     * 查找步骤
     * 1.定义两个变量，表示要查找的方位，默认min=0，max=最大索引
     * 2.循环查找，但是min《=max
     * 3.计算出mid的值
     * 4.判断出mid位置的元素是否是查找的元素，如果是直接返回对应索引
     * 5.如果要查找的值在mid的左半边，那么min值不变，max=mid-1继续下次循环查找
     * 6.如果要查找的值在mid的右半边，那么max不变，max=mid+1继续下次循环查找
     * 7.当min》max时，表示要查找的元素在数组中不存在，返回-1
     *
     * @param arr
     * @param number
     * @return
     */
    private static Integer binarySearchForIndex(int[] arr, int number) {
        //1.定义查找的范围
        int min = 0;
        int max = arr.length;
        //循环查找min《=max
        while (min <= max) {
            int mid = (min + max) >> 1;
            if (arr[mid] > number) {
                max = mid - 1;
            } else if (arr[mid] < number) {
                min = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}
