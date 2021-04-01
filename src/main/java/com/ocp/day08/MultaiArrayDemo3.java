package com.ocp.day08;

public class MultaiArrayDemo3 {

    public static void main(String[] args) {
        double[][] hw = {{170, 60}, {160, 45}, {180, 90}};
        //求三人的BMI
        MultaiArrayDemo3 m3 = new MultaiArrayDemo3();
        
        System.out.println(m3.bmi(hw));
    }

    public double bmi(double[][] h) {
        double bmi = 0;
        for(double []x : h){
            double height = x[0];
            double weight = x[1];
            bmi = weight/Math.pow(height/100, 2);
        } 
//        for (int i = 0; i < h.length; i++) {
//            for (int j = 0; j < h[i].length; j++) {
//                bmi = h[i] / Math.pow(h[i][j] / 100, 2.0);
//            }
//        }
return bmi;
    }
}