package com.yjl.Advanced.dataStructure;

/**
 * @author yujiale
 * @Classname QuickSort
 * @Description TOO
 * @Date 2021/9/5 下午2:40
 * @Created by yujiale
 * 11.快速排序
 *     概念
 *         快速排序的核心思想是分治：选择数组中某个数作为基数，
 *         通过一趟排序将要排序的数据分割成独立的两部分，
 *         其中一部分的所有数都比基数小，另外一部分的所有数都都比基数大，
 *         然后再按此方法对这两部分数据分别进行快速排序，循环递归，最终使整个数组变成有序。
 */
public class QuickSort {
    public static void main(String[] args) {
        QuickSortTest01();
    }

    public static void QuickSortTest01() {
        int[] arr = {2, 31, 45, 12, 78, 13, 89, 23, 10};
        quickSort1(arr, 0, arr.length - 1);
        for (Integer i : arr) {
            System.out.print(i);
        }
    }

    private static void quickSort1(int[] arr, int left, int right) {
        if (right < left) {
            return;
        }
        int left0 = left;
        int right0 = right;
        int baseNumber = arr[left0];
        while (left != right) {
            while (arr[right] >= baseNumber && right > left) {
                right--;
            }
            while (arr[left] <= baseNumber && right > left) {
                left++;
            }
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
        }
        int temp = arr[left];
        arr[left] = arr[left0];
        arr[left0] = temp;
        quickSort1(arr, left0, left - 1);
        quickSort1(arr, left + 1, right0);
    }
}
