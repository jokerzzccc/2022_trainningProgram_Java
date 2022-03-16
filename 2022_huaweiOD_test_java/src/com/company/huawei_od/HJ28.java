package com.company.huawei_od;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;



/**
 * 匈牙利算法解决素数伴侣问题
 * 偶数+偶数一定不是素数，所以只能偶数和奇数匹配
 * 分为偶数，素数两个集合。找最大匹配
 */
public class HJ28 {
    //定义偶数和奇数集合
    public static List<Integer> evenList;
    public static List<Integer> oddList;
    //判断奇数是否已访问过
    public static boolean[] vis;
    //存储奇数对应的偶数
    public static int[] p;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextInt()){
            int n = sc.nextInt();
            //定义素数伴侣总数
            int count = 0;
            //初始化奇偶集合
            evenList = new ArrayList<>();
            oddList = new ArrayList<>();
            //初始化数组
            for (int i = 0; i < n;i++){
                int num = sc.nextInt();
                if (num % 2 == 0){
                    evenList.add(num);
                }else {
                    oddList.add(num);
                }
            }
            p = new int[oddList.size()];
            //循环每个偶数匹配
            for (int i = 0;i < evenList.size();i++){
                vis = new boolean[oddList.size()];
                if(match(evenList.get(i))){
                    count++;
                }
            }
            System.out.println(count);
        }
    }
    //匈牙利算法为当前偶数匹配素数，匹配到返回true，没匹配到返回false
    public static boolean match(int even){
        for (int i = 0; i < oddList.size();i++){
            //当前偶数奇数加起来是素数 并且 当前奇数未被访问
            if (isPrime(even+oddList.get(i)) && !vis[i]){
                //标记当前奇数已被访问
                vis[i] = true;
                //如果当前奇数还没有被匹配过，或者当前奇数匹配的偶数能另外匹配其它的奇数
                if (p[i] == 0 || match(p[i])){
                    //把当前奇数匹配的机会给当前偶数
                    p[i] = even;
                    return true;
                }
            }
        }
        //匹配不到，返回false
        return false;
    }

    //判断一个数是否是素数
    public static boolean isPrime(int num){
        if (num == 1){
            return false;
        }
        for (int i = 2; i*i <= num;i++){
            if (num % i == 0){
                return false;
            }
        }
        return true;
    }
}


