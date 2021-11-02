package com.yjl.primary.day03_IfAndFor;

/**
 * * 三种循环的区别
 * *
 * * for循环和while循环先判断条件是否成立，然后决定是否执行循环体（先判断后执行）
 * * do...while循环先执行一次循环体，然后判断条件是否成立，是否继续执行循环体（先执行后判断）
 * * for循环和while的区别
 * * 条件控制语句所控制的自增变量，因为归属for循环的语法结构中，在for循环结束后，就不能再次被访问到了
 * * 条件控制语句所控制的自增变量，对于while循环来说不归属其语法结构中，在while循环结束后，该变量还可以继续使用
 * * 死循环（无限循环）的三种格式
 * * for(;;){}
 * * while(true){}
 * * do {} while(true);
 *
 * @author yujiale
 */

public class LoopControl {


    public static void main(String[] args) {
        LoopControlTest02();
    }

    /**
     * for循环
     * <p>
     * for(初始化语句;条件判断语句;条件控制语句){
     * 循环语句;
     * }
     * 格式解释：
     * 初始化语句： 用于表示循环开启时的起始状态，简单说就是循环开始的时候什么样
     * 条件判断语句：用于表示循环反复执行的条件，简单说就是判断循环是否能一直执行下去
     * 循环体语句： 用于表示循环反复执行的内容，简单说就是循环反复执行的事情
     * 条件控制语句：用于表示循环执行中每次变化的内容，简单说就是控制循环是否能执行下去
     * 执行流程：
     * ①执行初始化语句
     * ②执行条件判断语句，看其结果是true还是false
     * ​ 如果是false，循环结束
     * ​ 如果是true，继续执行
     * ③执行循环体语句
     * ④执行条件控制语句
     * ⑤回到②继续
     */
    static void LoopControlTest01() {
        for (int i = 0; i <= 5; i++) {
            if (i == 1) {
                System.out.println("相等了");
            }
            System.out.println(i);
        }
    }

        /**
         * 求1到100数字总和
         */
        static void LoopControlForTest01() {
            int sum = 0;
            for (int i = 1; i <= 100; i++) {
                sum += i;
            }
            System.out.println("1到100所有数之和是：" + sum);

            //1到100的偶数之和
            sum = 0;
            for (int i = 1; i <= 100; i++) {
                if (i % 2 == 0) {
                    sum += i;
                }
            }
            System.out.println("1到100所有的偶数之和是：" + sum);
        }

    /**
     * 输出所有的水仙花
     */
    static void LoopControlForTest02() {
        int count = 0;
        for (int i = 100; i <= 999; i++) {
            int ge = i % 10;
            int shi = i / 10 % 10;
            int bai = i / 10 / 10 % 10;

            if ((ge * ge * ge + shi * shi * shi + bai * bai * bai) == i) {
                //  2. 在判定和打印水仙花数的过程中，拼接空格, 但不换行，并在打印后让count变量+1，记录打印过的数量
                System.out.print(i + " ");
                count++;
                // 3. 在每一次count变量+1后，判断是否到达了2的倍数，是的话，换行
                if (count % 2 == 0) {
                    System.out.println();
                }
            }
        }
    }

    /**
     * while循环
     * 初始化语句;
     * while (条件判断语句) {
     * 循环体语句;
     * 条件控制语句;
     * }
     * 流程
     * ①执行初始化语句
     * ②执行条件判断语句，看其结果是true还是false
     * ​ 如果是false，循环结束
     * ​ 如果是true，继续执行
     * ③执行循环体语句
     * ④执行条件控制语句
     * ⑤回到②继续
     * 世界最高山峰是珠穆朗玛峰(8844.43米=8844430毫米)，假如我有一张足够大的纸，它的厚度是0.1毫米。
     * 请问，我折叠多少次，可以折成珠穆朗玛峰的高度?
     */
    static void LoopControlTest02() {
        //定义一个计数器，初始值为0
        int count = 0;
        //定义纸张厚度
        double paper = 0.1;
        //定义珠穆朗玛峰的高度
        int zf = 8844430;
        //因为要反复折叠，所以要使用循环，但是不知道折叠多少次，这种情况下更适合使用while循环
        //折叠的过程中当纸张厚度大于珠峰就停止了，因此继续执行的要求是纸张厚度小于珠峰高度
        while (paper <= zf) {
            //循环的执行过程中每次纸张折叠，纸张的厚度要加倍
            paper *= 2;
            //在循环中执行累加，对应折叠了多少次
            count++;
        }
        //打印计数器的值
        System.out.println("需要折叠：" + count + "次");
    }

    /**
     * do{
     * }
     * while
     * 初始化语句;
     * do {
     * 循环体语句;
     * 条件控制语句;
     * }while(条件判断语句);
     * 执行流程：
     * <p>
     * ① 执行初始化语句
     * ② 执行循环体语句
     * ③ 执行条件控制语句
     * ④ 执行条件判断语句，看其结果是true还是false
     * 如果是false，循环结束
     * 如果是true，继续执行
     * ⑤ 回到②继续
     */
    static void LoopControlTest03() {

    }
}
