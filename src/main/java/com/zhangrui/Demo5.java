package com.zhangrui;

import java.util.Scanner;

public class Demo5 {
    public static void main(String[] args) {
        //利用条件运算符的嵌套来完成此题：学习成绩=90分的同学用A表示，60-89分之间的用B表示，60分以下的用C表示。
        Scanner input = new Scanner(System.in);
        System.out.println("请输入学生成绩：");
        double score = input.nextDouble();
        if(score > 0 && score <=100){
            String grade = score >= 90 ? "A级" : score >= 60 ? "B级" :  "C级";
            System.out.println("分数:"+score+"分，为"+grade);
        }

    }
}
