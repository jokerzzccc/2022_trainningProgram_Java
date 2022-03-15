package com.company.huawei_od;

import java.util.HashSet;
import java.util.Scanner;

/**
 * 题目：输入一个 int 型整数，按照从右向左的阅读顺序，返回一个不含重复数字的新的整数。
 * 保证输入的整数最后一位不是 0 。
 */
public class HJ9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()){
            HashSet<Integer> hashSet = new HashSet<>();
            int num = scanner.nextInt();
            while(num != 0){
                int temp = num  % 10;
                if (hashSet.add(temp)){
                    System.out.print(temp);
                }
                num /= 10;
            }
        }
    }
}
