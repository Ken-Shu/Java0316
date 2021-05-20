
package com.ocp.day28;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionDemo1 {
    public static void main(String[] args) {
       play();
    }
    public static void play (){
         System.out.print("請輸入圓半徑 : ");
         Scanner sc = new Scanner(System.in);
        try {  
        double r = sc.nextDouble();
        double area = Math.pow(r, 2)*Math.PI;
        System.out.printf("Area : %.2f\n",area);
        //錯誤處理要對症下藥 不能亂寫
        } catch (InputMismatchException e) {
            System.out.println("錯誤內容 : "+e);
            e.printStackTrace();
        }
        
    }
}
