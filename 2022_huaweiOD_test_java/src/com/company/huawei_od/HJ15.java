package com.company.huawei_od;

import java.util.Scanner;

/**
 * 题目：输入一个 int 型的正整数，计算出该 int 型数据在内存中存储时 1 的个数。
 *
 * 数据范围：保证在 32 位整型数字范围内
 */
public class HJ15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int count = 0;
        String binaryString = Integer.toBinaryString(num);
        for (int i = 0; i < binaryString.length(); i++) {
            if (binaryString.charAt(i) == '1') {
                count++;
            }
        }
        System.out.println(count);
        scanner.close();
    }
}
