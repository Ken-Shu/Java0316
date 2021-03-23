
package com.ocp.day04;

import  com.ocp.day04.bar.*;

public class AccessMoney {
    public static void main(String[] args) {
        Money m1 = new Money();
        System.out.println(m1.amount);
        //(全名宣告)當名稱重複時 若要呼叫則必須打出完整名稱
        com.ocp.day04.foo.Money m2 = new com.ocp.day04.foo.Money();
        System.out.println(m2.amount);
        
        System.out.println(m1.amount + m2.amount);
    }
    
}
