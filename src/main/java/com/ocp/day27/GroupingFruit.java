package com.ocp.day27;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class GroupingFruit {

    public static void main(String[] args) {
        List<Fruit> fruits = Arrays.asList(
                new Fruit("蘋果", 10, 9.99),
                new Fruit("香蕉", 20, 19.99),
                new Fruit("柳丁", 10, 29.99),
                new Fruit("西瓜", 10, 29.99),
                new Fruit("木瓜", 20, 9.99),
                new Fruit("蘋果", 10, 9.99),
                new Fruit("香蕉", 10, 19.99),
                new Fruit("蘋果", 20, 9.99)
        );
        System.out.println(fruits);
        //分組
        //蘋果 = 3 香蕉 = 2 柳丁 = 1 西瓜 = 1 木瓜 = 1 
        Map<String , Long> result = fruits.stream()
                        .collect(Collectors.groupingBy(fruit -> fruit.getName(), Collectors.counting()));
        System.out.println("result"+result);
        //排序
        result.entrySet().stream().sorted(Map.Entry.<String , Long>comparingByValue().reversed())
               .forEach(System.out::print);
        
        
        System.out.println("");
        
        //分組 by name
        //Groupingby + Sum qty
        //{蘋果=40, 柳丁=10, 香蕉=30, 木瓜=20, 西瓜=10}
        //counting()個數
        Map <String , Integer> result2 = fruits
                .stream()
                .collect(Collectors.groupingBy(Fruit::getName, Collectors.summingInt(Fruit::getQty)));
        //{蘋果=40, 柳丁=10, 香蕉=30, 木瓜=20, 西瓜=10}
        System.out.println("result2"+result2);
        
        //分組 by price
        //{29.99=[柳丁, 西瓜], 9.99=[蘋果, 木瓜], 19.99=[香蕉]}
        System.out.println(
                //mapping 轉換成 getname 然後使用 toSet 因為讓資料不要重複
        fruits.stream()
                .collect(Collectors.groupingBy(Fruit::getPrice,
                        Collectors.mapping(Fruit::getName, Collectors.toSet())))
        );
         
        Map<Double , Set<String>> result4 =fruits.stream()
                .collect(Collectors.groupingBy(Fruit::getPrice,
                        Collectors.mapping(Fruit::getName, Collectors.toSet())));
        //{29.99=[柳丁, 西瓜], 9.99=[蘋果, 木瓜], 19.99=[香蕉]}
        System.out.println("result4"+result4);
    }

}
