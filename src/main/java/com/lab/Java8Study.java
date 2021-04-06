
package com.lab;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Java8Study {
    public static void main(String[] args) {
        int [] scores = {80,50,70,90,40};
        //請印出所有成績?
        //java 7 
        for(int s : scores){
            System.out.println(s);
        }
        for (int i = 0; i < scores.length; i++) {
            System.out.println(scores[i]);
        }
        //java 8 (利用 Stream.of()來進行資料分析)
        System.out.println("-----------------------------------");
        Stream.of(scores).forEach(i->System.out.println(Arrays.toString(i)));
        System.out.println("-----------------------------------");
        IntStream.of(scores).forEach(i -> System.out.println(i));
        System.out.println("-----------------------------------");
        IntStream.of(scores).forEach(System.out::println);
        
    }
    
}
