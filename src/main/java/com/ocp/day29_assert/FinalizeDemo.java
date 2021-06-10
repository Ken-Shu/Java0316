
package com.ocp.day29_assert;

//main -> 主執行緒 Finalizer -> 終結者執行緒
class Ball{
    public Ball(){
        String tname = Thread.currentThread().getName();
        System.out.println("Ball 建立 棒球"+tname);
    }
    //商業邏輯
    void paly(){
        String tname = Thread.currentThread().getName();
        System.out.println("打棒球"+tname);
    }
    //Finalize 物件被吞噬之前的動作
    @Override
    protected void finalize() throws Throwable {
        String tname = Thread.currentThread().getName();
        System.out.println("Ball 消失了"+tname);
    }
}
public class FinalizeDemo {
    public static void main(String[] args) {
    Ball b = new Ball();
    b.paly();
    b = null;
    System.gc();
    }
    
}
