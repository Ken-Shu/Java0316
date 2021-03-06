
package com.ocp.day26;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MapGroupingByDemo {
    public static void main(String[] args) {
        List<String > names =  new ArrayList<>();
        names.add("apple");
        names.add("banana");
        names.add("apple");
        names.add("apple");
        names.add("orange");
        names.add("papaya");
        names.add("banana");
        // apple : 3  banana : 3 orange : 1 papaya : 1
        //分組
         System.out.println(
                 //collectors 收集 groupingBy(A,B)輸入(A) 得到(B)
                 //Function.identity() 名稱相同時 counting()計算總量 
        names.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting() ))
      //names.stream().collect(Collectors.groupingBy(name -> name , Collectors.counting())
   );
     //{papaya=1, orange=1, banana=2, apple=3} = Map <String , Long>
     Map<String , Long> result = names.stream()
             .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
             System.out.println(result);
    }
    
}
