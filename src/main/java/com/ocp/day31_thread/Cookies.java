
package com.ocp.day31_thread;

public class Cookies {
    private boolean empty = true; // 盤子
    
    public synchronized void eat (int i){
        while(empty == true){ //盤子是空的
            try {
                wait(); //小狗就等待
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        //小狗開始吃
        System.out.printf("小狗吃了第 %d 餅乾\n",i);
        //吃完之後
        empty = true; //盤子變空
        notifyAll(); //呼叫主人
    }
    public synchronized void put (int i){
        while(empty == false){ //盤子不是空的
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        //主人放飯
        System.out.printf("主人放了第 %d 餅乾\n",i);
        //主人放飯完之後
        empty = false; // 盤子就不是空的
        notifyAll(); //呼叫小狗
    }
}
