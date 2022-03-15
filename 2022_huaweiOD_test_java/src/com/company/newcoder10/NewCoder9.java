package com.company.newcoder10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

/**
 * 题型：链表
 * 内容：
 * 9、报数游戏
 *
 * 100个人围成一圈，每个人有一个编码，编号从1开始到100。他们从1开始依次报数，报到为M的人自动退出圈圈，然后下一个人接着从1开始报数，直到剩余的人数小于M。请问最后剩余的人在原先的编号为多少？
 *
 *
 *
 * 输入描述:
 *
 * 输入一个整数参数M
 *
 * 输出描述:
 *
 * 如果输入参数M小于等于1或者大于等于100，输出“ERROR!”；否则按照原先的编号从小到大的顺序，以英文逗号分割输出编号字符串
 *
 *
 *
 * 示例1：
 *
 * 输入
 *
 * 3
 *
 * 输出
 *
 * 58,91
 *
 * 说明
 *
 * 输入M为3，最后剩下两个人
 *
 * 示例2：
 *
 * 输入
 *
 * 4
 *
 * 输出
 *
 * 34,45,97
 *
 * 说明
 *
 * 输入M为4，最后剩下三个人
 * ————————————————
 * 版权声明：本文为CSDN博主「meiribaofu」的原创文章，遵循CC 4.0 BY-SA版权协议，转载请附上原文出处链接及本声明。
 * 原文链接：https://blog.csdn.net/meiribaofu/article/details/117068563
 */
public class NewCoder9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int M = in.nextInt();
        in.close();
        int N = 100;

        if (M <= 1 || M >= 100) {
            System.out.println("ERROR!");
            return;
        }

        ArrayList<Boolean> booleanList = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            booleanList.add(i, true);
        }

       int count = 0;
        for (int i = 0, alive = 100;alive >= M;) {
            if (!booleanList.get(i)){
                i = endSet(i);
            } else {
                if (++count != M) {
                   i = endSet(i);
                } else {
                    booleanList.set(i, false);
                    i = endSet(i);
                    alive--;
                    count = 0;
                }
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < booleanList.size(); i++) {
            if (booleanList.get(i)){
                sb.append(i + 1).append(",");
            }
        }

        System.out.println(sb.substring(0, sb.length() - 1));

    }
    // 处理下标 i
    public static int endSet(int i){
        if (i == 99) {
            i = 0;
        } else {
            i++;
        }
        return i;
    }
}
