package com.company.newcoder10;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Scanner;

/**
 * 题型：字符串
 * 内容：
 * 4、字符串统计
 *
 * 给定两个字符集合，一个为全量字符集，一个为已占用字符集。已占用的字符集中的字符不能再使用，要求输出剩余可用字符集。
 *
 *
 *
 * 输入描述:
 *
 * 1、输入为一个字符串，一定包含@符号。@前的为全量字符集，@后的字为已占用字符集。
 *
 * 2、已占用字符集中的字符一定是全量字符集中的字符。字符集中的字符跟字符之间使用英文逗号分隔。
 *
 * 3、每个字符都表示为字符加数字的形式，用英文冒号分隔，比如a:1，表示1个a字符。
 *
 * 4、字符只考虑英文字母，区分大小写，数字只考虑正整形，数量不超过100。
 *
 * 5、如果一个字符都没被占用，@标识仍然存在，例如a:3,b:5,c:2@
 *
 * 输出描述:
 *
 * 输出可用字符集，不同的输出字符集之间回车换行。
 *
 * 注意，输出的字符顺序要跟输入一致。不能输出b:3,a:2,c:2
 *
 * 如果某个字符已全被占用，不需要再输出。
 *
 *
 *
 * 示例1
 *
 * 输入
 *
 * a:3,b:5,c:2@a:1,b:2
 *
 * 输出
 *
 * a:2,b:3,c:2
 *
 * 说明
 *
 * 全量字符集为3个a，5个b，2个c。
 *
 * 已占用字符集为1个a，2个b。
 *
 * 由于已占用字符不能再使用，因此，剩余可用字符为2个a，3个b，2个c。
 *
 * 因此输出a:2,b:3,c:2
 * ————————————————
 * 版权声明：本文为CSDN博主「meiribaofu」的原创文章，遵循CC 4.0 BY-SA版权协议，转载请附上原文出处链接及本声明。
 * 原文链接：https://blog.csdn.net/meiribaofu/article/details/116710453
 */
public class NewCoder14 {
    static class Info{
        public String c;
        public int no;
        public int count;

        public Info(String c, int no, int count) {
            this.c = c;
            this.no = no;
            this.count = count;
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] split = in.nextLine().split("@");
        in.close();

        String[] all = split[0].split(",");
        HashMap<String, Info> map = new HashMap<>();

        for (int i = 0; i < all.length; i++) {
            String[] char_count = all[i].split(":");
            String c = char_count[0];
            map.put(c, new Info(c, i, Integer.parseInt(char_count[1])));
        }

        if (split.length > 1) {
            for (String s : split[1].split(",")) {
                String[] char_count = s.split(":");
                String c = char_count[0];
                Info value = map.get(c);
                value.count -= Integer.parseInt(char_count[1]);
                map.put(c, value);
            }
        }

        StringBuilder sb = new StringBuilder();

        map.values().stream()
                .filter(x -> x.count > 0)
                .sorted(new Comparator<Info>() {
                    @Override
                    public int compare(Info o1, Info o2) {
                        return o1.no - o2.no;
                    }
                })
                .forEach(x -> sb.append(x.c).append(":").append(x.count).append(","));

        System.out.println(sb.substring(0, sb.length() - 1));


    }
}
