
package com.lab;

import java.util.stream.IntStream;
import java.util.stream.Stream;


public class Java8Study3 {
    public static void main(String[] args) {
     int [] scores = {80,50,70,90,40};
     //請算出總分與平均
     int sum = 0;
        for (int score : scores) {
            sum+=score;
        }
        double avg = sum / scores.length;
        System.out.printf("總分 : %d 平均 : %.1f\n",sum,avg);
        
        System.out.println("--------------------------");
        int sum2=IntStream.of(scores).sum();
        double avg2 = IntStream.of(scores).average().getAsDouble();
        double avg3 = sum2/scores.length;
        System.out.printf("總分 : %d 平均 : %.1f\n",sum2,avg2);
    }
    
}