package com.company.huawei_od;

import java.util.Scanner;
import java.util.TreeMap;

/**
 * 題目：数据表记录包含表索引和数值（int范围的正整数），请对表索引相同的记录进行合并，即将相同索引的数值进行求和运算，输出按照key值升序进行输出。
 */
public class HJ8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TreeMap<Integer, Long> map = new TreeMap<>();
        while(scanner.hasNext()){
            int count = scanner.nextInt();
            for (int i = 0; i < count; i++) {
                int key = scanner.nextInt();
                long value = scanner.nextLong();
                map.put(key,map.getOrDefault(key,0L)+value);
            }
            for (Integer key:map.keySet()) {
                System.out.println(key+" "+map.get(key));
            }
            map.clear();
        }
        scanner.close();
    }

}
