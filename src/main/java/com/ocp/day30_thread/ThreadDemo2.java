
package com.ocp.day30_thread;

class Race implements Runnable{

    @Override
    public void run() {
        String tname = Thread.currentThread().getName();
        for (int i = 1; i <= 1000; i++) {
            System.out.printf("%s 跑了 %d 步\n",tname,i);
        }
    }
}

public class ThreadDemo2 {
    public static void main(String[] args) {
        Thread rabbit = new Thread(new Race(),"兔子");
        Thread turtle = new Thread(new Race());
        turtle.setName("烏龜");
        //getPriority 取得權限 若無設定 都為5
        System.out.println(rabbit.getPriority());
        System.out.println(turtle.getPriority());
        //設定權限 僅能 1~10
        rabbit.setPriority(9);
        turtle.setPriority(1);
         System.out.println(rabbit.getPriority());
        System.out.println(turtle.getPriority());
        
        rabbit.start();
        turtle.start();
        
    }
}
