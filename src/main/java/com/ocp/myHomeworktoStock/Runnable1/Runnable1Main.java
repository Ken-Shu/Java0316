
package com.ocp.myHomeworktoStock.Runnable1;

public class Runnable1Main {
    public static void main(String[] args) {
        RunnableToTest1 r1 = new RunnableToTest1();
        Thread t1 = new Thread(r1);
        t1.start();
        
    }
}
