package com.company.huawei_od;

import java.io.*;
import java.util.*;

/**
 * 题目：简单错误记录
 */
public class HJ19{
    public static void main(String[] args) throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        Map<String,Integer> map = new LinkedHashMap();
        String tstr = null;
        while((tstr = bf.readLine()) != null && !tstr.equals("")){
            String[] str = tstr.split("\\s+");
            String fname=str[0].substring(str[0].lastIndexOf("\\") + 1);
            fname = fname.substring(Math.max(fname.length()-16 ,0))+" "+str[1];
            Integer tmp = map.get(fname);
            if(tmp == null)
                map.put(fname,1);
            else
                map.put(fname, tmp+1);
        }
        int count = 0;
        for(Map.Entry<String,Integer> it : map.entrySet()){
            if(map.size() - count <= 8)
                System.out.println(it.getKey()+" "+it.getValue());
            count++;
        }
    }
}
