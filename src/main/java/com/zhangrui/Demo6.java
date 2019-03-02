package com.zhangrui;

import java.util.Scanner;

public class Demo6 {
    //输入两个正整数m和n，求其最大公约数和最小公倍数。
    public static void main (String []args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入正整数m:");
        int m = input.nextInt();
        System.out.println("请输入正整数n:");
        int n = input.nextInt();
        int k ;
        if(m>n){k = n;}else{ k = m;}
        for(int i = k;i >= 1; i--){
            if(m % i==0 && n % i==0){
                int j = n * m / i;
                System.out.println(m+"和"+n+"最大公约数是"+i);
                System.out.println(m+"和"+n+"最小公倍数是"+j);
                break;
            }
        }


 /*
        //第二种方法
        Scanner scan = new Scanner(System.in);
        System.out.print("请输入第一个整数:\n");
        int a = scan.nextInt();
        System.out.print("请输入第二个整数:\n");
        int b = scan.nextInt();
        Max_Min(a,b);
    }
    public static void Max_Min(int a,int b){
        int i = a;
        int j = b;
        int x =0,y =0;
        if(a < b){
            x = b;
            b = a;
            a = x;
        }
        while(b != 0){

            y = a % b;
            a = b;
            b = y;
        }
        //最小公倍数
        int t = i * j / a;
        System.out.println(i+"和"+j+"的最大公约数为："+ a);
        System.out.println(i+"和"+j+"的最小公倍数为："+ t);

*/
    }
}
