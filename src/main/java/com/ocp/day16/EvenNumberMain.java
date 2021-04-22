
package com.ocp.day16;

public class EvenNumberMain {
    public static void main(String[] args) {
        //n = 50 是否是偶數
        EvenNumber ev = (n)-> n%2 == 0;
        System.out.println(ev.iseven(50));
        
    }
    
}
