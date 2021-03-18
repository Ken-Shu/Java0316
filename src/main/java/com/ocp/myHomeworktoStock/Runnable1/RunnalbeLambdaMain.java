
package com.ocp.myHomeworktoStock.Runnable1;

public class RunnalbeLambdaMain {
    public static void main(String[] args) {
        RunnalbeLambda rbl = new RunnalbeLambda();
        Thread t1 = new Thread(rbl);
        t1.start();
    }
    
}
