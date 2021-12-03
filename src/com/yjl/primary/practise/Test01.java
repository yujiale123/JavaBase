package com.yjl.primary.practise;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 * @program: JavaBasics
 * @author: yjl
 * @created: 2021/12/03
 */
public class Test01 {


    public static void main(String[] args) {
        practices02();
    }

    /**
     * 1. 编程题 实现双色球抽奖游戏中奖号码的生成，中奖号码由 6 个红球号码和 1 个蓝球号码组成。
     * 其中红球号码要求随机生成 6 个 1~33 之间不重复的随机号码。
     * 其中蓝球号码要求随机生成 1 个 1~16 之间的随机号码。
     */
    public static void practices01() {
        //定义红球数组
        int[] red = new int[7];
        Random random = new Random();
        for (int i = 0; i < red.length - 1; i++) {
            //生成随机数
            red[i] = random.nextInt(33) + 1;
            //数组中随机数去重
            for (int j = 0; j < i; j++) {
                if (red[i] == red[j]) {
                    i--;
                    break;
                }
            }
        }
        System.out.println(Arrays.toString(red));
        //定义蓝球数组
        int[] blue = new int[1];
        Random random1 = new Random();
        blue[0] = random1.nextInt(16) + 1;
        System.out.println(Arrays.toString(blue));
        red[red.length - 1] = blue[0];
        System.out.println(Arrays.toString(red));

    }


    /**
     * 2. 编程题 实现数组扩容。自定义数组长度（用户指定），
     * 扩容规则：当已存储元素数量达到总容量的 80%时，扩容到原容量的1.5 倍。
     * 例如，原容量是 10，当输入第 8 个元素时，数组进行扩容，容量从 10 变 15。
     */
    public static void practices02() {
        Scanner scanner = new Scanner(System.in);
        int oldLength = scanner.nextInt();
        int[] oldArray = new int[oldLength];
        System.out.println("初始化数组内容：" + Arrays.toString(oldArray));
        System.out.println(oldLength);
        int current = 0;
        while (true) {
            System.out.println("请输入第" + (current + 1) + "个整数数据(输入0退出)：");
            oldArray[current] = scanner.nextInt();
            current++;
            if (0 == oldArray[current - 1]) {
                System.out.println("数组扩容算法测试完毕！");
                break;
            }
            System.out.println("数组内容：" + Arrays.toString(oldArray));
            System.out.println(current >= oldLength * 0.8);
            if (current >= oldLength * 0.8) {
                System.out.println("扩容前的数组长度：" + oldLength);
                int newLength = oldLength + (oldLength >> 1);
                System.out.println("扩容后的数组长度：" + newLength);
                int[] newArray = new int[newLength];
                for (int i = 0; i < oldLength; i++) {
                    newArray[i] = oldArray[i];
                }
                oldArray = newArray;
                break;
            }
        }
        System.out.println("扩容后的数组元素" + Arrays.toString(oldArray));

    }
}
