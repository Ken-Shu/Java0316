
package com.ocp.day23Set;

import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class SetDemo7 {
    public static void main(String[] args) {
        //子集合
        //依據前方宣告型別 來決定後方API的使用
        TreeSet<Integer> data = new TreeSet<>();
        data.add(2);
        data.add(4);
        data.add(5);
        data.add(8);
        System.out.println(data);
        //SortedSet API 定義 (x , y) 包含x 不包含y
        Set<Integer> sub = data.subSet(2,8);
        System.out.println(sub);
        //TreeSet API定義 (x , 是否包含 , y , 是否包含)
        Set<Integer> sub2 = data.subSet(2, true, 8, true);
        System.out.println(sub);
    }
    
}
