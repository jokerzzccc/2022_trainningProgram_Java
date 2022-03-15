package com.company.huawei_od;

import java.util.Scanner;

/**
 * 题号：HJ2
 * 题目：写出一个程序，接受一个由字母、数字和空格组成的字符串，和一个字符，然后输出输入字符串中该字符的出现次数。（不区分大小写字母）
 * 数据范围： 1 \le n \le 1000 \1≤n≤1000
 */
public class HJ2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine().toLowerCase();
        String s = sc.nextLine().toLowerCase();
        System.out.print(str.length() - str.replaceAll(s, "").length());
    }
}
