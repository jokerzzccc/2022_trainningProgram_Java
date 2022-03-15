package com.company.newcoder10;

import java.util.Scanner;

/**
 * 题型：字符串
 * 内容：
 * 3、寻找相同子串
 *
 * 给你两个字符串 t 和 p ，要求从 t 中找到一个和 p 相同的连续子串，并输出该字串第一个字符的下标。
 *
 *
 *
 * 输入描述:
 *
 * 输入文件包括两行，分别表示字符串 t 和 p ，保证 t 的长度不小于 p ，且 t 的长度不超过1000000，p 的长度不超过10000。
 *
 * 输出描述:
 *
 * 如果能从 t 中找到一个和 p 相等的连续子串，则输出该子串第一个字符在t中的下标（下标从左到右依次为1,2,3,…）；如果不能则输出”No”；如果含有多个这样的子串，则输出第一个字符下标最小的。
 *
 *
 *
 * 示例1
 *
 * 输入
 *
 * AVERDXIVYERDIAN
 *
 * RDXI
 *
 * 输出
 *
 * 4
 * ————————————————
 * 版权声明：本文为CSDN博主「meiribaofu」的原创文章，遵循CC 4.0 BY-SA版权协议，转载请附上原文出处链接及本声明。
 * 原文链接：https://blog.csdn.net/meiribaofu/article/details/116710453
 */
public class NewCoder13 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String t = in.nextLine();
        String p = in.nextLine();
        in.close();

        int len = p.length();

        for (int i = 0; i <= t.length() - len; i++) {
            String substring = t.substring(i, i + len);
            if (substring.equals(p)) {
                System.out.println(i + 1);
                return;
            }
        }
        System.out.println("No");
    }
}
