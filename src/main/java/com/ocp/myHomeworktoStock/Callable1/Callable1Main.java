
package com.ocp.myHomeworktoStock.Callable1;

import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;


public class Callable1Main {
    public static void main(String[] args) {
        //callable 物件 必須轉成 Future 後
        //才可丟入 Thread 內 啟用
        Callable<Integer> ca = new CallableToTest1();
        FutureTask<Integer> f1 =new FutureTask<Integer>(ca);
        Thread t1 = new Thread(f1);
        t1.start();
    }
    
}
