
package com.ocp.day16;

public class AreaCalc3 {
    public static void main(String[] args) {
        Triangle t = (h , w) ->  h * w * (1/2.0);
        System.out.println(t.getArea(10, 5));
    }
    
}
