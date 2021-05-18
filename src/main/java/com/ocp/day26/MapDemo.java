
package com.ocp.day26;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class MapDemo {
    public static void main(String[] args) {
        //考試科目 : 國文 英文 數學 -> Set
        //考試成績 : 100  90  100 -> List 
        //HashMap 是按照 Key 值得 HashCode 來排列
        //LinkedHashMap 是按照 集合的擺放順序來排列
        Map<String , Integer> exams = new LinkedHashMap<>();
        exams.put("國文", 100);
        exams.put("英文", 90);
        exams.put("數學", 100);
        System.out.println(exams);
        //取得考試科目
        Set<String> subject = exams.keySet();
        System.out.println("考試科目"+ exams.keySet());
        System.out.println("考試科目 : "+subject);
        //取得單一考試成績
        System.out.println(exams.get("國文"));
        //取得所有考試成績
        Collection <Integer> scores = exams.values();
        System.out.println("所有考試成績" + scores);
        List <Integer> scores2 =new ArrayList<>(scores);
        System.out.println(scores2);
        
                
    }
}
