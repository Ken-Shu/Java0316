package com.lab;

import java.util.stream.Stream;

public class Java8Study7 {

    public static void main(String[] args) {
        String [][] names = {{"Jo","Mary"},{"John","Helen"},{"Bob"}};
        //求所有字母總和 flatMap(扁平陣列)可以將二維陣列做成一維 
        int sum = Stream.of(names)
                //flatMap 拿到第一個字串的陣列[0][0]
                //再將第一個陣列的物件 同樣轉成串流
                .flatMap(s -> Stream.of(s))
                .mapToInt(String::length)
                .sum();
        System.out.println(sum);
    }
}
