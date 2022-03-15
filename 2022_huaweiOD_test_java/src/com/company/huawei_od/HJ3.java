package com.company.huawei_od;

import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

/**
 * 题号：HJ3
 * 题目：明明的随机数
 */
public class HJ3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextInt()) {
            int num = scanner.nextInt();
            TreeSet<Integer> set = new TreeSet<>();
            for (int i = 0; i < num; i++) {
                set.add(scanner.nextInt());
            }
            Iterator iterator = set.iterator();
            while (iterator.hasNext()) {
                System.out.println(iterator.next());
            }
        }
    }
}
