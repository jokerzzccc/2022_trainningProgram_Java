package com.company.huawei_od;

import java.util.Scanner;

/**
 * 题号：HJ4
 * 题目：字符串分隔
 */
public class HJ4 {
    public static void main(String[] args) {
        int i;
        Scanner scanner = new Scanner(System.in);
        StringBuilder stringBuilder = new StringBuilder();
        while (scanner.hasNextLine()){
            stringBuilder.append(scanner.nextLine());
        }
        while(stringBuilder.length() % 8 != 0){
            stringBuilder.append("0");
        }
        for (i = 8; i < stringBuilder.length(); i += 8 ) {
            System.out.println(stringBuilder.substring((i - 8),i-1));
        }
        scanner.close();
    }
}
