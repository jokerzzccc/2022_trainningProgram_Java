package com.company.newcoder10;


import java.util.Scanner;

/**
 * 类型：数组
 * 2、TLV解码
 * <p>
 * TLV编码是按[Tag Length Value]格式进行编码的，一段码流中的信元用Tag标识，Tag在码流中唯一不重复，Length表示信元Value的长度，Value表示信元的值。
 * <p>
 * 码流以某信元的Tag开头，Tag固定占一个字节，Length固定占两个字节，字节序为小端序。
 * <p>
 * 现给定TLV格式编码的码流，以及需要解码的信元Tag，请输出该信元的Value。
 * <p>
 * 输入码流的16机制字符中，不包括小写字母，且要求输出的16进制字符串中也不要包含小写字母；码流字符串的最大长度不超过50000个字节。
 * <p>
 * <p>
 * <p>
 * 输入描述:
 * <p>
 * 输入的第一行为一个字符串，表示待解码信元的Tag；
 * <p>
 * 输入的第二行为一个字符串，表示待解码的16进制码流，字节之间用空格分隔。
 * <p>
 * 输出描述:
 * <p>
 * 输出一个字符串，表示待解码信元以16进制表示的Value。
 * <p>
 * <p>
 * <p>
 * 示例1：
 * <p>
 * 输入
 * <p>
 * 31
 * <p>
 * 32 01 00 AE 90 02 00 01 02 30 03 00 AB 32 31 31 02 00 32 33 33 01 00 CC
 * <p>
 * 输出
 * <p>
 * 32 33
 * <p>
 * 说明
 * <p>
 * 需要解析的信元的Tag是31，从码流的起始处开始匹配，Tag为32的信元长度为1（01 00，小端序表示为1）；第二个信元的Tag是90，其长度为2；第三个信元的Tag是30，其长度为3；第四个信元的Tag是31，其长度为2（02 00），所以返回长度后面的两个字节即可，即32 33。
 * ————————————————
 * 版权声明：本文为CSDN博主「meiribaofu」的原创文章，遵循CC 4.0 BY-SA版权协议，转载请附上原文出处链接及本声明。
 * 原文链接：https://blog.csdn.net/meiribaofu/article/details/117068563
 */
public class NewCoder2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String tag = in.nextLine().trim();
        String[] tvls = in.nextLine().split(" ");
        in.close();

//        StringBuilder sb = new StringBuilder();
//
//        if (Arrays.stream(tvls).conta)

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < tvls.length; i++) {
            String curTag = tvls[i];
            int len = Integer.parseInt(tvls[i + 1]) + Integer.parseInt(tvls[i + 2]);

            i += len + 2;
            if (tag.equals(curTag)) {
                for (int j = i; j <= i + len; j++) {
                    sb.append(tvls[i]).append(" ");
                }
                break;
            }
        }

        if (sb.length() > 0) {
            System.out.println(sb.substring(0, sb.length() - 1));
        } else {
            return;
        }
    }
}