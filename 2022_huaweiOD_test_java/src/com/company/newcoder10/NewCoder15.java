package com.company.newcoder10;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

/**
 * 题型：排序
 * 内容：
 * 5、磁盘容量排序
 *
 * 磁盘的容量单位常用的有M，G，T这三个等级，它们之间的换算关系为1T = 1024G，1G = 1024M，现在给定n块磁盘的容量，请对它们按从小到大的顺序进行稳定排序，例如给定5块盘的容量，1T，20M，3G，10G6T，3M12G9M排序后的结果为20M，3G，3M12G9M，1T，10G6T。注意单位可以重复出现，上述3M12G9M表示的容量即为3M+12G+9M，和12M12G相等。
 *
 *
 *
 * 输入描述:
 *
 * 输入第一行包含一个整数n(2 <= n <= 100)，表示磁盘的个数，接下的n行，每行一个字符串(长度大于2，小于30)，表示磁盘的容量，由一个或多个格式为mv的子串组成，其中m表示容量大小，v表示容量单位，例如20M，1T，30G，10G6T，3M12G9M。
 *
 *
 *
 * 磁盘容量m的范围为1到1024的正整数，容量单位v的范围只包含题目中提到的M，G，T三种，换算关系如题目描述。
 *
 * 输出描述:
 *
 * 输出n行，表示n块磁盘容量排序后的结果。
 *
 *
 *
 * 示例1：
 *
 * 输入
 *
 * 3
 *
 * 1G
 *
 * 2G
 *
 * 1024M
 *
 * 输出
 *
 * 1G
 *
 * 1024M
 *
 * 2G
 *
 * 说明
 *
 * 1G和1024M容量相等，稳定排序要求保留它们原来的相对位置，故1G在1024M之前
 *
 * 示例2：
 *
 * 输入
 *
 * 3
 *
 * 2G4M
 *
 * 3M2G
 *
 * 1T
 *
 * 输出
 *
 * 3M2G
 *
 * 2G4M
 *
 * 1T
 *
 * 说明
 *
 * 1T的容量大于2G4M，2G4M的容量大于3M2G
 * ————————————————
 * 版权声明：本文为CSDN博主「meiribaofu」的原创文章，遵循CC 4.0 BY-SA版权协议，转载请附上原文出处链接及本声明。
 * 原文链接：https://blog.csdn.net/meiribaofu/article/details/116710453
 */
public class NewCoder15 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = Integer.parseInt(in.nextLine());
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            list.add(in.nextLine());
        }
        in.close();
        list.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return Long.compare(parseLong(o1), parseLong(o2));
            }
        });

        list.forEach(System.out::println);
    }

    static long parseLong(String size){
        String[] units = size.split("[0-9]+");
        String[] nums = size.split("[A-Z]+");


        long sum = 0;
        for (int i = 1; i < units.length; i++) {
            long num = Long.parseLong(nums[i - 1]);
            switch (units[i]){
                case "M":
                    sum += num;
                    break;
                case "G":
                    sum += num * 1024;
                    break;
                case "T":
                    sum += num * 1024 * 1024;
                    break;
            }

        }
        return sum;

    }
}
