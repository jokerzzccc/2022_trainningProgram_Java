package com.company.jishizhenti;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/*
    定义当一个字符串只有元音字母(a,e,i,o,u,A,E,I,O,U)组成,
    称为元音字符串，现给定一个字符串，请找出其中最长的元音字符串，
    并返回其长度，如果找不到请返回0，
    字符串中任意一个连续字符组成的子序列称为该字符串的子串

    输入描述：
      一个字符串其长度 0<length ,字符串仅由字符a-z或A-Z组成
    输出描述：
      一个整数，表示最长的元音字符子串的长度

    示例1：
      输入
        asdbuiodevauufgh
      输出
        3
      说明：
        最长的元音字符子串为uio和auu长度都为3，因此输出3
     */
public class Topic66 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine().toLowerCase();
        in.close();

        List<Character> vowel = Arrays.asList('a', 'e', 'i', 'o', 'u');

        int maxlen = 0, tmplen = 0;
        for (char c : str.toCharArray()) {
            if (vowel.contains(c)){
                tmplen++;
            } else {
                maxlen = Math.max(maxlen,tmplen);
                tmplen = 0;
            }
        }
        maxlen = Math.max(maxlen, tmplen);

        System.out.println(maxlen);
    }
}
