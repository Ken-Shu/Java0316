
package com.lab;

import java.util.stream.IntStream;
import java.util.stream.Stream;


public class Java8Study2 {
    public static void main(String[] args) {
     int [] scores = {80,50,70,90,40};
     //印出及格的分數
     //java 7
        for (int i = 0; i < scores.length; i++) { // forEach
            if(scores[i]<=60){ //過濾 filter
                continue;
            }else {
                System.out.println(scores[i]);
            }
        }
        System.out.println("------------------------");
        
        //java 8 
        IntStream.of(scores)
                .forEach(System.out::println);
        
        System.out.println("------------------------");
        
        IntStream.of(scores)
                .filter(i -> i>=60)
                .forEach(System.out::println);
    }
    
}
