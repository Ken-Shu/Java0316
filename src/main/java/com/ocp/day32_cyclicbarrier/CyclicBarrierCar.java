
package com.ocp.day32_cyclicbarrier;

import java.util.concurrent.CyclicBarrier;

public class CyclicBarrierCar {
    
    public static void main(String[] args) {
    int parties = 2;
    //第一種建法
    //CyclicBarrier cb = new CyclicBarrier(parties);
    //第二種
    //當3個執行序都到時 在執行 r
    Runnable r= ()->{System.out.println("一起吃午餐");};
    CyclicBarrier cb = new CyclicBarrier(parties,r);
    new Car(cb).start();
    new Car(cb).start();
    new Car(cb).start();
    new Car(cb).start();
    
    }
    
}
