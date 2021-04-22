
package com.ocp.day16;

import java.util.function.Function;

public class AreaCalc2 {
    public static void main(String[] args) {
//        //利用匿名內部類別來實作
//        CircleArea ca = new CircleArea() {
//            @Override
//            public double getArea(double r) {
//                return Math.pow(r, 2) * Math.PI;
//            }
//        };
        //利用 Lanbda 語法來實作
        //Lanbda   (double r ) 方法參數列 -> 方法實作  
        CircleArea ca2 = (double r) -> Math.pow(r, 2) * Math.PI;
        CircleArea ca3 = (r) -> 4.0/3 *Math.pow(r, 3) * Math.PI;
        System.out.println(ca2.getArea(15));
        System.out.println(ca3.getArea(15));
    }
}
