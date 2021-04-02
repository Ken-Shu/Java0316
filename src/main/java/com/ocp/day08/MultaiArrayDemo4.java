package com.ocp.day08;

public class MultaiArrayDemo4 {

    public static void main(String[] args) {
        double[][] hw = {{170, 160,180} , {60,45,90}};
        //00 10
        //01 11
        //02 12
       MultaiArrayDemo4 m4 = new MultaiArrayDemo4();
        m4.bmi(hw);
    }
    public double bmi(double [][] hw){
        double bmi = 0;
//            for(int i = 0 ; i<3;i++){              
//                double weight = hw[1][i];
//                double height = hw[0][i];
//                bmi = weight/Math.pow(height/100, 2);                               
//                System.out.printf("%.1f\n",bmi);
//            }
            
                for (int i = 0; i < 3; i++) {
                double weight = hw[1][i];
                double height = hw[0][i];
                bmi = weight/Math.pow(height/100, 2);                               
                System.out.printf("%.1f\n",bmi);
                }
       
        return bmi;
    }
}