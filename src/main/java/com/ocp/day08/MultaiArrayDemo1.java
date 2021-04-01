
package com.ocp.day08;

public class MultaiArrayDemo1 {
    public static void main(String[] args) {
        int [][] m = new int[2][3];
        m[0][0]=100;
        m[0][1]=90;
        m[0][2]=80;
        m[1][0]=70;
        m[1][1]=60;
        m[1][2]=50;
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                System.out.println(m[i][j]);
            }
        }
        System.out.println("------------------------");
         for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println(m[i][j]);
            }
        }
         System.out.println("-----------------------------");
       //改良 for/each
       for(int[] i : m){
           for (int x : i) {
               System.out.println(x);
           }
       }
    }    
}
