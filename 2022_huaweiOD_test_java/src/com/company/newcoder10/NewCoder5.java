package com.company.newcoder10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

/**
 * 题型：排序
 * 内容：
 * 5、组成最大数
 * <p>
 * 小组中每位都有一张卡片，卡片上是6位内的正整数，将卡片连起来可以组成多种数字，计算组成的最大数字。
 * <p>
 * <p>
 * <p>
 * 输入描述:
 * <p>
 * “,”号分割的多个正整数字符串，不需要考虑非数字异常情况，小组最多25个人
 * <p>
 * 输出描述:
 * <p>
 * 最大的数字字符串
 * <p>
 * <p>
 * <p>
 * 示例1
 * <p>
 * 输入
 * <p>
 * 22,221
 * <p>
 * 输出
 * <p>
 * 22221
 * <p>
 * 示例2
 * <p>
 * 输入
 * <p>
 * 4589,101,41425,9999
 * <p>
 * 输出
 * <p>
 * 9999458941425101
 * ————————————————
 * 版权声明：本文为CSDN博主「meiribaofu」的原创文章，遵循CC 4.0 BY-SA版权协议，转载请附上原文出处链接及本声明。
 * 原文链接：https://blog.csdn.net/meiribaofu/article/details/117068563
 */
public class NewCoder5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] split = in.nextLine().split(",");
        in.close();

        StringBuilder sb = new StringBuilder();

        Arrays.stream(split)
                .sorted((s1, s2) -> {
                    char[] v1 = s1.toCharArray();
                    char[] v2 = s2.toCharArray();
                    int len1 = v1.length;
                    int len2 = v2.length;

                    if (len1 == len2) {
                        return s2.compareTo(s1);
                    }

                    int min = Math.min(len1, len2);
                    for (int i = 0; i < min; i++) {
                        char c1 = v1[i];
                        char c2 = v2[i];
                        if (c1 != c2) {
                            return c2 - c1;
                        }
                    }

                    if (len1 > len2) {
                        return v1[0] - v1[min];
                    } else {
                        return v2[min] - v2[0];
                    }
                })
                .forEach(sb::append);

        System.out.println(sb);


    }
}
