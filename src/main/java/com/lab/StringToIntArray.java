
package com.lab;

public class StringToIntArray {
    public static void main(String[] args) {
        //字串轉int 陣列
         String s = "1234";
        int [] numbers = {s.charAt(0)-48,s.charAt(1)-48,s.charAt(2)-48,s.charAt(3)-48};
        System.out.println(numbers[0]);
        System.out.println(numbers[1]);
        System.out.println(numbers[2]);
        System.out.println(numbers[3]);
    }
    
}
