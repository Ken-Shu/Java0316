package com.ocp.day28;

/*
Checkec Exception: 受檢例外 就是必須要用 try catch
方法的受檢例外 一定 要再方法的第一行 拋出 thrown Exception
UnChecked Exception:非受檢例外
在RuntimeException 就不用 thrown
 */
public class CheckedAndUnCheckException {

    public static void main(String[] args) {
        /*
    UnCkecked Exception : 非受檢例外
    一遇到不是立即停止程式就是程式碼不夠堅固
    立即停止 : Error
    程式碼不夠堅固 : RuntimeException
         */
        int x = 10;
        int y = 0;
        if (y != 0) { //避免數學錯誤的發生
            int avg = x / y;
            System.out.println(avg);
        }
        int [] nums = {};
        if(nums != null){ //避免 NullPointerException
            if(nums.length > 0){ //避免 ArrayIndexOutOfBoundsException
        System.out.println(nums[0]);
            }
        }
    }
}
