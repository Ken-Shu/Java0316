package com.ocp.day08;

import java.util.Arrays;
import javax.swing.JOptionPane;

public class MultaiArrayDemo2 {

    public static void main(String[] args) {
        int[][] m = {{100, 90, 80}, {70, 60, 50}};
        //考試: 如果下方有宣告初始值 那麼後方[][]內不能寫入數字
        //int[][] m =new int[][] {{100, 90, 80}, {70, 60, 50}};
        System.out.println(Arrays.toString(m[0]));
        System.out.println(m[1]);
        //求總分
        int sum = 0;
        for (int[] x : m) {
            for (int y : x) {
                sum += y;
            }
        }
        System.out.println("總分: "+sum);
    }
}
