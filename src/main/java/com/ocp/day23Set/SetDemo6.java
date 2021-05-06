
package com.ocp.day23Set;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo6 {
    public static void main(String[] args) {
        Set<Integer> data = new HashSet<>();
        data.add(100);
        data.add(80);
        data.add(90);
        //利用TreeSet 查詢資料
        //利用 HashSet 轉 TreeSet
        data = new TreeSet<>(data);
        System.out.println(data);
    }
    
}
