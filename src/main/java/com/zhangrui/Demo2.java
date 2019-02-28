package com.zhangrui;

public class Demo2 {
    public static void main(String[] args){
        //判断101-200之间有多少个素数，并输出所有素数。
        int up = 101,down= 200,count = 0;
        for(int i=up;i<down;i++){
            for(int j = 2; j<=i-1;j++){
                if(i%j==0){
                    break;
                }
                if(j==i-1){
                    System.out.println("素数为:"+i);
                    count++;
                }

            }

        }
        System.out.println("素数一共有:"+count);



    }
}

