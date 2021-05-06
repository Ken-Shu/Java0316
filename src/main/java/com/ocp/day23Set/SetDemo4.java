package com.ocp.day23Set;


import java.util.IntSummaryStatistics;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.function.Predicate;

public class SetDemo4 {

    public static void main(String[] args) {
        //Java 5 泛型
        Set<Integer> scores = new LinkedHashSet<>();
        //介於0~100之間
        scores.add(100);
        scores.add(90);
        scores.add(80);
        scores.add(200);
        scores.add(-150);
        System.out.println(scores);
        //請用 Java8 計算國英數的總數
       Predicate<Integer> p = score -> (score>= 0 && score<=100);
        IntSummaryStatistics sum = 
                scores.stream()
                        .filter(p)
                        //.filter(e->Score.isValid(e))
                        .mapToInt(Integer::intValue)
                        .summaryStatistics();
        System.out.println(sum.getSum());
    }
   
}
