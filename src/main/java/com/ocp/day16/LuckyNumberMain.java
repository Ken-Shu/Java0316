
package com.ocp.day16;

import java.util.Random;

public class LuckyNumberMain {
    public static void main(String[] args) {
        //利用Lambda 實作一個可以得到1~9的功能
//        Random r= new Random();
//        LuckyNumber l= () -> r.nextInt(9)+1;
         LuckyNumber l= () -> new Random().nextInt(9)+1;
        System.out.println(l.get());
        //利用 Lambda 實作得到1~49
        //Lanbda 方法實作 若用大括號 則須加上 return
        LuckyNumber num = ()->{
          return new Random().nextInt(49)+1;
        };
        System.out.println(num.get());
    }
    
}
