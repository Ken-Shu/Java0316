package com.ocp.day34;

import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

public class SchedulerSingleThreadDemo  {

    public static void main(String[] args)  throws Exception{
        System.out.println("工作開始");
        //匯款
        Callable<Integer> callable = () -> {
            int amount = new Random().nextInt(10000);
            System.out.printf("匯款 %d 元\n", amount);
            return amount;
        };
        //單一排程
        ScheduledExecutorService service = Executors.newSingleThreadScheduledExecutor();
        //丟入 callable 等 3 秒
        ScheduledFuture future = service.schedule(callable, 3, TimeUnit.SECONDS);
        System.out.printf("匯款 %d 元 完成 \n" ,future.get());
        
        service.shutdown();
    }
}
