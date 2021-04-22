
package com.ocp.day16;

public class BMICalc {
    public static void main(String[] args) {
        //利用 Lanbda 實作 BMI 介面
        //h =170 w = 60
        BMI bmi = (w, h) -> w/Math.pow(h/100, 2);
        System.out.println(bmi.getResult(60, 170));
    }
    
    
}
