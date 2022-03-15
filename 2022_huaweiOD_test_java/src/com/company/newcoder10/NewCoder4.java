package com.company.newcoder10;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * 题型：字符串
 * 内容：
 * 给定一个非空字符串S，其被N个‘-’分隔成N+1的子串，给定正整数K，要求除第一个子串外，其余的子串每K个字符组成新的子串，并用‘-’分隔。对于新组成的每一个子串，如果它含有的小写字母比大写字母多，则将这个子串的所有大写字母转换为小写字母；反之，如果它含有的大写字母比小写字母多，则将这个子串的所有小写字母转换为大写字母；大小写字母的数量相等时，不做转换。
 * <p>
 * <p>
 * <p>
 * 输入描述:
 * <p>
 * 输入为两行，第一行为参数K，第二行为字符串S。
 * <p>
 * 输出描述:
 * <p>
 * 输出转换后的字符串。
 * <p>
 * <p>
 * <p>
 * 示例1
 * <p>
 * 输入
 * <p>
 * 3
 * <p>
 * 12abc-abCABc-4aB@
 * <p>
 * 输出
 * <p>
 * 12abc-abc-ABC-4aB-@
 * <p>
 * 说明
 * <p>
 * 子串为12abc、abCABc、4aB@，第一个子串保留，后面的子串每3个字符一组为abC、ABc、4aB、@，abC中小写字母较多，转换为abc，ABc中大写字母较多，转换为ABC，4aB中大小写字母都为1个，不做转换，@中没有字母，连起来即12abc-abc-ABC-4aB-@
 * <p>
 * 示例2
 * <p>
 * 输入
 * <p>
 * 12
 * <p>
 * 12abc-abCABc-4aB@
 * <p>
 * 输出
 * <p>
 * 12abc-abCABc4aB@
 * <p>
 * 说明
 * <p>
 * 子串为12abc、abCABc、4aB@，第一个子串保留，后面的子串每12个字符一组为abCABc4aB@，这个子串中大小写字母都为4个，不做转换，连起来即12abc-abCABc4aB@
 * ————————————————
 * 版权声明：本文为CSDN博主「meiribaofu」的原创文章，遵循CC 4.0 BY-SA版权协议，转载请附上原文出处链接及本声明。
 * 原文链接：https://blog.csdn.net/meiribaofu/article/details/117068563
 */
public class NewCoder4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int K = Integer.parseInt(in.nextLine());
        String[] split = in.nextLine().split("-");
        in.close();

        String firstStr = split[0];
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i < split.length; i++) {
            sb.append(split[i]);
        }

        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < sb.length(); ) {
            if (i + K < sb.length()) {
                String tmp = sb.substring(i, i + K);
                list.add(tmp);
            } else {
                list.add(sb.substring(i, sb.length()));
            }
            i += K;
        }

        for (String s : list) {
            int curLowerCount = 0;
            int curUpperCount = 0;
            char[] chars = s.toCharArray();
            for (char c : chars) {
                if (c >= 'a' && c <= 'z') {
                    curLowerCount++;
                }
                if (c >= 'A' && c <= 'Z') {
                    curUpperCount++;
                }
            }
            if (curLowerCount > curUpperCount) {
                list.set(list.indexOf(s), s.toLowerCase());
            }
            if (curLowerCount < curUpperCount) {
                list.set(list.indexOf(s), s.toUpperCase());
            }
        }

        System.out.print(firstStr + "-");
        for (int i = 0; i < list.size() - 1; i++) {
            list.set(i, list.get(i) + "-");
        }
        list.forEach(System.out::print);
    }
}
