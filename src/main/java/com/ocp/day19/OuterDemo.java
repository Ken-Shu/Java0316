
package com.ocp.day19;

public class OuterDemo {
    public static void main(String[] args) {
        //呼叫一般內部類別
        Outer.Inner in = new Outer().new Inner();
        in.print();
        
        //呼叫靜態內部類別
        Outer.Sinner sin = new Outer.Sinner();
        sin.print();
    }
}
