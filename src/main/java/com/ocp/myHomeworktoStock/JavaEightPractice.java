
package com.ocp.myHomeworktoStock;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class JavaEightPractice {
    public static void main(String[] args) {
        
        List<String> items = Arrays.asList(
        "蘋果","蘋果","香蕉","蘋果","柳丁","香蕉","椰子");
     
        System.out.println(
        items.stream().collect(Collectors.groupingBy(Function.identity()))
        );
        
      
        //{蘋果=3, 柳丁=1, 香蕉=2, 椰子=1}
        //{1=[柳丁，椰子],2=香蕉 , 3=蘋果}
                
       
    }
    
}
