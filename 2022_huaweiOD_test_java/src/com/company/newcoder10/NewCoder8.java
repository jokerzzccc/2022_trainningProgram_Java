package com.company.newcoder10;

import java.util.Scanner;

/**
 * 题型：贪心
 * 内容：
 * 8、分糖果
 *
 * 小明从糖果盒中随意抓一把糖果，每次小明会取出一半的糖果分给同学们。
 *
 * 当糖果不能平均分配时，小明可以选择从糖果盒中（假设盒中糖果足够）取出一个糖果或放回一个糖果。
 *
 * 小明最少需要多少次（取出、放回和平均分配均记一次），能将手中糖果分至只剩一颗
 *
 *
 *
 * 输入描述:
 *
 * 抓取的糖果数（<10000000000）：
 *
 * 15
 *
 * 输出描述:
 *
 * 最少分至一颗糖果的次数：
 *
 * 5
 *
 *
 *
 * 示例1：
 *
 * 输入
 *
 * 15
 *
 * 输出
 *
 * 5
 *
 * 备注:
 *
 * 解释：(1)15+1=16;(2)16/2=8;(3)8/2=4;(4)4/2=2;(5)2/2=1;
 * ————————————————
 * 版权声明：本文为CSDN博主「meiribaofu」的原创文章，遵循CC 4.0 BY-SA版权协议，转载请附上原文出处链接及本声明。
 * 原文链接：https://blog.csdn.net/meiribaofu/article/details/117068563
 */
public class NewCoder8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.close();

        int count = 0 ;
        // 只有三种操作：1.加一，2.减一，3，整除2
        for (int i = n; i != 1 ; i /= 2, count++) {
            if (i == 3) {
                System.out.println(count + 2);
                return;
            }
            if (i % 2 != 0) {
                if ((i + 1) / 2 % 2 == 0) i++;
                else i--;
                count++;
            }
        }

        System.out.println(count);
    }
}
