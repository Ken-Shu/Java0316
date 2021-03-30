
package com.ocp.day07;

public class StringReplaceDemo {
    public static void main(String[] args) {
        String s1 = "Jbvb";
        String s2 = "Java";
        //如果前方沒使用 s1 = 記憶體空間
        //會另外開啟一個空間放入改變後的結果
        //若沒有給值 他就只會放在那 沒人使用
        s1 = s1.replace('b', 'a');
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));
    }
    
}
