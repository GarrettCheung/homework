package demo;

import java.util.Scanner;

public class First {
    public static void main(String[] args) {
        //古典问题：有一对兔子，从出生后第3个月起每个月都生一对兔子，小兔子长到第三个月后每个月又生一对兔子，假如兔子都不死，问每个月的兔子总数为多少？
        Scanner intput = new Scanner(System.in);
        int m = intput.nextInt();
        int[] month;
        month = new int[m];
        if( month.length > 0 ){
            for(int i = 0;i<month.length;i++){
                if(i==0||i==1){
                    month[0]=1;month[1]=1;
                }else {
                    month[i]=month[i-2]+month[i-1];
                }
                System.out.println("Month="+(i+1)+"------"+"num="+month[i]);
            }
        }

    }

}
