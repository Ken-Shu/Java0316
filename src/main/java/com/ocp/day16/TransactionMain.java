
package com.ocp.day16;

public class TransactionMain {
    public static void main(String[] args) {
        //amount = 10 price = 35
        Transaction tr = (amount , price)->System.out.printf("總金額:%d\n",amount*price);
        tr.print(10, 35);
    }
    
}
