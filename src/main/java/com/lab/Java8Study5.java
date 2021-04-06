package com.lab;

import java.util.IntSummaryStatistics;
import java.util.stream.Stream;

public class Java8Study5 {

    public static void main(String[] args) {
        String[] scores = {"80", "50", "70", "90", "40"};
        int[] x = new int[5];
        x[0] = Integer.valueOf(scores[0]);
        //請印出及格成績的總和
        int sum = 0;
        for (int i = 0; i < scores.length; i++) {
            if (Integer.valueOf(scores[i]) >= 60) {
                sum += Integer.valueOf(scores[i]);
                System.out.println(scores[i]);
            }
        }
        System.out.println(sum);
        //Java 8
        IntSummaryStatistics stat = Stream.of(scores)
                .mapToInt(s -> Integer.parseInt(s)) //的到IntStream
                .filter(s -> s >= 60) // 過濾
                .summaryStatistics(); //統計資料
        System.out.printf("sum : %d max : %d min : %d\n",stat.getSum(),stat.getMax(),stat.getMin());
    }

}
