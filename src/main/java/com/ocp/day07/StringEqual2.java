
package com.ocp.day07;

public class StringEqual2 {
    public static void main(String[] args) {
        String s1 = new String("Java");
        String s2 ="Java";
        System.out.println(s1 == s2 );
        System.out.println(s1.equals(s2));
        
        //將s1 放入 String pool 中
        //s1.intern 放入 String pool中
        s1 = s1.intern();
        System.out.println(s1 == s2);
        String s3 = "JAvA";
        //equals 大小寫也會比較
        System.out.println(s2.equals(s3));
        //equalsIgnoreCase 不分大小寫比較
        System.out.println(s2.equalsIgnoreCase(s3));
    }
}
