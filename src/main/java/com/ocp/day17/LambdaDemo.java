
package com.ocp.day17;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class LambdaDemo {
    public static void main(String[] args) {
//        int [] scores = {100,50,70,80,30};
//        //int 要用 IntStream 不然單用 Sream 會把 socres 當成物件顯示物件編碼
//        IntStream.of(scores).forEach(System.out::println);
        Stream.of(100,50,70,80,30)
                //peek 可放在中間 用來檢查物件類別
                .peek(x -> System.out.println(x.getClass().getTypeName()))//Consumer
                .forEach(System.out::println);//Consumer
        
        Stream.of(100,50,70,80,30)
                .filter(x -> x>=60) //Predicate
                .forEach(System.out::println);
        
        Stream.of("Marry" , "John","Bob" , "Helen")
                .mapToInt(String::length) //Function
                .forEach(System.out::println); //Consumer
    }
}
    
