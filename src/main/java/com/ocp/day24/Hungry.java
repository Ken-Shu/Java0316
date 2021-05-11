
package com.ocp.day24;

import java.util.Set;

public class Hungry {
    public static void main(String[] args) {
        //在集合內使用複合條件 必須要在建構子下面建構equals 和 hashcode
        DataCenter dc = new DataCenter();
        Set<Food> catalog = dc.getCatalog();
        System.out.println(catalog);
        System.out.println(catalog.size());
    }
    
}
