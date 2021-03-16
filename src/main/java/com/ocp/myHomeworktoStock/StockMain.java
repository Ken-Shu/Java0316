
package com.ocp.myHomeworktoStock;


import java.text.DecimalFormat;


public class StockMain {

    //從maven 抓取資料
    public static void main(String[] args)  {
        CompanyStock companyStock = new CompanyStock();        
        String country = ".TW";
        String stringnum = "2330";       
        for (int i = 0; i < 10000; i++) {
            int number = Integer.valueOf(stringnum) + i;
            //DecimalFormat 固定格式為 "0000" 4碼
            String num = new DecimalFormat("0000").format(number);
            if (num == null) {
                //如果num 為空 跳過
                continue;
            } else if (num != null) {
                //將 num 後方接上 country 然後給s空值 丟入try/catch              
                String get = num.concat(country);
                String s = "";
                try {
                    s = companyStock.companyNumber(get);
                    double price = companyStock.companyStock();
                double change = companyStock.companyChange();
                System.out.printf("股票編號: %s 公司名稱:%s 股價:%.2f 漲幅:%.2f\n", num, s, price, change);
                } catch (Exception e) {                   
                }                
            }
        }

    }
}