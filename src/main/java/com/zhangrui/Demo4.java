package com.zhangrui;

import java.util.Scanner;

public class Demo4 {
    //将一个正整数分解质因数。例如：输入90,打印出90=2*3*3*5
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入一个正整数:");
        int number = input.nextInt();
        int k = 2;
        System.out.print(number + "=");
            while (k < number) {
                if(number % k == 0){
                    System.out.print(k+"*");
                    number = number / k;
                    continue;
                }
                if(number % k != 0){
                    k++;
                }

            }
            System.out.println(k);

    }
}
