package com.ocp.day23Set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetDemo1 {

    public static void main(String[] args) {
        //LinkdeHashSet 按順序擺放
        //HashSet 按照 HashCode 擺放 (隨機放)
        //集合裡面只能放物件型的資料
        Set subjects = new LinkedHashSet();
        subjects.add("國"); // String
        subjects.add("英");
        subjects.add(100); //Integer
        subjects.add("數");
        subjects.add(null); // null
        System.out.println(subjects);
        //走訪每一個元素
        //取的subjects 的 走訪器 iterator
        Iterator iter = subjects.iterator();
        while (iter.hasNext()) {
            Object next = iter.next();
            //System.out.println(next+ " , "+iter.hasNext());
            if (next == null) {
                iter.remove();
                continue;
            }
            if (next instanceof Integer) {
                iter.remove();
            }
        }
        System.out.println(subjects);
    }
}
