package com.ocp.day28;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.DateFormat;
import java.text.ParseException;
import java.util.Date;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import jdk.nashorn.internal.runtime.ECMAException;

public class ExceptionDemo8 {

    public static void main(String[] args) {
        System.out.println(login("admin", "1234"));
        System.out.println(login("admin", "5678"));
        System.out.println(login("guest", "1234"));
        System.out.println(login("guest", "5678"));
        
        try {
            System.out.println(login2("guest", "5678"));
        } catch (Exception ex) {
            System.out.println("登入失敗原因 : "+ex.getMessage());
        }
    }

    public static boolean login2(String username , String passwore)throws Exception{
        //驗證 username
        if(!username.equals("admin")){
            Exception e = new Exception("使用者名稱錯誤");
            throw e;
        }
        if(!passwore.endsWith("1234")){
            Exception e = new Exception("使用者密碼錯誤");
            throw e;
        }
        return true;
    }
    
    public static boolean login(String username, String password) {
        if (username.equals("admin") && password.equals("1234")) {
            return true;
        }
        return false;
    }
}
