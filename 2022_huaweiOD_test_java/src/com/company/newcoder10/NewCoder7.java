package com.company.newcoder10;

import java.util.Scanner;

/**
 * 题型：递归
 * 内容：
 * 7、猴子爬山
 *
 * 一天一只顽猴想去从山脚爬到山顶，途中经过一个有个N个台阶的阶梯，但是这猴子有一个习惯： 每一次只能跳1步或跳3步，试问猴子通过这个阶梯有多少种不同的跳跃方式？
 *
 *
 *
 * 输入描述:
 *
 * 输入只有一个整数N（0<N<=50）此阶梯有多少个阶梯
 *
 * 输出描述:
 *
 * 输出有多少种跳跃方式（解决方案数）
 *
 *
 *
 * 示例1：
 *
 * 输入
 *
 * 50
 *
 * 输出
 *
 * 122106097
 *
 * 示例2：
 *
 * 输入
 *
 * 3
 *
 * 输出
 *
 * 2
 * ————————————————
 * 版权声明：本文为CSDN博主「meiribaofu」的原创文章，遵循CC 4.0 BY-SA版权协议，转载请附上原文出处链接及本声明。
 * 原文链接：https://blog.csdn.net/meiribaofu/article/details/117068563
 */
public class NewCoder7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.close();
        // 循环的方法
//        int f1 = 1;
//        int f2 = 1;
//        int f3 = 2;
//        int f4 = n ==1 || n == 2 ? 1 : 2;
//        for (int i = 4; i <= n; i++) {
//            f4 = f3 + f1;
//            f1 = f2;
//            f2 = f3;
//            f3 = f4;
//        }

        System.out.println(dp(n));

    }
    // 动态规划的方法（递归）
    public static int dp(int n){
        int count = 0;
        if (n == 1 || n == 2){
            count = 1;
        }
        if (n == 3){
            count = 2;
        }
        if (n > 3){
            count = dp(n - 1) + dp( n - 3);
        }
        return count;
    }
}
