package com.company.huawei_od;

import java.util.Scanner;
/**
 * 题型编号：HJ1
 * 题目：计算字符串最后一个单词的长度，单词以空格隔开，字符串长度小于5000。（注：字符串末尾不以空格为结尾）
 */
public class HJ1 {
    public static void charOperation(String strings){
        String[] strArr = strings.split("\\s+");
        System.out.println(strArr[strArr.length - 1].length());
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String strings = sc.nextLine();
        charOperation(strings);
    }
}
