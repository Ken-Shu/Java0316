
package com.ocp.day35;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class PlayLotto2 {
    public static void main(String[] args) throws Exception{
        System.out.println("準備開獎");
        //newCackedThreadPool 如果現在沒有執行緒 他會自己開啟
        //newFixedThreadPool(x) x = 自己設定要使用的執行緒
        ExecutorService service = Executors.newFixedThreadPool(4);
        Collection<Callable<Lotto>> list = new ArrayList<>();
        list.add(new LottoMachine(1));
        list.add(new LottoMachine(2));
        list.add(new LottoMachine(3));
        list.add(new LottoMachine(4));
        list.add(new LottoMachine(5));
        System.out.println("開始搖獎");
         Lotto lotto =service.invokeAny(list);
         System.out.println("唱明獎號");
        System.out.println(lotto);
         service.shutdown();
         System.out.println("開獎結束");
    }
    
}
