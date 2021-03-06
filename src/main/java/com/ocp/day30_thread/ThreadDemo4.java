
package com.ocp.day30_thread;

//UserThread 與 DaemonThread
public class ThreadDemo4 {
    public static void main(String[] args) {
     Runnable r = () -> {
         String name = Thread.currentThread().getName();
         for (int i = 1; i < 1000; i++) {
             System.out.printf("%s 跑了 %d 步\n",name , i);
         }
         System.out.printf("%s 工作完成 \n",Thread.currentThread().getName());
     };
        Thread t1  = new Thread(r, "T1");
        //t1.setName("T1");
        Thread t2  = new Thread(r, "T2");
        //t2.setName("T2");
        //t1.setDaemon 設定成 背景執行緒
        t1.setDaemon(true);
       
         
        t1.start();
        t2.start();
        
    }
    
}
