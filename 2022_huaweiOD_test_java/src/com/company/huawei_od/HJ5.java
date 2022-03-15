package com.company.huawei_od;

import java.util.Scanner;

/**
 * 题目：进制转换：写出一个程序，接受一个十六进制的数，输出该数值的十进制表示。
 */
public class HJ5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNextLine()){
            String str = in.nextLine();
            System.out.println(Integer.parseInt(str.substring(2,str.length()),16));
        }
    }
}
