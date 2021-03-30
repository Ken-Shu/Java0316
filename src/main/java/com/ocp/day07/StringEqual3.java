
package com.ocp.day07;

public class StringEqual3 {
    public static void main(String[] args) {
        //s1 s2 原本在 String pool 內
        String s1 = "Java";
        String s2 = "Java";
        System.out.println(s1 == s2);
        //因為 8 的關西 原本在 String pool 內的東西變到外面了
        s1 = s1 + "8" ;
        s2 = s2.concat("8"); //相當於 s2 + "8"
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s1 == s2);
        //所以這時候要再重新將 s1 s2 放入 String pool 內
        System.out.println(s1.intern() == s2.intern());
    }
}
