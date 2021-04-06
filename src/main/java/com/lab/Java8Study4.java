
package com.lab;

import java.util.IntSummaryStatistics;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Java8Study4 {
    public static void main(String[] args) {
        int [] scores = {80,50,70,90,40};
        //sum avg max min 各是多少
        int sum = IntStream.of(scores).sum();
        double avg = IntStream.of(scores).average().getAsDouble();
        int min = IntStream.of(scores).min().getAsInt();
        int max = IntStream.of(scores).max().getAsInt();
        System.out.printf("sum : %d avg : %.1f max : %d min : %d\n",sum,avg,max,min);
        //java 8 part II (統計)
        //IntSummaryStatistice 統計物件
        IntSummaryStatistics stat = IntStream.of(scores).summaryStatistics();
        System.out.printf("sum : %d avg : %.1f max : %d min : %d\n",stat.getSum(),stat.getAverage(),stat.getMax(),stat.getMin());
    }
    
}
