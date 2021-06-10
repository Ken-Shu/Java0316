
package com.ocp.day30_thread;

import java.text.DecimalFormat;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;
import yahoofinance.*;

/*
利用 Callable 與 YahooFinance api 取得 台積電最新報價
台積電代號 2330.TW
*/

class Conpany implements Callable<Double>{
private String symbol;

    public Conpany(String symbol) {
        this.symbol = symbol;
    }
    @Override
    public Double call() throws Exception {
        Stock stock = YahooFinance.get(symbol);
        double price = stock.getQuote().getPrice().doubleValue();
        return price;
    }
}

public class CallabelDemo2 {
    public static void main(String[] args)throws Exception{
        //假設欲購買台積電1500股 請問交易成本要多少?
        int amount = 1500; // 股
//        String country = ".TW";
//        int symbol = 2330;
//        //固定格式
//        String stocknumber = new DecimalFormat("0000").format(symbol);
//        String number = stocknumber.concat(country);
        String number = "2330.TW";
        
        Conpany c = new Conpany(number);
        //用來包裝 Callable 的 才能用來丟給執行緒作執行
        FutureTask<Double> task = new FutureTask<>(c);
        new Thread(task).start();
        
        double rate = task.get();
        
        double money = (rate*amount)+(rate*amount)*0.001425;
        System.out.printf("交易成本: %,.2f",money);
    }
    
}
