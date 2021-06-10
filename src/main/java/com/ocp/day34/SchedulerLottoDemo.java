
package com.ocp.day34;

//開獎後每隔 3 秒鐘 開一次講

import java.util.Date;
import java.util.Random;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class SchedulerLottoDemo {
    public static void main(String[] args) {
        Runnable r = ()->{
            int delay = new Random().nextInt(2000);//每次開獎所花費的時間
            try {
                Thread.sleep(delay);
            } catch (Exception e) {
            }
            int n = new Random().nextInt(9)+1;
            System.out.printf("開獎號碼 : %d  搖獎花費時間 : %.1f 開獎時間 : %s\n"
                    ,n,delay/1000.0,new Date());
        };
        ScheduledExecutorService service = Executors.newSingleThreadScheduledExecutor();
        //初始的 delay
        int initDelay = 0; // 0的話就是 立即開獎
        //delay
        int delay = 3 ; //下一次開獎的時間 (EX : 3秒後)
        //開獎後每隔 3 秒開一次獎
        service.scheduleWithFixedDelay(r, initDelay, delay, TimeUnit.SECONDS);
    }
}
