
package com.ocp.day26;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MapGroupingByDemo2 {
    public static void main(String[] args) {
        //1~9 取 100 次 每一個號碼個出現幾次
        Random r = new Random();
        List<Integer> number = new  ArrayList<>();
        for (int i = 0; i <= 100 ; i++) {
            number.add(r.nextInt(9)+1);
        }
        Map<Integer , Long> result = number.stream()
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        System.out.println(result);
//        System.err.println(
//            number.stream()
//           .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
//       );
    }
    
}
