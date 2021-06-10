
package com.ocp.day28;

public class ExceptionDemo3 {
    public static void main(String[] args) {
        int [] nums = null;
        try {
             int avg = nums[0]/nums[1];
        //ArithmeticException   {10,0}
        //ArrayIndexOutOfBoundsException   {10}
        //NullPointerException   null
            System.out.println(avg);
        } catch (ArithmeticException e) {
            System.out.println("數學錯誤 錯誤原因 :"+e);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("陣列維度不足錯誤 錯誤原因 :"+e);
        }   catch (NullPointerException e) {
            System.out.println("陣列實體沒有建立 錯誤原因 :"+e);
        }
       
    }
    
}
