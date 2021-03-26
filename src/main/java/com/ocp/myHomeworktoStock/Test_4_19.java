
package com.ocp.myHomeworktoStock;

public class Test_4_19 {
    public static void main(String[] args) {
        String [][] sss =new String [2][];
        sss[0] = new String [2];
        sss[1] = new String [6];
        int x = 96;
        for (int i = 0; i < sss.length; i++) {
            for (int j = 0; j < sss.length; j++) {
                sss[i][j] = ""+x;
                x++;
            }
        }
        for (String[]strArr : sss) {
            for (String s : strArr) {
                System.out.print(s+ " ");
            }
            System.out.println();
        }
    }
    
}
