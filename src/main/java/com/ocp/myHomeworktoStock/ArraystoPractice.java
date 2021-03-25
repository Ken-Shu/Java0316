
package com.ocp.myHomeworktoStock;

import java.util.Arrays;

public class ArraystoPractice {
    String name;
    int num;

    public ArraystoPractice(String name, int num) {
        this.name = name;
        this.num = num;
    }
    
    
    
    public static void main(String[] args) {
        int [] a1 = {1,2,3};
        String [] s1 = {"A","B","C"};
        System.out.println(Arrays.toString(a1));
        System.out.println(Arrays.toString(s1));
        ArraystoPractice[] ap = new ArraystoPractice[5];
        for (int i = 0; i<ap.length;i++) {
            try {
                ArraystoPractice  aps = new ArraystoPractice(s1[i],a1[i]);
            ap[i]=aps;
            System.out.println(ap[i].name);
            } catch (Exception e) {
            }
            
        }
    }
    
}
