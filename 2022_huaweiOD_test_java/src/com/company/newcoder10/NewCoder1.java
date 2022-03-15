package com.company.newcoder10;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 类型： 数组
 * 1、快递运输
 *
 * 一辆运送快递的货车，运送的快递均放在大小不等的长方体快递盒中，为了能够装载更多的快递，同时不能让货车超载，需要计算最多能装多少个快递。
 *
 * 注：快递的体积不受限制，快递数最多1000个，货车载重最大50000。
 *
 *
 *
 * 输入描述:
 *
 * 第一行输入每个快递的重量，用英文逗号分隔，如：5,10,2,11
 *
 * 第二行输入货车的载重量，如：20
 *
 * 不需要考虑异常输入。
 *
 * 输出描述:
 *
 * 输出最多能装多少个快递，如：3
 *
 *
 *
 * 示例1：
 *
 * 输入
 *
 * 5,10,2,11
 *
 * 20
 *
 * 输出
 *
 * 3
 *
 * 说明
 *
 * 货车的载重量为20，最多只能放三个快递5、10、2，因此输出3
 * ————————————————
 * 版权声明：本文为CSDN博主「meiribaofu」的原创文章，遵循CC 4.0 BY-SA版权协议，转载请附上原文出处链接及本声明。
 * 原文链接：https://blog.csdn.net/meiribaofu/article/details/117068563
 */
public class NewCoder1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] split = in.nextLine().split(",");
        int load = in.nextInt();
        in.close();

        int[] ints = new int[split.length];
        for (int i = 0; i < split.length; i++) {
            ints[i] = Integer.parseInt(split[i]);
        }
        Arrays.sort(ints);

        int sum = 0;
        int count = 0;
        for (int i = 0; i < ints.length; i++) {
            if (ints[i] + sum <= load) {
                sum += ints[i];
                count++;
            } else {
                break;
            }
        }

        System.out.println(count);


    }
}
