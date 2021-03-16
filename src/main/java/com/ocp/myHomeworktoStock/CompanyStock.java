
package com.ocp.myHomeworktoStock;

import java.util.Date;
import java.util.concurrent.FutureTask;
import yahoofinance.Stock;


public class CompanyStock {
    /*
 *primary key(id); 
 *公司名稱 VARCHAR (10);
 *成交價 DECIMAL(10);
 *漲跌 DECIMAL(10);
 *漲跌幅 DECIMAL(10);
 *最高 DECIMAL(10);
 *最低 DECIMAL(10);
*/  
    Date date = new Date();
   
    String symbol;
    
    //公司名稱
     public String companyNumber(String number) throws Exception{
         this.symbol=number;
        Service service = new Service(this.symbol);
        FutureTask<Stock> task = new FutureTask<>(service);
        new Thread(task).start();
        Stock stock = task.get();
        String name = stock.getName();
        return name;
    }
     //公司股價
     public double companyStock() throws Exception{       
         Service service = new Service(this.symbol);
         FutureTask<Stock> task  = new FutureTask<>(service);
         new Thread(task).start();
         Stock stock = task.get();
         double stockprice =stock.getQuote().getPrice().doubleValue();
         return stockprice;
     }
     //公司漲幅
     public double companyChange() throws Exception{
         Service service = new Service(this.symbol);
         FutureTask<Stock> task = new FutureTask<>(service);
         new Thread(task).start();
         Stock stock = task.get();
         double stockchange = stock.getQuote().getChange().doubleValue();
         return stockchange;         
     }
//     public double company() throws Exception{
//         Service service = new Service(this.symbol);
//         FutureTask<Stock> task = new FutureTask<>(service);
//         new Thread(task).start();
//         Stock stock = task.get();
//         return ;
//     }
}