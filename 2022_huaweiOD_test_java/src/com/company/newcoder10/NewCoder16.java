package com.company.newcoder10;

import java.util.Scanner;

/**
 * 题型：分治
 * 内容：
 * 6、太阳能板最大面积
 *
 * 给航天器一侧加装长方形或正方形的太阳能板（图中的红色斜线区域），需要先安装两个支柱（图中的黑色竖条），再在支柱的中间部分固定太阳能板。但航天器不同位置的支柱长度不同，太阳能板的安装面积受限于最短一侧的那根支柱长度。如图：
 *
 * 现提供一组整形数组的支柱高度数据，假设每根支柱间距离相等为1个单位长度，计算如何选择两根支柱可以使太阳能板的面积最大。
 *
 *
 *
 * 输入描述:
 *
 * 10,9,8,7,6,5,4,3,2,1
 *
 * 注：支柱至少有2根，最多10000根，能支持的高度范围1~10^9的整数。柱子的高度是无序的，例子中递减只是巧合。
 *
 * 输出描述:
 *
 * 可以支持的最大太阳能板面积：（10米高支柱和5米高支柱之间）
 *
 * 25
 *
 *
 *
 * 示例1
 *
 * 输入
 *
 * 10,9,8,7,6,5,4,3,2,1
 *
 * 输出
 *
 * 25
 *
 * 备注:
 *
 * 10米高支柱和5米高支柱之间宽度为5，高度取小的支柱高也是5，面积为25。任取其他两根支柱所能获得的面积都小于25。所以最大的太阳能板面积为25。
 * ————————————————
 * 版权声明：本文为CSDN博主「meiribaofu」的原创文章，遵循CC 4.0 BY-SA版权协议，转载请附上原文出处链接及本声明。
 * 原文链接：https://blog.csdn.net/meiribaofu/article/details/116710453
 */
public class NewCoder16 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] split = in.nextLine().split(",");
        in.close();

        long[] ints = new long[split.length];
        for (int i = 0; i < split.length; i++) {
            ints[i] = Long.parseLong(split[i]);
        }

        long res = 0;
        for (int i = 0; i < split.length; i++) {
            for (int j = i + 1; j < split.length; j++) {
                long area = Math.min(ints[i], ints[j]) * (j - i);
                if (area > res) res = area;
            }
        }

        System.out.println(res);
    }
}
