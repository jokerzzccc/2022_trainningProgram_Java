package com.company.huawei_od;

import java.util.Scanner;

/**
 * 题目：输入一个整数，将这个整数以字符串的形式逆序输出
 * 程序不考虑负数的情况，若数字含有0，则逆序形式也含有0，如输入为100，则输出为001
 * 数据范围： 0 \le n \le 2^{30}-1 \0≤n≤2
 * 30
 *  −1
 */
public class HJ11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            String str = scanner.nextLine();
            char[] chars = str.toCharArray();
            StringBuilder stringBuilder = new StringBuilder();
            for (int i = chars.length - 1; i >= 0 ; i--) {
                stringBuilder.append(""+chars[i]);
            }
            System.out.println(stringBuilder.toString());
        }
    }
}
