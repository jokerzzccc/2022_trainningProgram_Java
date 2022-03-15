package com.company.huawei_od;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 题目：HJ16
 * 内容：动态规划类
 */
class Good {
    // 主件
    int v;// 价格
    int p;// 重要度
    int q;// 主件附件标识ID
    // 附件（最多两个）
    int a1 = 0;
    int a2 = 0;

    public Good(int v, int p, int q) {
        this.v = v;
        this.p = p;
        this.q = q;
    }

    public Good() {

    }

    public int getV() {
        return v;
    }

    public void setV(int v) {
        this.v = v;
    }

    public int getP() {
        return p;
    }

    public void setP(int p) {
        this.p = p;
    }

    public int getQ() {
        return q;
    }

    public void setQ(int q) {
        this.q = q;
    }

    public int getA1() {
        return a1;
    }

    public void setA1(int a1) {
        this.a1 = a1;
    }

    public int getA2() {
        return a2;
    }

    public void setA2(int a2) {
        this.a2 = a2;
    }
}

public class HJ16 {
    public static int DW = 100;

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String[] strArr = bufferedReader.readLine().split(" ");
        boolean flag = true;

        int N = Integer.parseInt(strArr[0]);
        int m = Integer.parseInt(strArr[1]);
        Good[] goods = new Good[m + 1];
        for (int i = 1; i <= m; i++) {
            strArr = bufferedReader.readLine().split(" ");
            int v = Integer.parseInt(strArr[0]);
            int p = Integer.parseInt(strArr[1]);
            int q = Integer.parseInt(strArr[2]);
            if (flag) {
                if (v % DW != 0) {
                    flag = false;
                    DW = 10;
                    for (int j = 1; j < i; j++) {
                        goods[j].setV(goods[j].v * 10);
                    }
                }
            }
            v /= DW;
            if (goods[i] != null) {
                goods[i].setV(v);
                goods[i].setP(p);
                goods[i].setQ(q);
            } else {
                goods[i] = new Good(v, p,q);
            }
            if (q > 0) {
                if (goods[q] == null) {
                    goods[q] = new Good();
                }
                if (goods[q].a1 == 0) {
                    goods[q].setA1(i);
                } else {
                    goods[q].setA2(i);
                }
            }
        }
        N = N / DW;
        dyanmicProgram(N, goods);
    }

    public static void dyanmicProgram(int N, Good[] goods) {
        int[][] dp = new int[N + 1][goods.length];
        for (int i = 1; i < goods.length; i++) {
            int v = -1, v1 = -1, v2 = -1, v3 = -1, tempdp = -1, tempdp1 = -1, tempdp2 = -1, tempdp3 = -1;
            v = goods[i].v;
            tempdp = v * goods[i].p;
            if (goods[i].a1 != 0 && goods[i].a2 != 0) {
                v3 = v + goods[goods[i].a1].v + goods[goods[i].a2].v;
                tempdp3 = tempdp + goods[goods[i].a1].v * goods[goods[i].a1].p + goods[goods[i].a2].v * goods[goods[i].a2].p;
            }
            if (goods[i].a1 != 0) {
                v1 = v + goods[goods[i].a1].v;
                tempdp1 = tempdp + goods[goods[i].a1].v * goods[goods[i].a1].p;
            }
            if (goods[i].a2 != 0) {
                v2 = v + goods[goods[i].a2].v;
                tempdp2 = tempdp + goods[goods[i].a2].v * goods[goods[i].a2].p;
            }
            for (int j = 1; j < N + 1; j++) {
                if (goods[i].q > 0) {
                    dp[j][i] = dp[j][i - 1];
                } else {
                    dp[j][i] = dp[j][i - 1];
                    if (j >= v && v != -1) dp[j][i] = Math.max(dp[j][i], dp[j - v][i - 1] + tempdp);
                    if (j >= v1 && v1 != -1) dp[j][i] = Math.max(dp[j][i], dp[j - v1][i - 1] + tempdp1);
                    if (j >= v2 && v2 != -1) dp[j][i] = Math.max(dp[j][i], dp[j - v2][i - 1] + tempdp2);
                    if (j >= v3 && v3 != -1) dp[j][i] = Math.max(dp[j][i], dp[j - v3][i - 1] + tempdp3);
                }
            }

        }
        System.out.println(dp[N][goods.length - 1] * DW);
    }
}
