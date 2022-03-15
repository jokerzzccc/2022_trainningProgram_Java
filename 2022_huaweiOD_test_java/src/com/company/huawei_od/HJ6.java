package com.company.huawei_od;

import java.util.Scanner;

/**
 * 功能:输入一个正整数，按照从小到大的顺序输出它的所有质因子（重复的也要列举）（如180的质因子为2 2 3 3 5 ）
 * 数据范围： 1 \le n \le 2 \times 10^{9} + 14 \1≤n≤2×10^9
 *  +14
 */
public class HJ6 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long numL = sc.nextLong();
        for(long i = 2 ; i <= Math.sqrt(numL);i++){
            if(numL==1){
                break;
            }
            while(numL % i==0){
                System.out.print(i+" ");
                numL /= i;
            }
        }
        if(numL!=1){
            System.out.print(numL+" ");
        }
    }
}
