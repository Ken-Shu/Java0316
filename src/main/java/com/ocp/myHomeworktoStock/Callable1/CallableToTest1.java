
package com.ocp.myHomeworktoStock.Callable1;

import java.util.concurrent.Callable;

public class CallableToTest1 implements Callable{

    @Override
    public Object call() throws Exception {
        int x = 10;
        for (int i = 0; i < 10; i++) {
        x = 10+i;
            System.out.println(x);
        }
        return x;
    }
    
}
