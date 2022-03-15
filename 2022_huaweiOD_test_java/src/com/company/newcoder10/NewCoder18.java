package com.company.newcoder10;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

/**
 * 题型：基础编程
 * 内容：
 * 8、整数对最小和
 *
 * 给定两个整数数组array1、array2，数组元素按升序排列。假设从array1、array2中分别取出一个元素可构成一对元素，现在需要取出k对元素，并对取出的所有元素求和，计算和的最小值
 *
 * 注意：两对元素如果对应于array1、array2中的两个下标均相同，则视为同一对元素。
 *
 *
 *
 * 输入描述:
 *
 * 输入两行数组array1、array2，每行首个数字为数组大小size(0 < size <= 100);
 *
 * 0 < array1[i] <= 1000
 *
 * 0 < array2[i] <= 1000
 *
 * 接下来一行为正整数k
 *
 * 0 < k <= array1.size() * array2.size()
 *
 * 输出描述:
 *
 * 满足要求的最小和
 *
 *
 *
 * 示例1
 *
 * 输入
 *
 * 3 1 1 2
 *
 * 3 1 2 3
 *
 * 2
 *
 * 输出
 *
 * 4
 *
 * 说明
 *
 * 用例中，需要取2对元素
 *
 * 取第一个数组第0个元素与第二个数组第0个元素组成1对元素[1,1];
 *
 * 取第一个数组第1个元素与第二个数组第0个元素组成1对元素[1,1];
 *
 * 求和为1+1+1+1=4，为满足要求的最小和
 * ————————————————
 * 版权声明：本文为CSDN博主「meiribaofu」的原创文章，遵循CC 4.0 BY-SA版权协议，转载请附上原文出处链接及本声明。
 * 原文链接：https://blog.csdn.net/meiribaofu/article/details/116710453
 */
public class NewCoder18 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] splitArr1 = in.nextLine().split(" ");
        String[] splitArr2 = in.nextLine().split(" ");
        int k = in.nextInt();
        in.close();

        int[] array1 = getArray(splitArr1);
        int[] array2 = getArray(splitArr2);

        int sum = 0;
        ArrayList<Integer> list = new ArrayList<>();
        for (int i : array1) {
            for (int j : array2) {
                list.add(i + j);
            }
        }

        list.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1 - o2;
            }
        });
        list.forEach(System.out::println);

        for (int i = 0; i < k; i++) {
            sum += list.get(i);
        }

        System.out.println(sum);
    }

    public static int[] getArray(String[] strings){
        int[] array = new int[Integer.parseInt(strings[0])];

        for (int i = 1; i < strings.length; i++) {
            array[i - 1] =  Integer.parseInt(strings[i]);
        }

        return array;
    }
}
