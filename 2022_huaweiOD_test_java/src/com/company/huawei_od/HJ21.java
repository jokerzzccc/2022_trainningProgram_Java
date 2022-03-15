package com.company.huawei_od;

import java.util.Scanner;

public class HJ21 {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        while(in.hasNext()){
            String str=in.nextLine();
            char c[]=str.toCharArray();
            for(int i=0;i<str.length();i++){
                if(c[i]>='A'&&c[i]<='Z'){
                    if(c[i]+32!='z')
                        c[i]+=32+1;
                    else
                        c[i]='a';
                }
                else if(c[i]>='a'&&c[i]<='r')
                    c[i]=(char) ((c[i]-'a')/3+2+'0');
                else if(c[i]=='s')
                    c[i]='7';
                else if(c[i]>='t'&&c[i]<='v')
                    c[i]='8';
                else if(c[i]>='w'&&c[i]<='z')
                    c[i]='9';

                System.out.print(c[i]);
            }
            System.out.println();
        }
    }

}

