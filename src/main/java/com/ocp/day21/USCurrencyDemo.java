
package com.ocp.day21;

public class USCurrencyDemo {
    public static void main(String[] args) {
        //1,5,10,25
        USCurrency us = USCurrency.PENNY;
        System.out.println(us.getValue());
        USCurrency usc = USCurrency.NICKLE;
        System.out.println(usc.getValue());
        System.out.println(USCurrency.QUARTER.getValue());
    }
    
}
