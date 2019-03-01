package com.zhangrui;

public class Demo3 {
    //打印出所有的 水仙花数 ，所谓 水仙花数 是指一个三位数，其各位数字立方和等于该数本身。例如：153是一个 水仙花数 ，因为153=1的三次方＋5的三次方＋3的三次方。
    public  static void main (String[] args){
        for(int i=100;i<1000;i++){
            int ge = i%10 , shi = (i%100)/10, bai = i / 100;
            int sumGe = ge*ge*ge,sumShi = shi*shi*shi,sumBai = bai*bai*bai;
            int sum = sumGe+sumShi+sumBai;
            if(i==sum){
                System.out.println("水仙花数："+sum);
            }
        }
    }
}
