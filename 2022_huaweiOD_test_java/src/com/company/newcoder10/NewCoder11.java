package com.company.newcoder10;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * 题型：数组
 * 内容：
 * 1、求解连续数列
 *
 * 已知连续正整数数列{K}=K1,K2,K3...Ki的各个数相加之和为S，i=N (0<S<100000, 0<N<100000), 求此数列K。
 *
 *
 *
 * 输入描述:
 *
 * 输入包含两个参数，1）连续正整数数列和S，2）数列里数的个数N。
 *
 * 输出描述:
 *
 * 如果有解输出数列K，如果无解输出-1
 *
 *
 *
 * 示例1
 *
 * 输入
 *
 * 525 6
 *
 * 输出
 *
 * 85 86 87 88 89 90
 *
 * 示例2
 *
 * 输入
 *
 * 3 5
 *
 * 输出
 *
 * -1
 * ————————————————
 * 版权声明：本文为CSDN博主「meiribaofu」的原创文章，遵循CC 4.0 BY-SA版权协议，转载请附上原文出处链接及本声明。
 * 原文链接：https://blog.csdn.net/meiribaofu/article/details/116710453
 */
public class NewCoder11 {
    // 就是个等差数列 S = N *(A1 + An)/2;An = A1 + N - 1;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] split = in.nextLine().split(" ");
        int[] ints = new int[2];
        for (int i = 0; i < ints.length; i++) {
            ints[i] = Integer.parseInt(split[i]);
        }
        int S = ints[0], N = ints[1];
        in.close();

        if (N > S) {
            System.out.println("-1");
            return;
        }

        int[] K = new int[N];

        int a1 = (2*S/N + 1 - N) / 2;
        for (int i = 0; i < K.length; i++) {
            K[i] = a1 + i;
        }

        StringBuilder sb = new StringBuilder();
        Arrays.stream(K).forEach(x -> sb.append(x).append(" "));

        System.out.println(sb.substring(0, sb.length() - 1));


    }
}
