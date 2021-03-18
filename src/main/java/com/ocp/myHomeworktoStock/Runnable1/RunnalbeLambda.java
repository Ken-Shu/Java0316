
package com.ocp.myHomeworktoStock.Runnable1;

public class RunnalbeLambda implements Runnable{

    @Override
    public void run() {
        Runnable runnble =()->System.out.println("run me");
        runnble.run();
    }
    
}
