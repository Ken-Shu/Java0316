
package com.ocp.day02.BMI;

public class BMICase3 {
    public static void main(String[] args) {
        BMI b1 = new BMI();
        //建構子
        b1.getBMIValue( "小明",170, 50);
        b1.print();
        BMI b2 = new BMI();
        b2.getBMIValue("小英", 150 , 40);
        b2.print();
    }
    
}
