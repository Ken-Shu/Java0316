
package com.ocp.day26;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.IntSummaryStatistics;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class MapDemo2 {
    public static void main(String[] args) {
        //考試科目 : 國文 英文 數學 -> Set
        //考試成績 : 100  90  100 -> List 
        //HashMap 是按照 Key 值得 HashCode 來排列
        //LinkedHashMap 是按照 集合的擺放順序來排列
        Map<String , Integer> exams = new LinkedHashMap<>();
        exams.put("國文", 100); //("國文", 100) -> 成為 Entry(含有 key , value) 
        exams.put("英文", 90);
        //在map 裡面 若有相同 key 值 則後方的 value 會覆蓋掉前方的值
        exams.put("數學", 100);
        System.out.println(exams);
        //有很多的 entry 我們稱為 entry set
        //Java8
        exams.entrySet().forEach(entry -> System.out.println(entry.getKey()));
        
        exams.entrySet().forEach(entry -> System.out.println(entry.getValue()));
        
        IntSummaryStatistics stat = exams.entrySet().stream().mapToInt(entry -> 
                entry.getValue())
                .summaryStatistics();
                System.out.println("總分: "+stat.getSum());
                System.out.println("平均: "+  stat.getAverage());
    }
}
