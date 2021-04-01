package com.ocp.day08;

public class MultaiArrayDemo4 {

    public static void main(String[] args) {
        double[][] hw = {{170, 160,180} , {60,45,90}};
        //00 10
        //01 11
        //02 12
       MultaiArrayDemo4 m4 = new MultaiArrayDemo4();
        System.out.println(m4.bmi(hw));
    }
    public double bmi(double [][] hw){
        double bmi = 0;
            for(int i = 0 ; i<hw.length;i++){
                for (int j = 0; j < hw[i].length; j++) {
                    double weight = hw[1][j];
                    double height = hw[0][j];
                    bmi = weight/Math.pow(height/100, 2);   
                }
                
            }  
            
        return bmi;
    }
}