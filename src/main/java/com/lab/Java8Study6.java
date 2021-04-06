package com.lab;

import java.util.IntSummaryStatistics;
import java.util.stream.Stream;

public class Java8Study6 {

    public static void main(String[] args) {
        String[] names = {"banana", "watermelon", "apple", "orange", "mango"};
        //請求出所有字母的總和 ?
        int name_sum=Stream.of(names).mapToInt(s -> s.length()).sum();
        System.out.println(name_sum);
        //印出所有name長度是偶數的總和
        int name_two = Stream.of(names)
                //.mapToInt(s -> s.length())
                .mapToInt(String::length)
    //呼叫的是 String (String :: length)<-這個長度方法是屬於字串的
                .filter(i -> (i%2)==0).sum();
        System.out.println(name_two);
    }
}
