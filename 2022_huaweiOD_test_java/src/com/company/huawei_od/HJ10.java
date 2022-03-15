package com.company.huawei_od;

import java.util.HashMap;
import java.util.Scanner;

/**
 * 编写一个函数，计算字符串中含有的不同字符的个数。字符在 ASCII 码范围内( 0~127 ，包括 0 和 127 )，换行表示结束符，不算在字符里。不在范围内的不作统计。多个相同的字符只计算一次
 * 例如，对于字符串 abaca 而言，有 a、b、c 三种不同的字符，因此输出 3 。
 */
public class HJ10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()){
            String str = scanner.nextLine();
            HashMap<Character, String> hashMap = new HashMap<>();
            for (char c:str.toCharArray()){
                int tempAscII = Integer.valueOf(c);
                if (0 <= tempAscII && tempAscII <= 127) {
                    hashMap.put(c,"1");
                }
            }
            System.out.println(hashMap.keySet().size());
        }
    }
}
