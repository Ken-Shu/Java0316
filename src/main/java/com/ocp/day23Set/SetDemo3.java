package com.ocp.day23Set;


import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetDemo3 {

    public static void main(String[] args) {
        //Java 5 泛型
        Set<Integer> scores = new LinkedHashSet<>();
        scores.add(100);
        scores.add(90);
        scores.add(80);
        System.out.println(scores);
        Iterator<Integer> iter = scores.iterator();
        int sum = 0;
        while (iter.hasNext()) {
            Integer next = iter.next();
            sum += next;
        }
        System.out.println(sum);
        //Java8
        int sum2 = scores.stream().mapToInt(Integer::intValue).sum();
        System.out.println(sum2);
    }
}
