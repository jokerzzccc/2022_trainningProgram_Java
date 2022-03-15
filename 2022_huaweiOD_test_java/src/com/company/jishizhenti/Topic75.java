package com.company.jishizhenti;

/*
 输入一串字符串
 字符串长度不超过100
 查找字符串中相同字符连续出现的最大次数

 输入描述
   输入只有一行，包含一个长度不超过100的字符串

 输出描述
   输出只有一行，输出相同字符串连续出现的最大次数

  说明：
    输出

  示例1：
    输入
      hello
    输出
      2

   示例2：
     输入
      word
     输出
      1

    示例3：
     输入
       aaabbc
      输出
       3

   字符串区分大小写
  */

import java.util.Scanner;

public class Topic75 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        in.close();

        int maxLength = 0;
        char[] chars = str.toCharArray();

        for (int i = 0; i < chars.length; i++) {
            int index = i;
            int len = 1;
            while (index + 1 < chars.length && chars[index + 1] == chars[index]){
                index++;
                len++;
            }
            if (len > maxLength){
                maxLength = len;
            }
        }
        System.out.println(maxLength);
    }
}
