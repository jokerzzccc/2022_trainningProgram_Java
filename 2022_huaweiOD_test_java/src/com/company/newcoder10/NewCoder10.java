package com.company.newcoder10;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

/**
 * 类型：栈
 * 内容:
 * 10、消消乐游戏
 *
 * 消消乐游戏
 *
 * 游戏规则：输入一个只包含英文字母的字符串，字符串中的两个字母如果相邻且相同，就可以消除。
 *
 *
 *
 * 在字符串上反复执行消除的动作，直到无法继续消除为止，此时游戏结束。
 *
 * 输出最终得到的字符串长度。
 *
 *
 *
 * 输入描述:
 *
 * 输入原始字符串 str ，只能包含大小写英文字母，字母的大小写敏感， str 长度不超过100。
 *
 *
 *
 * 输出描述:
 *
 * 输出游戏结束后，最终得到的字符串长度
 *
 *
 *
 * 示例1
 *
 * 输入
 *
 * gg
 *
 * 输出
 *
 * 0
 *
 * 说明
 *
 * gg 可以直接消除，得到空串，长度为0
 *
 * 示例2
 *
 * 输入
 *
 * mMbccbc
 *
 * 输出
 *
 * 3
 *
 * 说明
 *
 * 在 mMbccbc 中，可以先消除 cc ；此时字符串变成 mMbbc ，可以再消除 bb ；此时字符串变成 mMc ，此时没有相邻且相同的字符，无法继续消除。最终得到的字符串为 mMc ，长度为3
 *
 * 备注:
 *
 * 输入中包含 非大小写英文字母 时，均为异常输入，直接返回 0
 * ————————————————
 * 版权声明：本文为CSDN博主「meiribaofu」的原创文章，遵循CC 4.0 BY-SA版权协议，转载请附上原文出处链接及本声明。
 * 原文链接：https://blog.csdn.net/meiribaofu/article/details/117068563
 */
public class NewCoder10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String line = in.nextLine();
        in.close();

        int len = line.replaceAll("[a-z]", "").replaceAll("[A-Z]", "").length();
        if (len != 0) {
            System.out.println(0);
            return;
        }
        LinkedList<Character> list = new LinkedList<>();
        for (char c : line.toCharArray()) {
            list.add(c);
        }

        int count = 0;
        while (list.size() != count) {
            count = list.size();
            for (int i = 0; i < list.size() - 1; i++) {
                if (list.get(i) == list.get(i + 1)) {
                    list.remove(i);
                    list.remove(i);
                    i--;
                }
            }
        }

        System.out.println(list.size());
    }
}
