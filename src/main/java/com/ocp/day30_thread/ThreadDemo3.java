
package com.ocp.day30_thread;
//繼承 Thread
class RunningThread extends Thread{
    
    @Override
    public void run() {
        System.out.println("RunningThread...");
    }
}
// 實作Runnable 介面
class RunningRunnable implements Runnable{

    @Override
    public void run() {
        System.out.println("RunningRunnable...");
    }
    
}

public class ThreadDemo3 {
    public static void main(String[] args) {
        //因為 RunningThread 繼承 Thread 所以他之需要 直接 start
        RunningThread rt = new RunningThread();
        rt.start();
        //RunningRunnalbe 因為他是 Runnalbe 所以他需要丟進去一個 Thread 裡面才能Start
        RunningRunnable rr = new RunningRunnable();
        Thread t = new Thread(rr);
        t.start();
        
        //Java8
        Runnable r = () ->{System.out.println("Runnable...");};
        Thread t2 = new Thread(r);
        t2.start();
    }
    
}
