package com.ocp.day33_executor;

import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Lotto implements Runnable {

    @Override
    public void run() {
        try {
            Thread.sleep(new Random().nextInt(100));
            int num = new Random().nextInt(100);
            System.out.print(num + " ");
        } catch (Exception e) {
        }
    }
}

public class ThreadPoolExecutorDemo {
    public static void main(String[] args) {
        System.out.println("請給我10組 Lotto 數字");
        //CachedThreadPool 當工作太多 系統會自動建立新的執行緒來幫助系統執行
        //以工作長度 系統會決定建立多少執行緒來幫忙工作 (容易建立多餘空間)
        //ExecutorService service = Executors.newCachedThreadPool();
        
        //newFixedThreadPool(10)設定執行緒數量 10= 最多10條執行緒
        //Threadcount 顯示會是11 因為設定10條 還會多一條main執行緒 10+1
        ExecutorService service = Executors.newFixedThreadPool(10);
        
        for (int i = 1; i <= 100; i++) {
            service.submit(new Lotto());
        }
        System.out.printf("Threat count : %d\n",Thread.activeCount());
        //如果沒有給 shoutdown 程式不會停止
        //執行緒會待機 等待其他任務繼續執行
        service.shutdown();
    }
}
