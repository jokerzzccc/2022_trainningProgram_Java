package com.company.huawei_od;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * 将一个英文语句以单词为单位逆序排放。例如“I am a boy”，逆序排放后为“boy a am I”
 *
 * 所有单词之间用一个空格隔开，语句中除了英文字母外，不再包含其他字符
 */
public class HJ13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder stringBuilder = new StringBuilder();
        List<String> stringList = Arrays.asList(scanner.nextLine().split(" "));
        Collections.reverse(stringList);
        stringList.forEach(item ->{stringBuilder.append(item + " ");});
        System.out.println(stringBuilder);

    }
}
