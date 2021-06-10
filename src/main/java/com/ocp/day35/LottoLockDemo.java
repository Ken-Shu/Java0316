
package com.ocp.day35;

import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.ReentrantLock;

class LottoLock implements Runnable{
    private static final ReentrantLock LOCK = new ReentrantLock();

    @Override
    public void run() {
        try {
            LOCK.lock(); //嘗試鎖定
            //使用鎖定可以讓執行緒一次只進去一個 當一個跑完 其他人才可以再進入執行
            //取的五組 Lotto 號碼
            Random r = new Random();
            for (int i = 0; i <= 5; i++) {
                Thread.sleep(1000);
                int n = r.nextInt(39)+1;
                System.out.printf("%s 得到 %d 組號碼\n",Thread.currentThread().getName(),n);
            }
        } catch (Exception e) {
        }finally{
            LOCK.unlock(); //解鎖
        }
    }
    
}

public class LottoLockDemo {
    public static void main(String[] args) {
        ExecutorService service = Executors.newCachedThreadPool();
        service.execute(new LottoLock());
        service.execute(new LottoLock());
        service.shutdown();
    }
}
