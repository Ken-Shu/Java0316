
package com.ocp.day06;

import java.util.Arrays;

public class ArrayDemo1 {
    public static void main(String[] args) {
        int [] score = new int [3];
        score[0]=100;
        score[1]=90;
        score[2]=90;
        int lens = score.length;
        System.out.printf("陣列長度: %d\n",lens);
        //印出陣列每一個元素資料
        System.out.println(score[0] + " , "+score[1] + " , "+score[2]);
        //Arrays 將 score 用字串方式印出
        System.out.println(Arrays.toString(score));
        //總分
        //int sum = score[0]+score[1]+score[2];
        int sum = 0;
        for(int i = 0; i<lens; i++){
            sum+=score[i];
        }
        //平均
        double avg = (double)sum /lens;
        System.out.printf("總分 :%d  平均 : %.1f \n",sum,avg);
    }
    
}
