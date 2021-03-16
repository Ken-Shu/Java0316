
package com.ocp.myHomeworktoStock;

import java.util.concurrent.Callable;
import yahoofinance.Stock;
import yahoofinance.YahooFinance;


//將資料從API內下載 再匯入IO
public class Service implements Callable<Stock>{

    private String symbol;
    public Service(String symble){
        this.symbol = symble;
    }
      @Override
    public Stock call() throws Exception {
         Stock stock = YahooFinance.get(symbol);
         return stock;
    }
    
}