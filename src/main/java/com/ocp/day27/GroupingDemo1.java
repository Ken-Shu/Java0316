package com.ocp.day27;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class GroupingDemo1 {

    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("apple");
        names.add("banana");
        names.add("apple");
        names.add("apple");
        names.add("orange");
        names.add("papaya");
        names.add("banana");
        System.out.println(names);
        //每一種水果出現的次數
        Map<String, Long> result = names.stream()
                .collect(Collectors
                        //分組 indentity 並計算 counting
                        .groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(result);
        
        //(Value) 由 大 到 小 排序
        result.entrySet()
                .stream()
                //comparingByValue 只比較裡面的內容Value
                //Map 裡面的 Entry 的 Value
                .sorted(Map.Entry.<String,Long>comparingByValue().reversed())
                .forEach(System.out::println);
        
        //(Value) 大 -> 小 列出並放在 finalMap 裡面
        Map<String , Long> finalMap = new LinkedHashMap<>();
        result.entrySet()
                .stream()
                .sorted(Map.Entry.<String , Long>comparingByValue().reversed())
                //把讀到的每個 entry 放入 finalMap 裡面 透過 Key Value
                .forEachOrdered(entry -> finalMap.put(entry.getKey(),entry.getValue()));
        System.out.println("finalMap"+finalMap);
    }

}
