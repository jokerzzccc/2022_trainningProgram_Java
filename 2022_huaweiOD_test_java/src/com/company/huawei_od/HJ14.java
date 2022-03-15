package com.company.huawei_od;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Collectors;

/**
 * 题目：给定 n 个字符串，请对 n 个字符串按照字典序排列。
 */
public class HJ14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> arrayList = new ArrayList<>();

        int count = scanner.nextInt();
        while(count > 0){
            arrayList.add(scanner.next());
            count--;
        }
        arrayList.stream().sorted()
                .forEach(System.out::println);

        scanner.close();
    }
}
