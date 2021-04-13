
package com.ocp.myHomeworktoStock;

public class Stock {
    public static void main(String[] args) {
       long stockallmoney = 5000000000l;
       long amount = stockallmoney/10000;
       //股本國巨
        System.out.println(amount);
        //一天正常成交量
        int count = (int)amount/100;
        System.out.println(count);
        //股本杰力
        long stockall = 355000000l;
        long amount2 = stockall/10000;
        System.out.println(amount2);
        //一天正常交易量
        int count2 = (int)amount2/100;
        System.out.println(count2);
        
    }
    
}
