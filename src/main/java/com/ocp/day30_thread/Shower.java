package com.ocp.day30_thread;

public class Shower {
    public static void main(String[] args) {
        FatherThread father = new FatherThread();     
        father.start();
    }
}

class WorkerThread extends Thread { //瓦斯工人執行緒

    @Override
    public void run() {
        System.out.println("瓦斯工人開始送瓦斯");
        for (int i = 1; i <= 5; i++) { //模擬送瓦斯的時間
            System.out.printf("%d 秒鐘 \n", i);
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                System.out.println("發生意外 : "+e);
            }
        }
         System.out.println("瓦斯工人將瓦斯送到府");
    }
}

class FatherThread extends Thread { //爸爸執行緒

    @Override
    public void run() {
        System.out.println("爸爸下班回家");
        System.out.println("爸爸準備洗澡");
        System.out.println("爸爸發現沒有瓦斯");
        System.out.println("爸爸打電話請瓦斯工人送瓦斯");
        
        //讓予Thread.yield();
        WorkerThread worker = new WorkerThread();
        worker.start();
       
        try {
            //等 worker 做完之後 再繼續做
            //也可以在後方設定 等待時間
            worker.join(10_0000); 
        } catch (Exception e) {
        }
//         try {
//            Thread.sleep(6000);
//        } catch (Exception e) {
//        }
        
        System.out.println("爸爸開始洗澡");
        System.out.println("爸爸洗完澡了");
    }

}
