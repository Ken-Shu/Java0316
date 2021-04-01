package com.ocp.day08;

public class MultaiArrayDemo4 {

    public static void main(String[] args) {
        double[][] hw = {{170, 160,180} , {60,45,90}};
       MultaiArrayDemo4 m4 = new MultaiArrayDemo4();
        System.out.println(m4.bmi(hw));
    }
    public double bmi(double [][] hw){
        double bmi = 0;
        for (double [] h : hw) {
            double height = h[0];
            
            
            //bmi = weight/Math.pow(height/100, 2);
            
        }
        return bmi;
    }
}