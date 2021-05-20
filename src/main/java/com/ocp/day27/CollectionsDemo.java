
package com.ocp.day27;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CollectionsDemo {
    public static void main(String[] args) {
        List <Integer> nums = new ArrayList<>();
        nums.add(100);
        nums.add(80);
        nums.add(90);
        System.out.println("排序前"+nums);
        //Collections 使用在集合的物件方法
        System.out.println(Collections.max(nums) );
        System.out.println(Collections.min(nums));
        Collections.sort(nums); //自然排序 小->大
        System.out.println("排序後"+nums);
        
        //comparator 比較兩者
        Comparator<Integer> comparator = (o1 , o2) -> o2-o1;
        Collections.sort(nums, comparator);
        //也可以用lamdba 語法來撰寫
        //Collections.sort(nums , (o1 , o2)-> o2 - o1);
        System.out.println("comparator"+nums);
        
        //reverse 相反
        Collections.reverse(nums);
        System.out.println("reverse"+nums);
    }
    
}
